package com.bestselling.predict;

import java.io.InputStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import com.bestselling.predict.datatransferobject.CarDTO;
import com.bestselling.predict.domainvalue.EngineType;
import com.bestselling.predict.domainvalue.ModelType;
import com.bestselling.predict.domainvalue.RCType;
import com.bestselling.predict.domainvalue.TransmissionType;

import weka.classifiers.AbstractClassifier;
import weka.classifiers.trees.RandomTree;
import weka.core.DenseInstance;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;

@Service
public class PredictionModelService {

    Logger logger = LoggerFactory.getLogger(PredictionModelService.class);
    
    public static final String TRAINING_DATA_SET_FILENAME_NAME = "car_data_1.arff";
    public static InputStream TRAINING_DATA_SET_FILE_PATH;
    public static AbstractClassifier classifier;
    public static Instances instances;

    public PredictionModelService() throws Exception {
        InputStream resource11 = PredictionModelService.class.getClassLoader()
                .getResourceAsStream(TRAINING_DATA_SET_FILENAME_NAME);
        TRAINING_DATA_SET_FILE_PATH = resource11;

        createPredictionModel();
    }

    public void createPredictionModel() throws Exception {

        instances = getInstances(TRAINING_DATA_SET_FILE_PATH);
        classifier = applyclassifier(new RandomTree(), instances,
                weka.core.Utils.splitOptions("-K 0 -M 1.0 -V 0.001 -S 1"));
    }

    public AbstractClassifier applyclassifier(AbstractClassifier abstractClassifier, Instances trainingData,
            String[] options) throws Exception {

        abstractClassifier.buildClassifier(trainingData);
        abstractClassifier.setOptions(options);
        abstractClassifier.buildClassifier(trainingData);

        return abstractClassifier;
    }

    public Instances getInstances(InputStream trainingDataSetFile) throws Exception {

        DataSource source = new DataSource(trainingDataSetFile);
        Instances trainingData = source.getDataSet();
        if (trainingData.classIndex() == -1) // by default classIndex is -1
        {
            trainingData.setClassIndex(trainingData.numAttributes() - 1); // We need to setup classIndex to Number
                                                                          // of
        }

        return trainingData;

    }

    public Instance createCarInstance(CarDTO car) {
        Instance instance = new DenseInstance(8);
        instance.setDataset(instances);
        instance.setValue(instances.attribute("kilometers"), car.getKilometers());
        instance.setValue(instances.attribute("owner"), car.getOwner());
        instance.setValue(instances.attribute("engineType"),
                car.getEngineType() != null ? car.getEngineType().name().toLowerCase()
                        : EngineType.PETROL.name().toLowerCase());
        instance.setValue(instances.attribute("rcType"), car.getRcType() != null ? car.getRcType().name().toLowerCase()
                : RCType.INDIVIDUAL.name().toLowerCase());
        instance.setValue(instances.attribute("transmissionType"),
                car.getTransmissionType() != null ? car.getTransmissionType().name().toLowerCase()
                        : TransmissionType.MANUAL.name().toLowerCase());
        instance.setValue(instances.attribute("registrationyear"),
                car.getRegistrationyear() != null ? car.getRegistrationyear().getYear() : 2000);
        instance.setValue(instances.attribute("city"), car.getCity() != null ? car.getCity() : "Bangalore");
        instance.setValue(instances.attribute("Model"),
                car.getModelType() != null ? car.getModelType().name().toUpperCase()
                        : ModelType.LXI.name().toUpperCase());
        return instance;

    }

}

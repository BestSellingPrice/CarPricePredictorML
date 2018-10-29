package com.bestselling.predict.predict;

import com.bestselling.predict.datatransferobject.CarDTO;
import com.bestselling.predict.domainvalue.EngineType;
import com.bestselling.predict.domainvalue.ModelType;
import com.bestselling.predict.domainvalue.RCType;
import com.bestselling.predict.domainvalue.TransmissionType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.ResourceUtils;
import org.springframework.util.StringUtils;
import weka.classifiers.AbstractClassifier;
import weka.classifiers.trees.RandomTree;
import weka.core.DenseInstance;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;

import java.io.File;

public class InputInstance {

    private static final Logger LOGGER = LoggerFactory.getLogger(InputInstance.class);

    private static final String TRAINING_DATA_SET_FILENAME_NUM = "classpath:car_data_1.arff";

    public double createPredictionModel() throws Exception {

        InputInstance inputInstance = new InputInstance();
        final File file = ResourceUtils.getFile(InputInstance.TRAINING_DATA_SET_FILENAME_NUM);
        String arff = file.getAbsolutePath();
        Instances instances = inputInstance.getInstances(arff);
        AbstractClassifier applyclassifier = inputInstance.applyClassifier(new RandomTree(), instances,
                weka.core.Utils.splitOptions("-K 0 -M 1.0 -V 0.001 -S 1"));
        CarDTO car = CarDTO.builder().build();
        Instance carInstance = inputInstance.createCarInstance(instances, car);
        double result = applyclassifier.classifyInstance(carInstance);
        //FIXME : may be "result" is an output parameter ?
        LOGGER.info(String.valueOf(result));
        return result;
    }

    private Instance createCarInstance(Instances instances, CarDTO car) {
        Instance instance = new DenseInstance(8);
        instance.setDataset(instances);
        instance.setValue(instances.attribute("kilometers"), car.getKilometers());
        instance.setValue(instances.attribute("owner"), car.getOwner());
        instance.setValue(instances.attribute("transmissionType"),
                car.getTransmissionType() != null ? car.getTransmissionType().name().toLowerCase()
                        : TransmissionType.MANUAL.name().toLowerCase());
        instance.setValue(instances.attribute("engineType"),
                car.getEngineType() != null ? car.getEngineType().name().toLowerCase()
                        : EngineType.PETROL.name().toLowerCase());
        instance.setValue(instances.attribute("rcType"), car.getRcType() != null ? car.getRcType().name().toLowerCase()
                : RCType.INDIVIDUAL.name().toLowerCase());
        instance.setValue(instances.attribute("registrationyear"),
                car.getRegistrationyear() != null && car.getRegistrationyear().getYear() != 0 ? car.getRegistrationyear().getYear() : 2000);
        instance.setValue(instances.attribute("city"), StringUtils.isEmpty(car.getCity()) ? "Bangalore" : car.getCity());
        instance.setValue(instances.attribute("Model"),
                car.getModelType() != null ? car.getModelType().name().toUpperCase()
                        : ModelType.LXI.name().toUpperCase());
        return instance;

    }

    private AbstractClassifier applyClassifier(AbstractClassifier abstractClassifier, Instances trainingData,
                                              String[] options) throws Exception {

        abstractClassifier.buildClassifier(trainingData);
        abstractClassifier.setOptions(options);
        abstractClassifier.buildClassifier(trainingData);

        return abstractClassifier;
    }

    public Instances getInstances(String trainingDataSetFile) throws Exception {
        DataSource source = new DataSource(trainingDataSetFile);
        Instances trainingData = source.getDataSet();
        if (trainingData.classIndex() == -1) // by default classIndex is -1
        {
            trainingData.setClassIndex(trainingData.numAttributes() - 1); // We need to setup classIndex to Number
                                                                          // of
        }

        return trainingData;

    }
}

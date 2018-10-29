package com.bestselling.predict.predict;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.ResourceUtils;
import weka.core.Instances;

import java.io.File;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;


public class InputInstanceTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(InputInstanceTest.class);

    private InputInstance inputInstance;

    @Before
    public void setUp() throws Exception {
        inputInstance = new InputInstance();
    }

    @After
    public void tearDown() throws Exception {
        inputInstance = null;
    }

    @Test
    public void createPredictionModel() {
        try {
            assertThat("Result is not 2.9", inputInstance.createPredictionModel(), is(2.9));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void applyClassifier() {
    }

    @Test
    public void getInstances() {
        try {
            final File file = ResourceUtils.getFile("classpath:car_data_1.arff");
            String arff = file.getAbsolutePath();
            Instances instances = inputInstance.getInstances(arff);
            assertNotNull(instances);
            assertThat("Size is not 11", instances.size(), is(11));
            assertFalse(instances.get(0).hasMissingValue());
        } catch (Exception e) {
            LOGGER.error(e.getMessage());
        }
    }
}
package com.bestselling.predict.predict;

import org.junit.Test;
import org.springframework.util.ResourceUtils;

import java.io.File;

import static org.junit.Assert.assertEquals;

/**
 * Created by Zomzog on 20/10/2018.
 */
public class InputInstanceTest {

    @Test
    public void createPredictionModel() throws Exception {
        final File file = ResourceUtils.getFile("classpath:car_data_1.arff");
        InputInstance.TRAINING_DATA_SET_FILENAME_NUM = file.getAbsolutePath();
        final double result = InputInstance.createPredictionModel();

        assertEquals(result, 2.9d, 0);
    }
}
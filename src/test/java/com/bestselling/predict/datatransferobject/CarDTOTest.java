package com.bestselling.predict.datatransferobject;

import com.bestselling.predict.domainvalue.EngineType;
import com.bestselling.predict.domainvalue.ModelType;
import com.bestselling.predict.domainvalue.RCType;
import com.bestselling.predict.domainvalue.TransmissionType;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Date;

@RunWith(JUnit4.class)
public class CarDTOTest {

    @Test
    public void testCarDTOBuilder() {
        CarDTO defaultCarDTO = CarDTO.builder().build();
        validateDefaultValues(defaultCarDTO);
    }

    private void validateDefaultValues(CarDTO defaultCarDTO) {
        Assert.assertEquals(RCType.INDIVIDUAL, defaultCarDTO.rcType);
        Assert.assertEquals(EngineType.PETROL, defaultCarDTO.engineType);
        Assert.assertEquals(TransmissionType.MANUAL, defaultCarDTO.transmissionType);
        Assert.assertEquals(new Date(100, 1, 1), defaultCarDTO.registrationyear);
        Assert.assertEquals("Bangalore", defaultCarDTO.city);
        Assert.assertEquals(ModelType.LXI, defaultCarDTO.modelType);
    }
}
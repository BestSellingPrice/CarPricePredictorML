package com.bestselling.predict;

import com.bestselling.predict.datatransferobject.CarDTO;
import com.bestselling.predict.domainvalue.EngineType;
import com.bestselling.predict.domainvalue.ModelType;
import com.bestselling.predict.domainvalue.RCType;
import com.bestselling.predict.domainvalue.TransmissionType;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.Date;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class CarPricePredictControllerTest {

    @Autowired
    private MockMvc mvc;

    @Autowired
    ObjectMapper objectMapper;

    @Test
    public void shouldReturnStatusCreatedWhenPostCarData() throws Exception {
        CarDTO requestBody = buildCardDTO();

        mvc.perform(MockMvcRequestBuilders.post("/v1/cars")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(requestBody)))
                .andExpect(status().isCreated());
    }

    private CarDTO buildCardDTO() {
        CarDTO carDTO = new CarDTO();
        carDTO.setKilometers(2500);
        carDTO.setKilometers(2);
        carDTO.setRcType(RCType.INDIVIDUAL);
        carDTO.setEngineType(EngineType.PETROL);
        carDTO.setTransmissionType(TransmissionType.MANUAL);
        carDTO.setRegistrationyear(new Date(100, 1, 1));
        carDTO.setCity("Bangalore");
        carDTO.setModelType(ModelType.LXI);
        return carDTO;
    }
}
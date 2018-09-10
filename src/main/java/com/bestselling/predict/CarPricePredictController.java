package com.bestselling.predict;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.bestselling.predict.datatransferobject.CarDTO;

import ch.qos.logback.core.net.SyslogOutputStream;
import weka.core.Instance;

//import com.mytaxi.datatransferobject.CarDTO;
//import com.mytaxi.domainobject.CarDO;
//import com.mytaxi.exception.ConstraintsViolationException;
//import com.mytaxi.exception.LicensePlateException;

@RestController
@RequestMapping("v1/cars")
public class CarPricePredictController {

    @Autowired
    PredictionModelService predictionModelService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CarDTO createCar(@Valid @RequestBody CarDTO carDTO) throws Exception {
        
        Instance createCarInstance = predictionModelService.createCarInstance(carDTO);
//        System.out.println(createCarInstance);
        double result = PredictionModelService.classifier.classifyInstance(createCarInstance);
        carDTO.setPrice(result);
        System.out.println(result);
        return carDTO;
    }

}

package com.bestselling.predict.datatransferobject;

import java.util.Date;

import com.bestselling.predict.domainvalue.EngineType;
import com.bestselling.predict.domainvalue.ModelType;
import com.bestselling.predict.domainvalue.RCType;
import com.bestselling.predict.domainvalue.TransmissionType;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CarDTO {

    int kilometers;
    int owner;
    RCType rcType = RCType.INDIVIDUAL;
    EngineType engineType = EngineType.PETROL;
    TransmissionType transmissionType = TransmissionType.MANUAL;
    Date registrationyear = new Date(100, 1, 1);
    String city = "Bangalore";
    ModelType modelType = ModelType.LXI;
    double price;

    public CarDTO() {
    }

    public CarDTO(int kilometers, int owner, RCType rcType, EngineType engineType, TransmissionType transmissionType,
            Date registrationyear, String city, ModelType modelType, double price) {
        super();
        this.kilometers = kilometers;
        this.owner = owner;
        this.rcType = rcType;
        this.engineType = engineType;
        this.transmissionType = transmissionType;
        this.registrationyear = registrationyear;
        this.city = city;
        this.modelType = modelType;
        this.price = price;
    }

    public int getKilometers() {
        return kilometers;
    }

    public void setKilometers(int kilometers) {
        this.kilometers = kilometers;
    }

    public int getOwner() {
        return owner;
    }

    public void setOwner(int owner) {
        this.owner = owner;
    }

    public RCType getRcType() {
        return rcType;
    }

    public void setRcType(RCType rcType) {
        this.rcType = rcType;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    public TransmissionType getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(TransmissionType transmissionType) {
        this.transmissionType = transmissionType;
    }

    @JsonFormat(shape = JsonFormat.Shape.ANY, pattern = "yyyy", timezone = "IST")
    public Date getRegistrationyear() {
        return registrationyear;
    }

    public void setRegistrationyear(Date registrationyear) {
        this.registrationyear = registrationyear;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public ModelType getModelType() {
        return modelType;
    }

    public void setModelType(ModelType modelType) {
        this.modelType = modelType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static class CarDTOBuilder {
        private int kilometers;
        private int owner;
        private RCType rcType;
        private EngineType engineType;
        private TransmissionType transmissionType;
        private Date registrationyear;
        private String city;
        private ModelType modelType;
        private double price;

        public CarDTOBuilder setKilometer(int kilometers) {
            this.kilometers = kilometers;
            return this;
        }

        public CarDTOBuilder setOwner(int owner) {
            this.owner = owner;
            return this;
        }

        public CarDTOBuilder setRCType(RCType rcType) {
            this.rcType = rcType;
            return this;
        }

        public CarDTOBuilder setEngineType(EngineType engineType) {
            this.engineType = engineType;
            return this;
        }

        public CarDTOBuilder setRegistrationyear(Date registrationyear) {
            this.registrationyear = registrationyear;
            return this;
        }

        public CarDTOBuilder setCity(String city) {
            this.city = city;
            return this;
        }

        public CarDTOBuilder setModelType(ModelType modelType) {
            this.modelType = modelType;
            return this;
        }

        public CarDTOBuilder setPrice(float price) {
            this.price = price;
            return this;
        }

        public CarDTO createCarDTO() {
            return new CarDTO(kilometers, owner, rcType, engineType, transmissionType, registrationyear, city,
                    modelType, price);
        }

    }
}

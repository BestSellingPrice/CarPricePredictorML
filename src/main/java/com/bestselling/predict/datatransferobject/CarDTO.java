package com.bestselling.predict.datatransferobject;

import java.util.Date;

import com.bestselling.predict.domainvalue.EngineType;
import com.bestselling.predict.domainvalue.ModelType;
import com.bestselling.predict.domainvalue.RCType;
import com.bestselling.predict.domainvalue.TransmissionType;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Builder
@Data
public class CarDTO {

    int kilometers;
    int owner;
    @Builder.Default
    RCType rcType = RCType.INDIVIDUAL;
    @Builder.Default
    EngineType engineType = EngineType.PETROL;
    @Builder.Default
    TransmissionType transmissionType = TransmissionType.MANUAL;
    @Builder.Default
    Date registrationyear = new Date(100, 1, 1);
    @Builder.Default
    String city = "Bangalore";
    @Builder.Default
    ModelType modelType = ModelType.LXI;
    double price;

    @JsonFormat(shape = JsonFormat.Shape.ANY, pattern = "yyyy", timezone = "IST")
    public Date getRegistrationyear() {
        return registrationyear;
    }

}

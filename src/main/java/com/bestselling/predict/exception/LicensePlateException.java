package com.bestselling.predict.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Licence Plate issue")
public class LicensePlateException extends RuntimeException
{
    static final long serialVersionUID = -3387516993334469948L;


    public LicensePlateException(String message)
    {
        super(message);
    }

}

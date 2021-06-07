package com.foreflight.web.dto;

public class Instructions {

    public String endpoint = "http://localhost:8080/api/{airportcode}";
    public String message = "Please use endpoint url and replace airportcode with appropriate airport identifier.";
    public String example = "http://localhost:8080/api/ord";

}

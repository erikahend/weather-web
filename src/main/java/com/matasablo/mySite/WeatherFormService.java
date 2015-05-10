package com.matasablo.mySite;

import com.matasablo.mySite.dto.WeatherDTO;
import com.sun.tools.internal.ws.processor.model.Response;

import javax.ws.rs.POST;


/**
 * Try creating a simple REST service for a weather object represented as JSON
 * Created by Erika on 12/04/2015.
 */
public class WeatherFormService {

    public WeatherFormService(){}

    @POST
    public Response saveWeather(WeatherDTO weatherDTO){
        return null;
    }
}

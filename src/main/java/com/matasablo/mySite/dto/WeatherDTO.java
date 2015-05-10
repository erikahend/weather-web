package com.matasablo.mySite.dto;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
/**
 * Created by Erika on 12/04/2015.
 */

//@Component
public class WeatherDTO {

    @JsonProperty("location")
    private String location;

    @JsonProperty("dateFrom")
    private String dateFrom;

    @JsonProperty("dateTo")
    private String dateTo;


    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(String dateFrom) {
        this.dateFrom = dateFrom;
    }

    public String getDateTo() {
        return dateTo;
    }

    public void setDateTo(String dateTo) {
        this.dateTo = dateTo;
    }
}

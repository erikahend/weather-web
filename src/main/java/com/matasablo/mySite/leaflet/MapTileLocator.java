package com.matasablo.mySite.leaflet;

import javax.swing.text.DateFormatter;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Erika on 04/05/2015.
 */
public class MapTileLocator {

    public static String METOFFICE = "http://www.metoffice.gov.uk";

    public MapTileLocator(){};

    public void getMapOfUK(){};

    /**
     * Returns the URL to retrieve the map tile given the map tile coordinates.
     * @param x map tile x coordinate
     * @param y map tile y coordinate
     * @param zoom map tile zoom level
     */
    public String getMapTileURL(String x, String y, String zoom, Date date){

        SimpleDateFormat format = new SimpleDateFormat();
        format.applyPattern("yyyy-MM-ddTHH:mm:ssZ");

        x = "15";
        y = "10";
        zoom = "5";

        String RUN= "2015-05-04T22:00:00Z";
        String FORECAST= "+0";
        String styles= "Bitmap+Blue-Pale+blue+gradient+0.01+to+greater+than+32mm/hr";

        String query = "RUN=" + RUN + "&FORECAST=" + FORECAST + "&styles=" + styles;

        String URL = METOFFICE + "/public/data/LayerCache/UKPPNOW/ItemBbox/Precipitation_Rate/" + x + "/" +
                y + "/" + zoom + "/" +"png?" + query;

        return  URL;
    };
}

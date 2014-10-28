package com.ctrltf.sample.jaxb.java_to_xsd_schema;

import java.util.Calendar;

import javax.xml.bind.JAXB;

public class sample {
    public static void main(String[] args) {
        Weather weather = new Weather();
        Measure mesure = new Measure();
        mesure.setDateTime(Calendar.getInstance());
        mesure.setHumidity(1);
        mesure.setTemperature(2);
        mesure.setWindDirection(3);
        mesure.setWindSpeed(4);
        weather.add(mesure);

        mesure = new Measure();
        mesure.setDateTime(Calendar.getInstance());
        mesure.setHumidity(1);
        mesure.setTemperature(2);
        mesure.setWindDirection(3);
        mesure.setWindSpeed(4);
        weather.add(mesure);
        
        JAXB.marshal(weather, System.out);
    }
}


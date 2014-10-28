package com.ctrltf.sample.jaxb.java_to_xsd_schema;

import java.util.Calendar;
import javax.xml.bind.annotation.XmlAttribute;

public class Measure {
    private double temperature;
    private double humidity;
    private int windDirection;
    private int windSpeed;
    private Calendar dateTime;
    
    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public void setWindDirection(int windDirection) {
        this.windDirection = windDirection;
    }

    public void setWindSpeed(int windSpeed) {
        this.windSpeed = windSpeed;
    }

    public void setDateTime(Calendar dateTime) {
        this.dateTime = dateTime;
    }

    Measure() {
    }

    public Measure(Calendar dateTime, double temperature, double humidity,
                   int windDirection, int windSpeed) {
        this.dateTime = (Calendar) dateTime.clone();
        this.temperature = temperature;
        this.humidity = humidity;
        this.windDirection = windDirection;
        this.windSpeed = windSpeed;
    }

    public double getTemperature() {
        return temperature;
    } 

    public double getHumidity() {
        return humidity;
    }

    public int getWindDirection() {
        return windDirection;
    }

    public int getWindSpeed() {
        return windSpeed;
    }

    public Calendar getDateTime() {
        return (Calendar) dateTime.clone();
    }
}

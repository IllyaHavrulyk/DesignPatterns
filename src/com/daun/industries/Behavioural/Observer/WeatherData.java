package com.daun.industries.Behavioural.Observer;

import java.math.BigDecimal;

public class WeatherData {
    private BigDecimal temperature;
    private BigDecimal humidity;
    private BigDecimal pressure;

    private Object currentConditionsDisplay;
    private Object statisticsDisplay;
    private Object forecastDisplay;

    private void measurementsChanged(){
        BigDecimal humidity = getHumidity();
        BigDecimal temperature = getTemperature();
        BigDecimal pressure = getPressure();

    }

    public BigDecimal getTemperature() {
        return temperature;
    }

    public void setTemperature(BigDecimal temperature) {
        this.temperature = temperature;
    }

    public BigDecimal getHumidity() {
        return humidity;
    }

    public void setHumidity(BigDecimal humidity) {
        this.humidity = humidity;
    }

    public BigDecimal getPressure() {
        return pressure;
    }

    public void setPressure(BigDecimal pressure) {
        this.pressure = pressure;
    }
}

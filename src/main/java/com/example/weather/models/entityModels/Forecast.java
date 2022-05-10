package com.example.weather.models.entityModels;

import com.example.weather.models.entityModels.enums.WeatherEnum;

import javax.persistence.*;
import javax.validation.constraints.Min;
import java.time.LocalDateTime;

@Entity
@Table(name = "forecasts")
public class Forecast {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int maxTemp;
    private int minTemp;

    @Min(0)
    private int pressure;

    @Min(0)
    private int humidity;

    @Min(0)
    private int precipitation;

    @Min(0)
    private double speed;
    private LocalDateTime dateAndTime;

    @Enumerated(EnumType.STRING)
    private WeatherEnum weather;

    @OneToOne
    private Forecast forecast;

    public Long getId() {
        return id;
    }

    public Forecast setId(Long id) {
        this.id = id;
        return this;
    }

    public int getMaxTemp() {
        return maxTemp;
    }

    public Forecast setMaxTemp(int maxTemp) {
        this.maxTemp = maxTemp;
        return this;
    }

    public int getMinTemp() {
        return minTemp;
    }

    public Forecast setMinTemp(int minTemp) {
        this.minTemp = minTemp;
        return this;
    }

    public int getPressure() {
        return pressure;
    }

    public Forecast setPressure(int pressure) {
        this.pressure = pressure;
        return this;
    }

    public int getHumidity() {
        return humidity;
    }

    public Forecast setHumidity(int humidity) {
        this.humidity = humidity;
        return this;
    }

    public int getPrecipitation() {
        return precipitation;
    }

    public Forecast setPrecipitation(int precipitation) {
        this.precipitation = precipitation;
        return this;
    }

    public double getSpeed() {
        return speed;
    }

    public Forecast setSpeed(double speed) {
        this.speed = speed;
        return this;
    }

    public LocalDateTime getDateAndTime() {
        return dateAndTime;
    }

    public Forecast setDateAndTime(LocalDateTime dateAndTime) {
        this.dateAndTime = dateAndTime;
        return this;
    }

    public WeatherEnum getWeather() {
        return weather;
    }

    public Forecast setWeather(WeatherEnum weather) {
        this.weather = weather;
        return this;
    }

    public Forecast getForecast() {
        return forecast;
    }

    public Forecast setForecast(Forecast forecast) {
        this.forecast = forecast;
        return this;
    }
}

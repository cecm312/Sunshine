package edu.utcancun.android.sunshine;

import java.io.Serializable;

/**
 * Created by True Basix on 03/06/2015.
 */
public class Pronostic implements Serializable{
    private String day;
    private String status;
    private String temperatures;
    private int img;

    public Pronostic(String day, String status,String temperatures,int img){
        this.day=day;
        this.status=status;
        this.temperatures=temperatures;
        this.img=img;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTemperatures() {
        return temperatures;
    }

    public void setTemperatures(String temperatures) {
        this.temperatures = temperatures;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}

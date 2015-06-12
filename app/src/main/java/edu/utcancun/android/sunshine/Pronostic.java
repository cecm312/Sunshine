package edu.utcancun.android.sunshine;

/**
 * Created by True Basix on 03/06/2015.
 */
public class Pronostic {
    public String day;
    public String status;
    public String temperatures;
    public int img;

    public Pronostic(String day, String status,String temperatures,int img){
        this.day=day;
        this.status=status;
        this.temperatures=temperatures;
        this.img=img;
    }
}

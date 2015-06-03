package edu.utcancun.android.sunshine;

/**
 * Created by True Basix on 03/06/2015.
 */
public class Pronostic {
    public String day;
    public String status;
    public String temperatures;

    public Pronostic(String day, String status,String temperatures){
        this.day=day;
        this.status=status;
        this.temperatures=temperatures;
    }
}

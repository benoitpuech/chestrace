package fr.wildcodeshcool.chestrace;

import java.util.StringTokenizer;

/**
 * Created by apprenti on 06/10/16.
 */
public class Cache {

    private String hint;
    private float lat;
    private float lon;

    public Cache() {
    }


    public Cache(float lat, float lon, String hint){
        this.lat = lat;
        this.lon = lon;
        this.hint = hint;
    }

    public float getLat() {
        return lat;
    }

    public void setLat(float lat){
        this.lat = lat;
    }

    public String getHint() {
        return hint;
    }

    public void setHint(String hint){
        this.hint = hint;
    }

    public float getLon() {
        return lon;
    }

    public void setLon(float lon) {
        this.lon = lon;
    }


}

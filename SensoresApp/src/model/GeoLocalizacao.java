package model;

/**
 * @author void door
 */
public class GeoLocalizacao {

    private int cod;
    private float longitude;
    private float latitude;

    public int getCod() {
        return cod;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    @Override
    public String toString() {
        return "GeoLocalizacao: "
                + "\nCod=" + cod
                + "\nLongitude=" + longitude
                + "\nLatitude=" + latitude;
    }

}

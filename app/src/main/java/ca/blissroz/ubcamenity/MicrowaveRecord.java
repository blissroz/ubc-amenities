package ca.blissroz.ubcamenity;

import com.google.android.gms.maps.model.LatLng;

/**
 * Created by bliss on 2017-02-20.
 */

public class MicrowaveRecord extends AbstractAmenity {
    private int power;
    private int cleanliness;

    public MicrowaveRecord(LatLng latlon, String description, String locationdesc,
                           String restrictions, int power, int cleanliness, int id) {
        super(latlon, description, locationdesc, restrictions, id);
        this.power = power;
        this.cleanliness = cleanliness;
    }

    public void setCleanliness(int cleanliness){ this.cleanliness = cleanliness; }
    public void setPower (int power) { this.power = power; }
    public int getCleanliness() { return this.cleanliness; }
    public int getPower() { return this.power; }
}

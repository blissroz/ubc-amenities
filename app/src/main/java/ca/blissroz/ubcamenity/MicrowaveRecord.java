package ca.blissroz.ubcamenity;

import com.google.android.gms.maps.model.LatLng;

/**
 * Created by bliss on 2017-02-20.
 */

public class MicrowaveRecord extends AbstractAmenity {
    private int power;

    public MicrowaveRecord() {}

    public MicrowaveRecord(LatLng latlon, int cleanliness, String description, String locationdesc,
                           String restrictions, int power, int id) {
        super(latlon, cleanliness, description, locationdesc, restrictions, id);
        this.power = power;
    }

    public void setPower (int power) { this.power = power; }
    public int getPower() { return this.power; }
}

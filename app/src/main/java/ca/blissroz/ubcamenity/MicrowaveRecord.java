package ca.blissroz.ubcamenity;

/**
 * Created by bliss on 2017-02-20.
 */

public class MicrowaveRecord extends AbstractAmenity {
    private int power;

    public MicrowaveRecord() {}

    public MicrowaveRecord(int lat, int lon, int cleanliness, String description, String locationdesc,
                           String restrictions, int power, int id) {
        super(lat, lon, cleanliness, description, locationdesc, restrictions, id);
        this.power = power;
    }

    public void setPower (int power) { this.power = power; }
    public int getPower() { return this.power; }
}

package ca.blissroz.ubcamenity;

/**
 * Created by bliss on 2017-02-20.
 */

public class WaterRecord extends AbstractAmenity {
    private int coldness;
    private boolean bottlefiller;

    public WaterRecord() {}

    public WaterRecord(int lat, int lon, int cleanliness, String description, String locationdesc,
                       String restrictions, int coldness, boolean bottlefiller, int id) {
        super(lat, lon, cleanliness, description, locationdesc, restrictions, id);
        this.coldness = coldness;
        this.bottlefiller = bottlefiller;
    }

    public void setColdness (int coldness) { this.coldness = coldness; }
    public void setBottlefiller (boolean bottlefiller) { this.bottlefiller = bottlefiller; }
    public int getColdness() { return this.coldness; }
    public boolean getBottlefiller() { return this.bottlefiller; }
}

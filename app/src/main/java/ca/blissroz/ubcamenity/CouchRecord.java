package ca.blissroz.ubcamenity;

/**
 * Created by bliss on 2017-02-20.
 */

public class CouchRecord extends AbstractAmenity {
    private int comfy;

    public CouchRecord() {}

    public CouchRecord(int lat, int lon, int cleanliness, String description, String locationdesc,
                       String restrictions, int comfy) {
        super(lat, lon, cleanliness, description, locationdesc, restrictions);
        this.comfy = comfy;
    }

    public void setComfy (int comfy) { this.comfy = comfy; }
    public int getComfy() { return this.comfy; }

}

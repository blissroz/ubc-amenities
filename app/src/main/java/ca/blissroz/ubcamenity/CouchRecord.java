package ca.blissroz.ubcamenity;

import com.google.android.gms.maps.model.LatLng;

/**
 * Created by bliss on 2017-02-20.
 */

public class CouchRecord extends AbstractAmenity {
    private int comfy;

    public CouchRecord() {}

    public CouchRecord(LatLng latlon, int cleanliness, String description, String locationdesc,
                       String restrictions, int comfy, int id) {
        super(latlon, cleanliness, description, locationdesc, restrictions, id);
        this.comfy = comfy;
    }

    public void setComfy (int comfy) { this.comfy = comfy; }
    public int getComfy() { return this.comfy; }

}

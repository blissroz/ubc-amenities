package ca.blissroz.ubcamenity;

import com.google.android.gms.maps.model.LatLng;

/**
 * Created by bliss on 2017-02-20.
 */

public class CouchRecord extends AbstractAmenity {
    private int comfy;
    private int cleanliness;

    public CouchRecord(LatLng latlon, String description, String locationdesc,
                       String restrictions, int comfy, int cleanliness, int id) {
        super(latlon, description, locationdesc, restrictions, id);
        this.comfy = comfy;
        this.cleanliness = cleanliness;

    }

    public void setCleanliness(int cleanliness){ this.cleanliness = cleanliness; }
    public void setComfy (int comfy) { this.comfy = comfy; }
    public int getCleanliness() { return this.cleanliness; }
    public int getComfy() { return this.comfy; }

}

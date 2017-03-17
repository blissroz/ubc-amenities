package ca.blissroz.ubcamenity;

import com.google.android.gms.maps.model.LatLng;

/**
 * Created by bliss on 2017-02-20.
 */

public class WaterRecord extends AbstractAmenity {
    private int coldness;
    private boolean bottlefiller;
    private int cleanliness;

    public WaterRecord(LatLng latlon, String description, String locationdesc,
                       String restrictions, int coldness, boolean bottlefiller, int cleanliness, int id) {
        super(latlon, description, locationdesc, restrictions, id);
        this.coldness = coldness;
        this.bottlefiller = bottlefiller;
        this.cleanliness = cleanliness;
    }

    public void setCleanliness(int cleanliness){ this.cleanliness = cleanliness; }
    public void setColdness (int coldness) { this.coldness = coldness; }
    public void setBottlefiller (boolean bottlefiller) { this.bottlefiller = bottlefiller; }
    public int getColdness() { return this.coldness; }
    public int getCleanliness() { return this.cleanliness; }
    public boolean getBottlefiller() { return this.bottlefiller; }
}

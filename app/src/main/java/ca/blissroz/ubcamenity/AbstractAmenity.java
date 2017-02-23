package ca.blissroz.ubcamenity;

import com.google.android.gms.maps.model.LatLng;

/**
 * Created by bliss on 2017-02-20.
 */

public abstract class AbstractAmenity {
    private LatLng latlon;
    private int cleanliness;
    private String description;
    private String locationdesc;
    private String restrictions;
    private int id;

    public AbstractAmenity() {}

    public AbstractAmenity(LatLng latlon, int cleanliness, String description,
                           String locationdesc, String restrictions, int id) {
        this.latlon = latlon;
        this.cleanliness = cleanliness;
        this.description = description;
        this.locationdesc = locationdesc;
        this.restrictions = restrictions;
        this.id = id;
    }

    public LatLng parseLatLon(String latlon){
        return new LatLng(Double.valueOf(latlon.split(",")[0]), Double.valueOf(latlon.split(",")[1]));
    }

    public void setLatLon(LatLng latlon){ this.latlon = latlon; }
    public void setCleanliness(int cleanliness){ this.cleanliness = cleanliness; }
    public void setDescription(String description){ this.description = description; }
    public void setLocationdesc(String locationdesc){ this.locationdesc = locationdesc; }
    public void setRestrictions(String restrictions){ this.restrictions = restrictions; }
    public void setId(int ID){ this.id = ID; }

    public LatLng getLatLon(){ return this.latlon; }
    public String getLatLonString() { return this.latlon.toString(); }
    public int getCleanliness() { return this.cleanliness; }
    public String getDescription() { return this.description; }
    public String getLocationdesc() { return this.locationdesc; }
    public String getRestrictions() { return this.restrictions; }
    public int getId() { return this.id; }
}

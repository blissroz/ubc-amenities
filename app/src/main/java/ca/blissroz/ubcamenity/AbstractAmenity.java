package ca.blissroz.ubcamenity;

import com.google.android.gms.maps.model.LatLng;

/**
 * Created by bliss on 2017-02-20.
 */

public abstract class AbstractAmenity {
    private LatLng latlon;
    private String description;
    private String locationdesc;
    private String restrictions;
    private int id;

    public AbstractAmenity(LatLng latlon, String description,
                           String locationdesc, String restrictions, int id) {
        this.latlon = latlon;
        this.description = description;
        this.locationdesc = locationdesc;
        this.restrictions = restrictions;
        this.id = id;
    }

    public LatLng parseLatLon(String latlon){
        return new LatLng(Double.parseDouble(latlon.split(",")[0]),
                Double.parseDouble(latlon.split(",")[1]));
    }

    public void setLatLon(LatLng latlon){ this.latlon = latlon; }
    public void setDescription(String description){ this.description = description; }
    public void setLocationdesc(String locationdesc){ this.locationdesc = locationdesc; }
    public void setRestrictions(String restrictions){ this.restrictions = restrictions; }
    public void setId(int ID){ this.id = ID; }

    public LatLng getLatLon(){ return this.latlon; }
    public String getLatLonString() { return this.latlon.toString(); }
    public String getDescription() { return this.description; }
    public String getLocationdesc() { return this.locationdesc; }
    public String getRestrictions() { return this.restrictions; }
    public int getId() { return this.id; }
}

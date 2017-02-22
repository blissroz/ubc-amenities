package ca.blissroz.ubcamenity;

/**
 * Created by bliss on 2017-02-20.
 */

public abstract class AbstractAmenity {
    private double lat;
    private double lon;
    private int cleanliness;
    private String description;
    private String locationdesc;
    private String restrictions;
    private int id;

    public AbstractAmenity() {}

    public AbstractAmenity(double lat, double lon, int cleanliness, String description,
                           String locationdesc, String restrictions, int id) {
        this.lat = lat;
        this.lon = lon;
        this.cleanliness = cleanliness;
        this.description = description;
        this.locationdesc = locationdesc;
        this.restrictions = restrictions;
        this.id = id;
    }

    public void setLatLon(int lat, int lon){ this.lat = lat; this.lon = lon; }
    public void setCleanliness(int cleanliness){ this.cleanliness = cleanliness; }
    public void setDescription(String description){ this.description = description; }
    public void setLocationdesc(String locationdesc){ this.locationdesc = locationdesc; }
    public void setRestrictions(String restrictions){ this.restrictions = restrictions; }
    public void setId(int ID){ this.id = ID; }

    public double getLat(){ return this.lat; }
    public double getLon() { return this.lon; }
    public int getCleanliness() { return this.cleanliness; }
    public String getDescription() { return this.description; }
    public String getLocationdesc() { return this.locationdesc; }
    public String getRestrictions() { return this.restrictions; }
    public int getId() { return this.id; }
}

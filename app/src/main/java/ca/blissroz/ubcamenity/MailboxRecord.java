package ca.blissroz.ubcamenity;

import com.google.android.gms.maps.model.LatLng;

/**
 * Created by bliss on 2017-03-17.
 */

public class MailboxRecord extends AbstractAmenity {
    public MailboxRecord(LatLng latlon, String description, String locationdesc, String restrictions, int id) {
        super(latlon, description, locationdesc, restrictions, id);
    }
}

package ca.blissroz.ubcamenity;

/**
 * Created by bliss on 2017-02-21.
 */
public class IDGenerator {
    private int ID;
    private static IDGenerator ourInstance = new IDGenerator();

    public static IDGenerator getInstance() {
        return ourInstance;
    }

    private IDGenerator() {
        this.ID = 100;
    }

    protected int getId( ) {
        this.ID++;
        return this.ID;
    }
}

package ca.blissroz.ubcamenity;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteOpenHelper;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

/**
 * Created by bliss on 2017-02-20.
 */

public class DBHandler extends SQLiteOpenHelper {
    // Database Version
    private static final int DATABASE_VERSION = 1;
    // Database Name
    private static final String DATABASE_NAME = "UBC Amenities";
    // table names
    private static final String TABLE_ALL = "summary";
    private static final String TABLE_H2O = "water";
    private static final String TABLE_MICRO = "microwaves";
    private static final String TABLE_COUCH = "couches";
    // in summary
    private static final String KEY_ALL = "all id";
    private static final String KEY_TYPE = "type";
    private static final String TYPE_MICRO = "Microwave";
    private static final String TYPE_H2O = "Water";
    private static final String TYPE_COUCH = "Couch";
    // in water/micro/couches
    private static final String KEY_ID = "id";
    private static final String KEY_LAT = "lat";
    private static final String KEY_LON = "lon";
    private static final String KEY_LOC = "location";
    private static final String KEY_DESC = "description";
    private static final String KEY_RESTR = "restrictions";
    private static final String KEY_CLEAN = "cleanliness";
    // in water
    private static final String KEY_TEMP = "coldness";
    private static final String KEY_BOTFILLER = "bottle filler";
    // in microwaves
    private static final String KEY_POWER = "power";
    // in couches
    private static final String KEY_COMFY = "comfy";


    public DBHandler(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_MAIN_TABLE = "CREATE TABLE "
                + TABLE_ALL + "("
                + KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                + KEY_TYPE + " TEXT)";
        db.execSQL(CREATE_MAIN_TABLE);

        String CREATE_MICROWAVE_TABLE = "CREATE TABLE "
                + TABLE_MICRO + "("
                + KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                + KEY_LOC + " TEXT,"
                + KEY_DESC + " TEXT,"
                + KEY_LAT + " DOUBLE,"
                + KEY_LON + " DOUBLE,"
                + KEY_RESTR + " TEXT,"
                + KEY_POWER + " INT,"
                + KEY_CLEAN  + " INT,"
                + KEY_ALL + " INT,"
                + " FOREIGN KEY ("+KEY_ALL+") REFERENCES "+TABLE_ALL+"("+KEY_ID+"));";
        db.execSQL(CREATE_MICROWAVE_TABLE);

        String CREATE_COUCH_TABLE = "CREATE TABLE "
                + TABLE_COUCH + "("
                + KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                + KEY_LOC + " TEXT,"
                + KEY_DESC + " TEXT,"
                + KEY_LAT + " DOUBLE,"
                + KEY_LON + " DOUBLE,"
                + KEY_RESTR + " TEXT,"
                + KEY_COMFY + " INT,"
                + KEY_CLEAN  + " INT,"
                + KEY_ALL + " INT,"
                + " FOREIGN KEY ("+KEY_ALL+") REFERENCES "+TABLE_ALL+"("+KEY_ID+"));";
        db.execSQL(CREATE_COUCH_TABLE);

        String CREATE_WATER_TABLE = "CREATE TABLE "
                + TABLE_H2O + "("
                + KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                + KEY_LOC + " TEXT,"
                + KEY_DESC + " TEXT,"
                + KEY_LAT + " DOUBLE,"
                + KEY_LON + " DOUBLE,"
                + KEY_RESTR + " TEXT,"
                + KEY_TEMP + " INT,"
                + KEY_BOTFILLER + " BOOL,"
                + KEY_CLEAN  + " INT,"
                + KEY_ALL + " INT,"
                + " FOREIGN KEY ("+KEY_ALL+") REFERENCES "+TABLE_ALL+"("+KEY_ID+"));";
        db.execSQL(CREATE_WATER_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Drop older table if existed
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_ALL);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_MICRO);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_H2O);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_COUCH);
        // Creating tables again
        onCreate(db);
    }

    // Adding new microwave
    public void addMicrowave(MicrowaveRecord microwave) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_LOC, microwave.getLocationdesc());
        values.put(KEY_DESC, microwave.getDescription());
        values.put(KEY_LAT, microwave.getLat());
        values.put(KEY_LON, microwave.getLon());
        values.put(KEY_RESTR, microwave.getRestrictions());
        values.put(KEY_POWER, microwave.getPower());
        values.put(KEY_CLEAN, microwave.getCleanliness());

        ContentValues all_values = new ContentValues();
        all_values.put(KEY_TYPE, TYPE_MICRO);

        // Inserting Row
        db.insert(TABLE_MICRO, null, values);
        db.insert(TABLE_ALL, null, all_values);
        db.close(); // Closing database connection
    }

    // Adding new couch
    public void addCouch(CouchRecord couch) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_LOC, couch.getLocationdesc());
        values.put(KEY_DESC, couch.getDescription());
        values.put(KEY_LAT, couch.getLat());
        values.put(KEY_LON, couch.getLon());
        values.put(KEY_RESTR, couch.getRestrictions());
        values.put(KEY_COMFY, couch.getComfy());
        values.put(KEY_CLEAN, couch.getCleanliness());

        ContentValues all_values = new ContentValues();
        all_values.put(KEY_TYPE, TYPE_COUCH);

        // Inserting Row
        db.insert(TABLE_COUCH, null, values);
        db.insert(TABLE_ALL, null, all_values);
        db.close(); // Closing database connection
    }

    // Adding new water fountain
    public void addWater(WaterRecord water) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_LOC, water.getLocationdesc());
        values.put(KEY_DESC, water.getDescription());
        values.put(KEY_LAT, water.getLat());
        values.put(KEY_LON, water.getLon());
        values.put(KEY_RESTR, water.getRestrictions());
        values.put(KEY_TEMP, water.getColdness());
        values.put(KEY_BOTFILLER, water.getBottlefiller());
        values.put(KEY_CLEAN, water.getCleanliness());

        ContentValues all_values = new ContentValues();
        all_values.put(KEY_TYPE, TYPE_H2O);

        // Inserting Row
        db.insert(TABLE_H2O, null, values);
        db.insert(TABLE_ALL, null, all_values);
        db.close(); // Closing database connection
    }

    // Updating a shop
    public int updateShop(Shop shop) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_NAME, shop.getName());
        values.put(KEY_SH_ADDR, shop.getAddress());
        // updating row
        return db.update(TABLE_SHOPS, values, KEY_ID + " = ?",
                new String[]{String.valueOf(shop.getId())});
    }

    // Getting All Shops
    public List<Shop> getAllShops() {
        List<Shop> shopList = new ArrayList<Shop>();
        // Select All Query
        String selectQuery = "SELECT * FROM " + TABLE_SHOPS;
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);
        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                Shop shop = new Shop();
                shop.setId(Integer.parseInt(cursor.getString(0)));
                shop.setName(cursor.getString(1));
                shop.setAddress(cursor.getString(2));
                // Adding contact to list
                shopList.add(shop);
            } while (cursor.moveToNext());
        }
        // return contact list
        return shopList;
    }
}

package pnu.app.porntip.puyrestaurant;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.security.PublicKey;

/**
 * Created by USER on 9/4/2559.
 */
public class MyOpenHelper extends SQLiteOpenHelper{


    //Explicit ประกาศตัวแปร
    public static final String database_name = "Restaurant.db";
    // เวอร์ชั่นฐานข้อมูล
    private static final int database_version = 1;
    // สร้างฐานข้อมูล
    private static final String create_user_tabel = "create table userTABLE (" +
            "_id integer primary key, " +
            "User text, " +
            "Password text," +
            "Name text);";
    private static final String create_food_table = "create table foodTABLE (" +
            "id integer primary key," +
            "Food text," +
            "Price text," +
            "Source text);";


    public MyOpenHelper(Context context) {
        super(context, database_name, null, database_version);
    } // Constructor

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(create_food_table);
        sqLiteDatabase.execSQL(create_user_tabel);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {

    }
} // Main Class

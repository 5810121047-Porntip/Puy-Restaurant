package pnu.app.porntip.puyrestaurant;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by USER on 9/4/2559.
 */
public class MyManage {

    // ประกาศตัวแปร
    private MyOpenHelper myOpenHelper;
    // ตัวแปรเชื่อมต่อ
    private SQLiteDatabase sqLiteDatabase;

    public MyManage(Context context){

        myOpenHelper = new MyOpenHelper(context);
        sqLiteDatabase = myOpenHelper.getWritableDatabase();



    }  //Constructor


} //Main Class

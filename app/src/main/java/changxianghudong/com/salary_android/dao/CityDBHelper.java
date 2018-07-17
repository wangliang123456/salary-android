package changxianghudong.com.salary_android.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class CityDBHelper extends SQLiteOpenHelper {

    private static final int DB_VERSION = 1;

    private static final String DB_NAME = "salary.db";

    public static final String TABLE_NAME = "City";

    public CityDBHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.beginTransaction();
        sqLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS " + TABLE_NAME +" (id INTEGER PRIMARY KEY AUTOINCREMENT, formula TEXT, city_name TEXT UNIQUE, city_initial TEXT, is_hot INTEGER)");
        sqLiteDatabase.execSQL("insert into City(city_name, city_initial, is_hot, formula) values(\\\"北京\\\",\\\"B\\\", 1, \\\"dadsadsada\\\")");
        sqLiteDatabase.execSQL("insert into City(city_name, city_initial, is_hot, formula) values(\\\"上海\\\",\\\"S\\\", 1, \\\"dadsadsada\\\")");
        sqLiteDatabase.execSQL("insert into City(city_name, city_initial, is_hot, formula) values(\\\"广州\\\",\\\"G\\\", 1, \\\"dadsadsada\\\")");
        sqLiteDatabase.execSQL("insert into City(city_name, city_initial, is_hot, formula) values(\\\"深圳\\\",\\\"S\\\", 1, \\\"dadsadsada\\\")");
        sqLiteDatabase.execSQL("insert into City(city_name, city_initial, is_hot, formula) values(\\\"成都\\\",\\\"C\\\", 1, \\\"dadsadsada\\\")");
        sqLiteDatabase.execSQL("insert into City(city_name, city_initial, is_hot, formula) values(\\\"武汉\\\",\\\"W\\\", 1, \\\"dadsadsada\\\")");
        sqLiteDatabase.execSQL("insert into City(city_name, city_initial, is_hot, formula) values(\\\"杭州\\\",\\\"H\\\", 1, \\\"dadsadsada\\\")");
        sqLiteDatabase.execSQL("insert into City(city_name, city_initial, is_hot, formula) values(\\\"苏州\\\",\\\"S\\\", 1, \\\"dadsadsada\\\")");
        sqLiteDatabase.execSQL("insert into City(city_name, city_initial, is_hot, formula) values(\\\"长沙\\\",\\\"C\\\", 0, \\\"dadsadsada\\\")");
        sqLiteDatabase.execSQL("insert into City(city_name, city_initial, is_hot, formula) values(\\\"长春\\\",\\\"C\\\", 0, \\\"dadsadsada\\\")");
        sqLiteDatabase.execSQL("insert into City(city_name, city_initial, is_hot, formula) values(\\\"重庆\\\",\\\"C\\\", 0, \\\"dadsadsada\\\")");
        sqLiteDatabase.execSQL("insert into City(city_name, city_initial, is_hot, formula) values(\\\"大连\\\",\\\"D\\\", 0, \\\"dadsadsada\\\")");
        sqLiteDatabase.execSQL("insert into City(city_name, city_initial, is_hot, formula) values(\\\"福州\\\",\\\"F\\\", 0, \\\"dadsadsada\\\")");
        sqLiteDatabase.execSQL("insert into City(city_name, city_initial, is_hot, formula) values(\\\"贵阳\\\",\\\"G\\\", 0, \\\"dadsadsada\\\")");
        sqLiteDatabase.execSQL("insert into City(city_name, city_initial, is_hot, formula) values(\\\"海口\\\",\\\"H\\\", 0, \\\"dadsadsada\\\")");
        sqLiteDatabase.execSQL("insert into City(city_name, city_initial, is_hot, formula) values(\\\"合肥\\\",\\\"H\\\", 0, \\\"dadsadsada\\\")");
        sqLiteDatabase.execSQL("insert into City(city_name, city_initial, is_hot, formula) values(\\\"呼和浩特\\\",\\\"H\\\", 0, \\\"dadsadsada\\\")");
        sqLiteDatabase.execSQL("insert into City(city_name, city_initial, is_hot, formula) values(\\\"哈尔滨\\\",\\\"H\\\", 0, \\\"dadsadsada\\\")");
        sqLiteDatabase.execSQL("insert into City(city_name, city_initial, is_hot, formula) values(\\\"济南\\\",\\\"J\\\", 0, \\\"dadsadsada\\\")");
        sqLiteDatabase.execSQL("insert into City(city_name, city_initial, is_hot, formula) values(\\\"昆明\\\",\\\"K\\\", 0, \\\"dadsadsada\\\")");
        sqLiteDatabase.execSQL("insert into City(city_name, city_initial, is_hot, formula) values(\\\"兰州\\\",\\\"L\\\", 0, \\\"dadsadsada\\\")");
        sqLiteDatabase.execSQL("insert into City(city_name, city_initial, is_hot, formula) values(\\\"宁波\\\",\\\"N\\\", 0, \\\"dadsadsada\\\")");
        sqLiteDatabase.execSQL("insert into City(city_name, city_initial, is_hot, formula) values(\\\"南昌\\\",\\\"N\\\", 0, \\\"dadsadsada\\\")");
        sqLiteDatabase.execSQL("insert into City(city_name, city_initial, is_hot, formula) values(\\\"南宁\\\",\\\"N\\\", 0, \\\"dadsadsada\\\")");
        sqLiteDatabase.execSQL("insert into City(city_name, city_initial, is_hot, formula) values(\\\"南京\\\",\\\"N\\\", 0, \\\"dadsadsada\\\")");
        sqLiteDatabase.execSQL("insert into City(city_name, city_initial, is_hot, formula) values(\\\"青岛\\\",\\\"Q\\\", 0, \\\"dadsadsada\\\")");
        sqLiteDatabase.execSQL("insert into City(city_name, city_initial, is_hot, formula) values(\\\"石家庄\\\",\\\"S\\\", 0, \\\"dadsadsada\\\")");
        sqLiteDatabase.execSQL("insert into City(city_name, city_initial, is_hot, formula) values(\\\"沈阳\\\",\\\"S\\\", 0, \\\"dadsadsada\\\")");
        sqLiteDatabase.execSQL("insert into City(city_name, city_initial, is_hot, formula) values(\\\"太原\\\",\\\"T\\\", 0, \\\"dadsadsada\\\")");
        sqLiteDatabase.execSQL("insert into City(city_name, city_initial, is_hot, formula) values(\\\"天津\\\",\\\"T\\\", 0, \\\"dadsadsada\\\")");
        sqLiteDatabase.execSQL("insert into  City(city_name, city_initial, is_hot, formula) values(\\\"西安\\\",\\\"X\\\", 0, \\\"dadsadsada\\\")");
        sqLiteDatabase.execSQL("insert into City(city_name, city_initial, is_hot, formula) values(\\\"厦门\\\",\\\"X\\\", 0, \\\"dadsadsada\\\")");
        sqLiteDatabase.execSQL("insert into City(city_name, city_initial, is_hot, formula) values(\\\"郑州\\\",\\\"Z\\\", 0, \\\"dadsadsada\\\")");
        sqLiteDatabase.endTransaction();
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        String sql = "DROP TABLE IF EXISTS " + TABLE_NAME;
        sqLiteDatabase.execSQL(sql);
        onCreate(sqLiteDatabase);
    }
}

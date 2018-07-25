package changxianghudong.com.salary_android.dao;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.google.common.collect.Lists;

import java.util.List;

import changxianghudong.com.salary_android.model.City;

public class CityDao {

    private Context context;

    public List<City> getAllHotCity() {
        List<City> hotCity = Lists.newArrayList();
        DBHelper dbHelper = new DBHelper(this.context);
        SQLiteDatabase sqLiteDatabase = dbHelper.getReadableDatabase();
        String sql  = "select * from City where is_hot = ?";
        Cursor cursor = sqLiteDatabase.rawQuery(sql, new String[]{"1"});
        while (cursor.moveToNext()) {
            City city = new City();
            city.setId(cursor.getInt(0));
            city.setCityName(cursor.getString(2));
            city.setCityInitial(cursor.getString(3));
            city.setIsHot(cursor.getInt(4));
            hotCity.add(city);
        }
        return hotCity;
    }

}

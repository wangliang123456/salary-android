package changxianghudong.com.salary_android.dao;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import changxianghudong.com.salary_android.model.Insurance;

public class InsuranceDao {

    private Context context;

    /**
     * 获取当前选中城市的社保配置信息
     *
     * @param cityName
     * @return
     */
    public Insurance queryInsuranceByCity(String cityName) {
        Insurance insurance = null;
        DBHelper dbHelper = new DBHelper(this.context);
        SQLiteDatabase sqLiteDatabase = dbHelper.getReadableDatabase();
        String sql = "select * from Insurance_data where city_name = ?";
        Cursor cursor = sqLiteDatabase.rawQuery(sql, new String[]{cityName});
        while (cursor.moveToNext()) {
            insurance = this.buildInsurance(cursor);
        }
        return insurance;
    }

    private Insurance buildInsurance(Cursor cursor) {
        Insurance insurance = new Insurance();
        insurance.setId(cursor.getInt(0));
        insurance.setEmploymentInjuryInsurance(cursor.getString(1));
        insurance.setMedicalInsurance(cursor.getString(2));
        insurance.setUnemploymentInsurance(cursor.getString(3));
        insurance.setMaternityInsurance(cursor.getString(4));
        insurance.setEmploymentInjuryInsurance(cursor.getString(5));
        insurance.setHouseFund(cursor.getString(6));
        insurance.setCityName(cursor.getString(7));
        return insurance;
    }
}

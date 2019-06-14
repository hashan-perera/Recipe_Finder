package com.example.recipe_app;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String db_name = "products.db";
    public static final String table_name = "products_table";
    public static final String col_1 = "NAME";
    public static final String col_2 = "WEIGHT";
    public static final String col_3 = "PRICE";
    public static final String col_4 = "DESCRIPTION";

    public DatabaseHelper(Context context) {
        super(context, db_name, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + table_name + "(NAME TEXT,WEIGHT DOUBLE, PRICE DOUBLE, DESCRIPTION TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(" DROP TABLE IF EXISTS " + table_name);
        onCreate(db);
    }

    public boolean addProduct(String name, String weight, String price, String description) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(col_1, name);
        contentValues.put(col_2, weight);
        contentValues.put(col_3, price);
        contentValues.put(col_4, description);
        long result = db.insert(table_name, null, contentValues);
        if (result == -1)
            return false;
        else
            return true;
    }

    public Cursor getProducts() {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor results = db.rawQuery(" SELECT * FROM " + table_name, null);

        return results;
    }
}

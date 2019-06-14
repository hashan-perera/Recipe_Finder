package com.example.recipe_app;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class DisplayProducts extends AppCompatActivity {

    SQLiteDatabase sqLiteDatabase;
    DatabaseHelper mydb;
    Cursor cursor;
    ListView productList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_products);

        productList = (ListView) findViewById(R.id.product_list);
        mydb = new DatabaseHelper(getApplicationContext());
        sqLiteDatabase = mydb.getReadableDatabase();
        cursor = mydb.getProducts();
    }
}

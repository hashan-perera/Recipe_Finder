package com.example.recipe_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class RegisterProduct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_product);

        EditText name = findViewById(R.id.name);
        EditText weight = findViewById(R.id.weight);
        EditText price = findViewById(R.id.price);
        EditText description = findViewById(R.id.description);
        Button save = findViewById(R.id.save);
    }
}

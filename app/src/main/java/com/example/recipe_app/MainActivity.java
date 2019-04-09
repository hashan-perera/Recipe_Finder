package com.example.recipe_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button register_prod = findViewById(R.id.register_prod);
        Button display_prod = findViewById(R.id.display_prod);
        Button available = findViewById(R.id.available);
        Button edit_prod = findViewById(R.id.edit_prod);
        Button search = findViewById(R.id.search);
        Button recipe = findViewById(R.id.recipe);

    }

    public void registerProduct(View view) {
        Intent intent = new Intent(getApplicationContext(), RegisterProduct.class);
        startActivity(intent);
    }

}

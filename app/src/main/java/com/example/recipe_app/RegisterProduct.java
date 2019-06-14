package com.example.recipe_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterProduct extends AppCompatActivity {

    EditText name, weight, price, description;
    Button save;
    DatabaseHelper mydb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_product);

        name = findViewById(R.id.name);
        weight = findViewById(R.id.weight);
        price = findViewById(R.id.price);
        description = findViewById(R.id.description);
        save = findViewById(R.id.save);
        mydb = new DatabaseHelper(this);

        //
        AddProduct();
    }

    public void AddProduct() {
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean isInserted = mydb.addProduct(
                        name.getText().toString(),
                        weight.getText().toString(),
                        price.getText().toString(),
                        description.getText().toString());
                if (isInserted)
                    Toast.makeText(RegisterProduct.this, "Added to Database", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(RegisterProduct.this, "Error!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

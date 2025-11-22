package com.example.birthday_wish;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    EditText name;
    Button b1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        name=findViewById(R.id.t1);
        b1=findViewById(R.id.wish);





        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String n=name.getText().toString();

                if(n.isEmpty())
                {
                    Toast.makeText(MainActivity.this, "Please enter your name ", Toast.LENGTH_SHORT).show();
                    name.setError("This field cannot be empty");
                    name.requestFocus();
                }

                else {
                    Toast.makeText(MainActivity.this, "Welcome to your wish ", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, wish_method.class);
                    intent.putExtra("name", n);
                    startActivity(intent);
                }



            }
        });




    }
}
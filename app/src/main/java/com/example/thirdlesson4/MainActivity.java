package com.example.thirdlesson4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText IDEdText;
    private EditText addressEdText;
    private EditText timeEdText;

    private EditText priceEdText;

    Button button;

    private String ID;
    private String address;
    private String time;
    private String price;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IDEdText = findViewById(R.id.ID);
        addressEdText = findViewById(R.id.address);
        timeEdText = findViewById(R.id.time);
        priceEdText = findViewById(R.id.price);
        button = findViewById(R.id.btn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ID = IDEdText.getText().toString();
                address = addressEdText.getText().toString();
                time = timeEdText.getText().toString();
                price = priceEdText.getText().toString();

                User user = new User(ID, address, time, price);

                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                intent.putExtra("user1", user);
                startActivity(intent);



            }
        });



    }
}
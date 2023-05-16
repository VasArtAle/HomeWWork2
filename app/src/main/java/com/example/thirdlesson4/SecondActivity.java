package com.example.thirdlesson4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView textView;
    private User user;

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Bundle bundle = getIntent().getExtras();

        if (bundle!= null) {
            user =(User) bundle.getSerializable("user1");
        }
        textView = findViewById(R.id.textView3);
        button = findViewById(R.id.bbtn);

        textView.setText("ID пользователя: " + user.getID() +
                "\n" + "Место отправки и прибытия поезда: " + user.getAddress() +
                "\n" + "Время отправки и прибытия поезда: " + user.getTime()  +
                "\n" + "Цена: " + user.getPrice());


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
    }
}
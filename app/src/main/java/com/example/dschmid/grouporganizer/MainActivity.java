package com.example.dschmid.grouporganizer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.dschmid.grouporganizer.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();
        String name = intent.getStringExtra("Email");
        String password = intent.getStringExtra("Password");


        TextView tvtextView = (TextView) findViewById(R.id.textView);
        tvtextView.setText("Hello " + name + " your Password is " + password + "new");

    }
}

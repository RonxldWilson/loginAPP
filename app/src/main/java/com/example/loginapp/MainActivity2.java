package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        button2 = (Button)findViewById(R.id.button2);
    }
    public void click2(View view){
        Intent i = new Intent(MainActivity2.this, MainActivity.class);
        startActivity(i);
        finish();
    }
}
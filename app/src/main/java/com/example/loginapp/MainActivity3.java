package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity3 extends AppCompatActivity {

    EditText fullNameField;
    EditText emailField;
    EditText passwordField;
    Button submit;
    Button login;

    ContactsContract.CommonDataKinds.Email
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        submit = (Button)findViewById(R.id.submit);
        login = (Button)findViewById(R.id.login);
        fullNameField = (EditText)findViewById(R.id.fullNameField);
        emailField = (EditText)findViewById(R.id.emailField);
        passwordField = (EditText)findViewById(R.id.passwordField);

        fullNameField.getText().toString();
        emailField.getText().toString();
        passwordField.getText().toString();

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            Intent i = new Intent(MainActivity3.this,MainActivity4.class )
            startActivity(i);
            finish();
            }
        });
    }
}
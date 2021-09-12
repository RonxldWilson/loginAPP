package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity {
// This is login Activity

    EditText emailFieldLogin;
    EditText passwordFieldLogin;
    Button submitLogin;
    Button signUpLogin;
    Button FacebookLogin;
    Button GoogleLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        emailFieldLogin = (EditText)findViewById(R.id.emailFieldLogin);
//        String mail= emailFieldLogin.getText().toString();

        passwordFieldLogin = (EditText)findViewById(R.id.passwordFieldLogin);
//        String pass= passwordFieldLogin.getText().toString();

        submitLogin = (Button)findViewById(R.id.submitLogin);
        signUpLogin= (Button) findViewById(R.id.signUpLogin);
        FacebookLogin = (Button) findViewById(R.id.button);
        GoogleLogin= (Button) findViewById(R.id.button7);

        submitLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity4.this, emailFieldLogin.getText().toString(), Toast.LENGTH_SHORT).show();
                Toast.makeText(MainActivity4.this, passwordFieldLogin.getText().toString(), Toast.LENGTH_SHORT).show();
                if(emailFieldLogin.getText().toString() == "ronwilson0001@gmail.com"
                        && passwordFieldLogin.getText().toString()== "12345")
                {
                    Intent i = new Intent(MainActivity4.this, MainActivity5.class);
                    startActivity(i);
                    finish();
                }
                else{
                    Toast.makeText(MainActivity4.this , "Wrong Username or Password", Toast.LENGTH_SHORT).show();
                }
                }
        });

                signUpLogin.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent z = new Intent(MainActivity4.this, MainActivity3.class);
                        startActivity(z);
                        finish();
                    }
                });
                FacebookLogin.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(MainActivity4.this, "Feature Coming Soon", Toast.LENGTH_SHORT).show();
                    }
                });
                GoogleLogin.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(MainActivity4.this, "Feature Coming Soon", Toast.LENGTH_SHORT).show();
                    }
                });
            }
        }



package com.ahmad.ibrahim.learndroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    Button btnLogin;
    EditText usernameField;
    EditText passwordField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //intansiasi object dari xml bean

        usernameField = (EditText) findViewById(R.id.usernameField);
        passwordField = (EditText) findViewById(R.id.passwordField);
        btnLogin = (Button) findViewById(R.id.btnLogin);



        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            //method event handling (Click) yang tersedia di class Button
            public void onClick(View view) {
                Toast.makeText(LoginActivity.this, "Login Processed!", Toast.LENGTH_LONG).show();
                //set isi txtWelcome di view

                System.out.println("Login Button Pressed");
                System.out.println("Username = "+usernameField.getText());
                System.out.println("Password = "+passwordField.getText());

                //view.onCreateInputConnection(Toast.makeText("Get text"));
            }
        });


    }
}

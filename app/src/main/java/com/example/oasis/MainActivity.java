package com.example.oasis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button createBtn;
    private Button forgotBtn;
    private Button homeBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Set the content view here
        getSupportActionBar().hide();


        createBtn = findViewById(R.id.createBtn);
        createBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCreateAccountPage();
            }
        });

        forgotBtn = findViewById(R.id.forgotBtn);
        forgotBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openForgotPasswordPage();
            }
        });

        homeBtn = findViewById(R.id.login);
        homeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                homePage();
            }
        });
    }

    public void openForgotPasswordPage(){
        Intent i = new Intent(MainActivity.this, forgotPassword.class);
        startActivity(i);
    }

    public void openCreateAccountPage(){
        Intent i = new Intent(MainActivity.this, createAccount.class);
        startActivity(i);
    }

    public void homePage(){
        Intent i = new Intent(MainActivity.this, homePage.class);
        startActivity(i);
    }
}

package com.example.oasis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Chat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);
    }
    ImageView imageView3 = findViewById(R.id.imageView3);
imageView3.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            // Handle the click event here
            // Example: Redirect to another activity
            Intent intent = new Intent(MainActivity.this, AnotherActivity.class);
            startActivity(intent);
        }
    });

    ImageView imageView4 = findViewById(R.id.imageView4);
imageView4.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            // Handle the click event here
            // Example: Redirect to another activity
            Intent intent = new Intent(MainActivity.this, AnotherActivity.class);
            startActivity(intent);
        }
    });

}
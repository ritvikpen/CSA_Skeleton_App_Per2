package com.example.csa_skeleton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
    }

    public void return_home(View view){
        Intent intent = new Intent(this, MainTalkScreen.class);
        startActivity(intent);
    }
}

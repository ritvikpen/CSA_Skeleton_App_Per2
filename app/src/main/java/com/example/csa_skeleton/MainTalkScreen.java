package com.example.csa_skeleton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainTalkScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_talk_screen);
    }

    public void sendMessage(View view){
        TextView text = (TextView)findViewById(R.id.response_text);
        text.setText("Let's be friends!");
        //text.setText("I love you too!");
    }

    public void logout(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void shop(View view){
        Intent intent = new Intent(this, Store.class);
        startActivity(intent);
    }

    public void goToSettings(View view){
        Intent intent = new Intent(this, Settings.class);
        startActivity(intent);
    }
}

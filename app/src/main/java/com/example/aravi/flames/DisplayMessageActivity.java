package com.example.aravi.flames;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        if(message.equals("FRIENDS"))
            setContentView(R.layout.activity_display_message_friends);
        else if(message.equals("LOVE"))
            setContentView(R.layout.activity_display_message_love);
        else if(message.equals("AFFECTION"))
            setContentView(R.layout.activity_display_message_affection);
        else if(message.equals("MARRIAGE"))
            setContentView(R.layout.activity_display_message_marriage);
        else if(message.equals("ENEMIES"))
            setContentView(R.layout.activity_display_message_enemies);
        else if(message.equals("SIBLINGS"))
            setContentView(R.layout.activity_display_message_siblings);
        else if(message.equals("NO NAMES")) {
            Toast.makeText( getApplicationContext(), "Name field cannot be empty!", Toast.LENGTH_SHORT ).show();
            setContentView(R.layout.activity_main);
        }
    }
}

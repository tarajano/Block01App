package com.example.tarajano.block01app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button buttonBlue, buttonPink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonPink = (Button) findViewById(R.id.button_pinkPanther);
        buttonBlue = (Button) findViewById(R.id.button_blueInvisible);
        // Preparing to set onClick actions
        buttonPink.setOnClickListener(this);
        buttonBlue.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        toDO(v);
    }

    public void toDO(View v){

        if(v.equals(buttonBlue)){
            // Invisible Man' stuff
            v.setVisibility(View.INVISIBLE);
            Toast.makeText(getApplicationContext(),"Upss! The Invisible Man is gone.", Toast.LENGTH_SHORT).show();
        }

        if(v.equals(buttonPink)){
            // Panther's stuff
            // Pop-up
            Toast.makeText(getApplicationContext(),"Ohh! Ohh! What TO DO?", Toast.LENGTH_SHORT).show();
        }

    }
}

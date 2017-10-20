package com.example.tarajano.block01app;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button buttonBlue, buttonPink, buttonGreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonPink = (Button) findViewById(R.id.button_pinkPanther);
        buttonBlue = (Button) findViewById(R.id.button_blueInvisible);

        // Preparing to set onClick actions
        buttonPink.setOnClickListener(this);
        buttonBlue.setOnClickListener(this);

        // Creating a new button directly from code (not xml)
        buttonGreen = new Button(getApplicationContext());
        buttonGreen.setTextColor(Color.BLACK);
        buttonGreen.setBackgroundColor(Color.WHITE);
        buttonGreen.setText("Don't you fancy some green?");
        RelativeLayout rlMainActivity = (RelativeLayout) findViewById(R.id.mainActivityLayout);
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT);
        params.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM , buttonGreen.getId());
        rlMainActivity.addView(buttonGreen, params);
        buttonGreen.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        toDO(v);
    }

    public void toDO(View v){

        if(v.equals(buttonBlue)){
            // Make button invisible
            v.setVisibility(View.INVISIBLE);
            Toast.makeText(getApplicationContext(),"Upss! The Invisible Man is gone.", Toast.LENGTH_SHORT).show();
        }

        if(v.equals(buttonPink)){
            // Pop-up
            Toast.makeText(getApplicationContext(),"Ohh! Ohh! What TO DO?", Toast.LENGTH_SHORT).show();
        }

        if(v.equals(buttonGreen)){
            // Pop-up
            buttonGreen.setBackgroundColor(Color.GREEN);
            buttonGreen.setText("Yes! We fancy some green here.");
        }

    }
}

package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Setting up the imageview variable
        final ImageView ballDisplay = findViewById(R.id.image_eightBall);

        // Array that holds the ball images
        final int[] ballArray = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5};

        // Linking ask button and setting the listener
        Button mybutton = findViewById(R.id.askButton);
        mybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Random rndGen = new Random();
                int number = rndGen.nextInt(5);

                // Setting the new image
                ballDisplay.setImageResource(ballArray[number]);
            }
        });
    }
}

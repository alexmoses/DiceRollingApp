package com.alexmoses.diceroller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //defines a variable in type of button

        Button rollButton;

        //links button variable to the imageview element located in xml file
        rollButton = (Button) findViewById(R.id.rollbutton);

        //links variable to the imageview located in the xml file
          final ImageView leftDice = (ImageView) findViewById(R.id.image_leftdice);

       final ImageView rightDice = (ImageView) findViewById(R.id.image_rightdice);

        final int[] diceArray = {
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6};

        //sets up a listener for the button we defined in the earlier variable
        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // test button by using log print for debug module
                Log.d("Dice Roller", "Its working");

                //generate randomized number using the random function and limit it to 6 integers
                Random randomNumberGenerator = new Random();

                int number = randomNumberGenerator.nextInt(6);
                int number2 = randomNumberGenerator.nextInt(6);

                Log.d("Dice Roller", "The Random number is " + number);

                leftDice.setImageResource(diceArray[number]);

                rightDice.setImageResource(diceArray[number2]);



            }
        });



    }
}

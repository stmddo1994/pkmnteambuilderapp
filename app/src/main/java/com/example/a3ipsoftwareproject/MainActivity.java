package com.example.a3ipsoftwareproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    //These are our objects
    Button startButton, start2Button, femaleButton, maleButton, findPokeButton, createButton, continueButton, addMovesButton, keepAddingButton;
    Spinner moves1,moves2,moves3, moves4;
    TextView trainerName;
    int counter;
    //Boolean isMale = true;

    //public static final String IS_MALE = "com.example.a3ipsoftwareproject.IS_MALE";
    //public static final String TRAINER_NAME = "com.example.a3ipsoftwareproject.TRAINER_NAME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        counter = 0;

        setContentView(R.layout.activity_main);
        //These are the buttons
        startButton = findViewById(R.id.start_button);
        start2Button = findViewById(R.id.start2_button);
        femaleButton = findViewById(R.id.female_button);
        maleButton = findViewById(R.id.male_button);
        findPokeButton = findViewById(R.id.findPoke_button);
        createButton = findViewById(R.id.createPoke_button);
        continueButton = findViewById(R.id.continue_button);
        addMovesButton = findViewById(R.id.addMoves_button);
        keepAddingButton = findViewById(R.id.keepAdding_button);

        //These are the image buttons

        //These are the spinners/drop-down menus for the moves
        moves1 = findViewById(R.id.moves1_spinner);
        moves2 = findViewById(R.id.moves2_spinner);
        moves3 = findViewById(R.id.moves3_spinner);
        moves4 = findViewById(R.id.moves4_spinner);

        //These are our TextViews
        trainerName = findViewById(R.id.trainerName_textView);


        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMainActivity_chooseTrainer();
            }
        });


        /*maleButton.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isMale = true;
            }
        }));

        femaleButton.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isMale = false;
            }
        }));*/

        /*start2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               openMainActivity_chooseTeam();
            }
        });*/

/*
        //Listening to button event
        startButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {
                //Starting a new Intent
                Intent chooseTrainer = new Intent(getApplicationContext(), MainActivity_chooseTrainer.class);

                //Sending data to another Activity
                chooseTrainer.putExtra("name", trainerName.getText().toString());
                //chooseTrainer.putExtra("email", .getText().toString());

                //Log.e("n", trainerName.getText();
                        //+ inputEmail.getText());

                startActivity(chooseTrainer);

            }
        });

*/

                //displayTextView.setText(""); //This is making "TextView" into an empty string

    }

    private void openMainActivity_chooseTrainer() {
        Intent intent = new Intent(this, MainActivity_chooseTrainer.class);
        intent.putExtra("Counter", counter);
        startActivity(intent);
    }

    /*public void openMainActivity_chooseTeam(){
        Intent intent = new Intent(this, MainActivity_chooseTeam.class);
        startActivity(intent);
    }*/

}
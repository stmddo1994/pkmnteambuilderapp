package com.example.a3ipsoftwareproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Parcelable;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class displayStarter6 extends AppCompatActivity {

    ArrayList<Pkmn> teamArray;
    TextView Pkmn1, Pkmn2, Pkmn3, Pkmn4, Pkmn5, Pkmn6;
    Pkmn Pokemon1, Pokemon2, Pokemon3, Pokemon4, Pokemon5, Pokemon6;
    ImageView imagePkmn1, imagePkmn2, imagePkmn3, imagePkmn4, imagePkmn5, imagePkmn6;
    int imageNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_starter6);

        teamArray = getIntent().getParcelableArrayListExtra("Pokemon Team");

        Pkmn1 = findViewById(R.id.Pkmn1);
        Pkmn2 = findViewById(R.id.Pkmn2);
        Pkmn3 = findViewById(R.id.Pkmn3);
        Pkmn4 = findViewById(R.id.Pkmn4);
        Pkmn5 = findViewById(R.id.Pkmn5);
        Pkmn6 = findViewById(R.id.Pkmn6);

        imagePkmn1 = findViewById(R.id.imagePkmn1);
        imagePkmn2 = findViewById(R.id.imagePkmn2);
        imagePkmn3 = findViewById(R.id.imagePkmn3);
        imagePkmn4 = findViewById(R.id.imagePkmn4);
        imagePkmn5 = findViewById(R.id.imagePkmn5);
        imagePkmn6 = findViewById(R.id.imagePkmn6);

        Pokemon1 = teamArray.get(0);
        Pokemon2 = teamArray.get(1);
        Pokemon3 = teamArray.get(2);
        Pokemon4 = teamArray.get(3);
        Pokemon5 = teamArray.get(4);
        Pokemon6 = teamArray.get(5);


        Pkmn1.setText(Pokemon1.getPokemon());
        Pkmn2.setText(Pokemon2.getPokemon());
        Pkmn3.setText(Pokemon3.getPokemon());
        Pkmn4.setText(Pokemon4.getPokemon());
        Pkmn5.setText(Pokemon5.getPokemon());
        Pkmn6.setText(Pokemon6.getPokemon());

        for(int i = 0; i < 6; i++)
        {
            if ("ball".equals(teamArray.get(i).getBodytype())) {
                imageNum = R.drawable.ball;
            } else if ("legs".equals(teamArray.get(i).getBodytype())) {
                imageNum = R.drawable.legs;
            } else if ("fish".equals(teamArray.get(i).getBodytype())) {
                imageNum = R.drawable.fish;
            } else if ("insect".equals(teamArray.get(i).getBodytype())) {
                imageNum = R.drawable.insect;
            } else if ("quadruped".equals(teamArray.get(i).getBodytype())) {
                imageNum = R.drawable.quadruped;
            } else if ("wings".equals(teamArray.get(i).getBodytype())) {
                imageNum = R.drawable.wings;
            } else if ("bug-wings".equals(teamArray.get(i).getBodytype())) {
                imageNum = R.drawable.bug_wings;
            } else if ("heads".equals(teamArray.get(i).getBodytype())) {
                imageNum = R.drawable.heads;
            } else if ("tentacles".equals(teamArray.get(i).getBodytype())) {
                imageNum = R.drawable.tentacles;
            } else if ("blob".equals(teamArray.get(i).getBodytype())) {
                imageNum = R.drawable.blob;
            } else if ("upright".equals(teamArray.get(i).getBodytype())) {
                imageNum = R.drawable.upright;
            } else if ("humanoid".equals(teamArray.get(i).getBodytype())) {
                imageNum = R.drawable.humanoid;
            } else if ("squiggly".equals(teamArray.get(i).getBodytype())) {
                imageNum = R.drawable.squiggly;
            } else if ("arms".equals(teamArray.get(i).getBodytype())) {
                imageNum = R.drawable.arms;
            }

                if (i == 0) {
                    imagePkmn1.setImageResource(imageNum);
                } else if (i == 1) {
                    imagePkmn2.setImageResource(imageNum);
                } else if (i == 2) {
                    imagePkmn3.setImageResource(imageNum);
                } else if (i == 3) {
                    imagePkmn4.setImageResource(imageNum);
                } else if (i == 4) {
                    imagePkmn5.setImageResource(imageNum);
                } else if (i == 5) {
                    imagePkmn6.setImageResource(imageNum);
                }

        }


    }


}
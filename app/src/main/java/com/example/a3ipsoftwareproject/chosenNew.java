package com.example.a3ipsoftwareproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class chosenNew extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    Button continueButton;
    EditText pkmnName;
    ImageButton ball, legs, fish, insect, quadruped, wings, bugWings, heads, tentacles, blob, upright, humanoid, squiggly, arms;
    Spinner type1, type2;
    Pkmn newPkmn;
    String [] types = {"None","Normal","Fighting","Flying","Poison","Ground","Rock","Bug","Ghost","Steel","Fire","Water","Grass","Electric","Psychic","Ice","Dragon","Dark","Fairy"};
    ArrayAdapter<String> type1ArrayAdapter, type2ArrayAdapter;
    String selectType1, selectType2, selectBodyshape;
    int counter;
    ArrayList<Pkmn> teamArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chosen_new);

        counter = getIntent().getIntExtra("Counter", 0);
        teamArray = getIntent().getParcelableArrayListExtra("Team Transfer");

        ball = findViewById(R.id.body1_imageButton_ball);
        legs = findViewById(R.id.body2_imageButton_legs);
        fish = findViewById(R.id.body3_imageButton_fish);
        insect = findViewById(R.id.body4_imageButton_insect);
        quadruped = findViewById(R.id.body5_imageButton_quadruped);
        wings = findViewById(R.id.body6_imageButton_wings);
        bugWings = findViewById(R.id.body7_imageButton_bugwings);
        heads = findViewById(R.id.body8_imageButton_heads);
        tentacles = findViewById(R.id.body9_imageButton_tentacles);
        blob = findViewById(R.id.body10_imageButton_blob);
        upright = findViewById(R.id.body11_imageButton_upright);
        humanoid = findViewById(R.id.body12_imageButton_humanoid);
        squiggly = findViewById(R.id.body13_imageButton_squiggly);
        arms = findViewById(R.id.body14_imageButton_arms);

        continueButton = findViewById(R.id.continue_button);
        type1 = findViewById(R.id.type1_spinner);
        type2 = findViewById(R.id.type2_spinner);

        type1ArrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, types);
        type1ArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        type1.setAdapter(type1ArrayAdapter);
        type1.setOnItemSelectedListener(this);

        type2ArrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, types);
        type2ArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        type2.setAdapter(type2ArrayAdapter);
        type2.setOnItemSelectedListener(this);

        ball.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectBodyshape = "ball";
                Toast.makeText(getApplicationContext(), "You've selected the Ball bodytype", Toast.LENGTH_SHORT).show();
            }
        });

        legs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectBodyshape = "legs";
                Toast.makeText(getApplicationContext(), "You've selected the Legs bodytype", Toast.LENGTH_SHORT).show();
            }
        });

        fish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectBodyshape = "fish";
                Toast.makeText(getApplicationContext(), "You've selected the Fish bodytype", Toast.LENGTH_SHORT).show();
            }
        });

        insect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectBodyshape = "insect";
                Toast.makeText(getApplicationContext(), "You've selected the Insect bodytype", Toast.LENGTH_SHORT).show();
            }
        });

        quadruped.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectBodyshape = "quadruped";
                Toast.makeText(getApplicationContext(), "You've selected the Quadruped bodytype", Toast.LENGTH_SHORT).show();
            }
        });

        wings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectBodyshape = "wings";
                Toast.makeText(getApplicationContext(), "You've selected the Wings bodytype", Toast.LENGTH_SHORT).show();
            }
        });

        bugWings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectBodyshape = "bug-wings";
                Toast.makeText(getApplicationContext(), "You've selected the Bug-Wings bodytype", Toast.LENGTH_SHORT).show();
            }
        });

        heads.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectBodyshape = "heads";
                Toast.makeText(getApplicationContext(), "You've selected the Heads bodytype", Toast.LENGTH_SHORT).show();
            }
        });

        tentacles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectBodyshape = "tentacles";
                Toast.makeText(getApplicationContext(), "You've selected the Tentacles bodytype", Toast.LENGTH_SHORT).show();
            }
        });

        blob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectBodyshape = "blob";
                Toast.makeText(getApplicationContext(), "You've selected the Blob bodytype", Toast.LENGTH_SHORT).show();
            }
        });

        upright.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectBodyshape = "upright";
                Toast.makeText(getApplicationContext(), "You've selected the Upright bodytype", Toast.LENGTH_SHORT).show();
            }
        });

        humanoid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectBodyshape = "humanoid";
                Toast.makeText(getApplicationContext(), "You've selected the Humanoid bodytype", Toast.LENGTH_SHORT).show();
            }
        });

        squiggly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectBodyshape = "squiggly";
                Toast.makeText(getApplicationContext(), "You've selected the Squiggly bodytype", Toast.LENGTH_SHORT).show();
            }
        });

        arms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectBodyshape = "arms";
                Toast.makeText(getApplicationContext(), "You've selected the Arms bodytype", Toast.LENGTH_SHORT).show();
            }
        });

        continueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                createPokemon();
            }
        });
    }

    public void createPokemon() {
        pkmnName = findViewById(R.id.pkmGivenName_editText);

        if (selectBodyshape == null)
            Toast.makeText(getApplicationContext(), "Please choose a bodytype", Toast.LENGTH_SHORT).show();
        else
        {
            if (selectType1 == null || selectType1 == "None")
                Toast.makeText(getApplicationContext(), "Type 1 must have a type", Toast.LENGTH_SHORT).show();
            else
            {
                if (selectType2 == "None" || selectType2 == selectType1)
                    selectType2 = null;
                newPkmn = new Pkmn(0, pkmnName.getText().toString(), selectBodyshape, selectType1, selectType2);
                Intent intent = new Intent(this, chooseMoves.class);
                intent.putExtra("your Pkmn", newPkmn);
                intent.putExtra("Counter", counter);
                intent.putExtra("Team Transfer", teamArray);
                startActivity(intent);
            }
        }
            }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        String text = adapterView.getItemAtPosition(i).toString();
        switch (adapterView.getId()) {
            case R.id.type1_spinner:
                selectType1 = text;
                break;
            case R.id.type2_spinner:
                selectType2 = text;
                break;
            default:
                break;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
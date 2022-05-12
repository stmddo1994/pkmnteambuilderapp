package com.example.a3ipsoftwareproject;

import com.example.a3ipsoftwareproject.DBHandler;
import com.example.a3ipsoftwareproject.Pkmn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity_chooseTeam extends AppCompatActivity {

    Button findPokeButton, createButton;
    DBHandler db;
    int counter;
    ArrayList<Pkmn> teamArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_choose_pokemon);

        db = new DBHandler(getApplicationContext());

        findPokeButton = findViewById(R.id.findPoke_button);
        createButton = findViewById(R.id.createPoke_button);

        counter = getIntent().getIntExtra("Counter", 0);
        if (counter == 0)
            teamArray = new ArrayList<>();
        else
            teamArray = getIntent().getParcelableArrayListExtra("Pokemon Team");

        findPokeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectPokemon();
            }
        });

        createButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                makeNewPokemon();
            }
        });
    }

    public void selectPokemon(){
        EditText findPokemon = findViewById(R.id.existingInput);
        String search = "'" + findPokemon.getText().toString() + "'";
        Pkmn searchResult;
        if (search.isEmpty())
            Toast.makeText(getApplicationContext(), "Please enter Pokemon name.", Toast.LENGTH_SHORT).show();
        else {
            try {
                searchResult = db.readPkmn(search);
                Intent intent = new Intent(this, chosenExisting.class);
                intent.putExtra("found Pkmn", searchResult);
                intent.putExtra("Counter", counter);
                intent.putParcelableArrayListExtra("Team Transfer", teamArray);
                startActivity(intent);
            }
            catch(Exception e){
                Toast.makeText(getApplicationContext(), "Pokemon not found. Reenter name.", Toast.LENGTH_SHORT).show();
            }
        }
    }

    public void makeNewPokemon(){
        Intent intent = new Intent(this, chosenNew.class);
        intent.putExtra("Counter", counter);
        intent.putParcelableArrayListExtra("Team Transfer", teamArray);
        startActivity(intent);
    }


}
package com.example.a3ipsoftwareproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class chooseMoves extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    Spinner moves1, moves2, moves3, moves4;
    ArrayAdapter<Moves> moves1ArrayAdapter, moves2ArrayAdapter, moves3ArrayAdapter, moves4ArrayAdapter;
    String selectMove1, selectMove2, selectMove3, selectMove4;
    Pkmn savedPkmn;
    DBHandler db;
    int counter;
    ArrayList<Pkmn> teamArray;
    Button addMoves;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_moves);

        db = new DBHandler(getApplicationContext());
        savedPkmn = getIntent().getParcelableExtra("your Pkmn");
        counter = getIntent().getIntExtra("Counter", 0);
        teamArray = getIntent().getParcelableArrayListExtra("Team Transfer");

        moves1 = findViewById(R.id.moves1_spinner);
        moves2 = findViewById(R.id.moves2_spinner);
        moves3 = findViewById(R.id.moves3_spinner);
        moves4 = findViewById(R.id.moves4_spinner);

        addMoves = findViewById(R.id.addMoves_button);

        moves1ArrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, db.readAllMoves());
        moves1ArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        moves1.setAdapter(moves1ArrayAdapter);
        moves1.setOnItemSelectedListener(this);

        moves2ArrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, db.readAllMoves());
        moves2ArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        moves2.setAdapter(moves2ArrayAdapter);
        moves2.setOnItemSelectedListener(this);

        moves3ArrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, db.readAllMoves());
        moves3ArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        moves3.setAdapter(moves3ArrayAdapter);
        moves3.setOnItemSelectedListener(this);

        moves4ArrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, db.readAllMoves());
        moves4ArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        moves4.setAdapter(moves4ArrayAdapter);
        moves4.setOnItemSelectedListener(this);

        addMoves.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addToTeam();
            }
        });
    }

    public void addToTeam(){
        teamArray.add(savedPkmn);
        counter++;
        Toast.makeText(getApplicationContext(), Integer.toString(counter), Toast.LENGTH_SHORT).show();
        if (counter < 6){
            Intent intent1 = new Intent(this, MainActivity_chooseTeam.class);
            intent1.putExtra("Counter", counter);
            intent1.putParcelableArrayListExtra("Pokemon Team", teamArray);
            startActivity(intent1);
        }
        else{
            Intent intent2 = new Intent(this, displayStarter6.class);
            intent2.putParcelableArrayListExtra("Pokemon Team", teamArray);
            counter = 0;
            startActivity(intent2);
        }
    }


    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        String text = adapterView.getItemAtPosition(i).toString();
        switch (adapterView.getId()) {
            case R.id.moves1_spinner:
                selectMove1 = text;
                break;
            case R.id.moves2_spinner:
                selectMove2 = text;
                break;
            case R.id.moves3_spinner:
                selectMove3 = text;
                break;
            case R.id.moves4_spinner:
                selectMove4 = text;
                break;
            default:
                break;
        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
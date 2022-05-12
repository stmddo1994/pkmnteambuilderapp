package com.example.a3ipsoftwareproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class chosenExisting extends AppCompatActivity {

    Button keepAddingButton;
    TextView textView3;
    Pkmn foundPkmn;
    int counter;
    ArrayList<Pkmn> teamArray;
    ImageView pkmnImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chosen_existing);

        keepAddingButton = findViewById(R.id.keepAdding_button);
        textView3 = findViewById(R.id.textView3);
        pkmnImage = findViewById(R.id.imageView2);

        foundPkmn = getIntent().getParcelableExtra("found Pkmn");
        counter = getIntent().getIntExtra("Counter", 0);
        teamArray = getIntent().getParcelableArrayListExtra("Team Transfer");

        textView3.setText(foundPkmn.getPokemon());

        switch (foundPkmn.getBodytype()){
            case ("ball"):
                pkmnImage.setImageResource(R.drawable.ball);
                break;
            case ("legs"):
                pkmnImage.setImageResource(R.drawable.legs);
                break;
            case ("fish"):
                pkmnImage.setImageResource(R.drawable.fish);
                break;
            case ("insect"):
                pkmnImage.setImageResource(R.drawable.insect);
                break;
            case ("quadruped"):
                pkmnImage.setImageResource(R.drawable.quadruped);
                break;
            case ("wings"):
                pkmnImage.setImageResource(R.drawable.wings);
                break;
            case ("bug-wings"):
                pkmnImage.setImageResource(R.drawable.bug_wings);
                break;
            case ("heads"):
                pkmnImage.setImageResource(R.drawable.heads);
                break;
            case ("tentacles"):
                pkmnImage.setImageResource(R.drawable.tentacles);
                break;
            case ("blob"):
                pkmnImage.setImageResource(R.drawable.blob);
                break;
            case ("upright"):
                pkmnImage.setImageResource(R.drawable.upright);
                break;
            case ("humanoid"):
                pkmnImage.setImageResource(R.drawable.humanoid);
                break;
            case ("squiggly"):
                pkmnImage.setImageResource(R.drawable.squiggly);
                break;
            case ("arms"):
                pkmnImage.setImageResource(R.drawable.arms);
                break;
            default:
                break;
        }

        keepAddingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toMoves();
            }
        });

    }

    public void toMoves(){
        Intent intent = new Intent(this, chooseMoves.class);
        intent.putExtra("your Pkmn", foundPkmn);
        intent.putExtra("Counter", counter);
        intent.putParcelableArrayListExtra("Team Transfer", teamArray);
        startActivity(intent);
    }


}
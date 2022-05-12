package com.example.a3ipsoftwareproject;

import androidx.appcompat.app.AppCompatActivity;
import com.example.a3ipsoftwareproject.MainActivity;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;


public class MainActivity_chooseTrainer extends AppCompatActivity {
    Button start2Button;
    int counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_choose_trainer);

        counter = getIntent().getIntExtra("Counter", 0);
        start2Button = findViewById(R.id.start2_button);

        start2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMainActivity_chooseTeam();
            }
        });


    }
    public void openMainActivity_chooseTeam(){
        Intent intent = new Intent(this, MainActivity_chooseTeam.class);
        intent.putExtra("Counter", counter);
        startActivity(intent);
    }



}
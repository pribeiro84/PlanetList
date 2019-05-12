package com.android.example.planetlist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitPlanet(View v)
    {
        EditText planetName = findViewById(R.id.planet_name);
        EditText planetDistanceText = findViewById(R.id.planet_distance);
        CheckBox gasGiant = findViewById(R.id.gas_giant);
        int planetDistance = Integer.parseInt(planetDistanceText.getText().toString());

        Planet newPlanet = new Planet(planetName.getText().toString(), planetDistance, gasGiant.isChecked());

        Intent intent = new Intent();
        intent.putExtra(Keys.PLANET, newPlanet);

        setResult(RESULT_OK, intent);
        finish();
    }
}


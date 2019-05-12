package com.android.example.planetlist;

import android.content.Intent;
import android.os.Debug;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class ListActivity extends AppCompatActivity {
    TextView planetList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        planetList = findViewById(R.id.planet_list);
    }

    public void addPlanet(View v)
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivityForResult(intent, 1111);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        if (requestCode == 1111 && resultCode == RESULT_OK) {
            Planet planet = (Planet) data.getSerializableExtra(Keys.PLANET);
            planetList.append("\nPlanet: " + planet.getName());
            planetList.append("\nDistance (km): " + planet.getDistance());
            if (planet.isGasGiant())
            {
                planetList.append("\nGas Giant?: Yes");
            }
            else
            {
                planetList.append("\nGas Giant?: No");
            }

            planetList.append("\n");
        }
    }
}
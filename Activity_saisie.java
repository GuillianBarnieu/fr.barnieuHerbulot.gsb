package fr.sio.gsb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class Activity_saisie extends AppCompatActivity implements  View.OnClickListener, AdapterView.OnItemSelectedListener {
    Button buttonAccueil;
    Button buttonRetour;
    Button buttonDeconnexion;
    Spinner spinnerPracti;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saisie);

            spinnerPracti = (Spinner) findViewById(R.id.spinnerPracti);
            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.spinnerPracti, android.R.layout.simple_spinner_item );
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinnerPracti.setAdapter(adapter);
            spinnerPracti.setOnItemSelectedListener(this);






            buttonDeconnexion = (Button) findViewById(R.id.buttonDeconnexion);
            buttonDeconnexion.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    openActivityMain();
                }
            });
            buttonRetour = (Button) findViewById(R.id.buttonRetour);
            buttonRetour.setOnClickListener((new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    openActivityAccueil();
                }
            }));

            buttonAccueil = (Button) findViewById(R.id.buttonAccueil);
            buttonAccueil.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    openActivityAccueil();
                }
            });
        }
        public void openActivityAccueil(){
            Intent accueil = new Intent(this, AccueilActivity.class);
            startActivity(accueil);
        }

        public void openActivityMain(){
            Intent main = new Intent(this, MainActivity.class);
            startActivity(main);
        }



    @Override
    public void onClick(View v) {

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}

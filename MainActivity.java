package fr.sio.gsb;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button buttonAccueil;
    Button buttonConnexion;
    Button buttonRetour;
    Button buttonDeconnexion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Button
        buttonDeconnexion = (Button) findViewById(R.id.buttonDeconnexion);
        buttonDeconnexion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityMain();
            }
        });
        buttonConnexion = (Button) findViewById(R.id.buttonConnexion);
        buttonConnexion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityAccueil();
            }
        });
        buttonAccueil = (Button) findViewById(R.id.buttonAccueil);
        buttonAccueil.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                openActivityAccueil();
            }
        });
    }
    public void openActivityAccueil(){
        Intent accueil = new Intent(this,AccueilActivity.class);
        startActivity(accueil);
    }
    public void openActivityMain(){
        Intent main = new Intent(this, MainActivity.class);
        startActivity(main);
    }

    @Override
    public void onClick(View v) {

    }
}

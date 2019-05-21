package com.example.helpers;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;



public class afficher_inscription_etudiant extends Activity {

    public void onCreate(Bundle savedInstanceState) //A la   creation de la vue
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inscription_etudiant); //Afficher la vue portant le nom "inscription"
        final Button charger = (Button) findViewById(R.id.charger);
        final Button suivant = (Button) findViewById(R.id.suivant);

        charger.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
//ouvrir fichier
    }
});
        suivant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(afficher_inscription_etudiant.this, afficher_home.class);  //Lancer l'activité DisplayVue
                startActivity(intent);    //Afficher la vue
            }
        });
    }
}

package com.example.helpers;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;

public class afficher_sinscrire extends Activity {


    public void onCreate(Bundle savedInstanceState) //A la   creation de la vue
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inscription); //Afficher la vue portant le nom "inscription"
        final RadioButton Veteran = (RadioButton) findViewById(R.id.vieux);   //Appel du "button1"
        final RadioButton Etudiant = (RadioButton) findViewById(R.id.radioButton2);   //Appel du "button1"
        final RadioButton Vieux = (RadioButton) findViewById(R.id.vieux);   //Appel du "button1"
        final Button ButtonInscription = (Button) findViewById(R.id.button);   //Appel du "button1"

        ButtonInscription.setOnClickListener(new View.OnClickListener()      //Creation du listener sur ce bouton
        {
            public void onClick(View actuelView)    //au clic sur le bouton
            {
                if(Etudiant.isChecked()) {
                    Intent intent = new Intent(afficher_sinscrire.this, afficher_inscription_etudiant.class);  //Lancer l'activité DisplayVue
                    startActivity(intent);    //Afficher la vue
                }
                if(Vieux.isChecked()) {
                    Intent intent = new Intent(afficher_sinscrire.this, afficher_inscription_old.class);  //Lancer l'activité DisplayVue
                    startActivity(intent);    //Afficher la vue
                }
            }
        });

    }


}

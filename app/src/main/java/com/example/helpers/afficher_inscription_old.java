package com.example.helpers;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class afficher_inscription_old extends Activity {
    public void onCreate(Bundle savedInstanceState) //A la   creation de la vue
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inscription_old); //Afficher la vue portant le nom "inscription"

        final Button suivant = (Button) findViewById(R.id.suivant1);

        suivant.setOnClickListener(new View.OnClickListener()      //Creation du listener sur ce bouton);
        {
            public void onClick(View actuelView)    //au clic sur le bouton
            {
                Intent intent = new Intent(afficher_inscription_old.this, afficher_home_old.class);  //Lancer l'activité DisplayVue
                startActivity(intent);    //Afficher la vue
            }
        });
    }
}

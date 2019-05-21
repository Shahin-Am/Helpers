package com.example.helpers;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.widget.TextView;
        import android.content.Intent;
        import android.view.View;
        import android.widget.Button;

        import java.sql.Connection;
        import java.sql.DriverManager;


public class MainActivity extends AppCompatActivity {

    public void onCreate(Bundle savedInstanceState)
    {
     /*   try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver O.K.");

           String url = "jdbc:mysql://localhost:8889/helpers";
            //String url = "jdbc:mysql://192.102.224.246:8889/helpers";

            String user = "root";
            String passwd = "root";

            Connection conn = DriverManager.getConnection(url, user, passwd);
            System.out.println("Connexion effective !");

        }
        catch (Exception e) {
            e.printStackTrace();
        }

*/
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);  //Définition de la vue principale
        Button ButtonInscription = (Button) findViewById(R.id.button1);   //Appel du "button1"
        ButtonInscription.setOnClickListener(new View.OnClickListener()      //Creation du listener sur ce bouton
        {
            @Override
            public void onClick(View actuelView)    //au clic sur le bouton
            {
                Intent intent = new Intent(MainActivity.this, afficher_sinscrire.class);  //Lancer l'activité DisplayVue
                startActivity(intent);    //Afficher la vue
            }
        });
    }

}




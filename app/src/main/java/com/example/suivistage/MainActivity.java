package com.example.suivistage;

import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private Button button;
    ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.btnAjouter);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity1();
            }
        });
        //Création d'une instance de la classe DAOClient
        DAOClient BddFicheStage = new DAOClient(this);
//on associe un objet java à la liste view des clients
        ListView listViewClients = findViewById(R.id.listeStage);
//On ouvre la table
        BddFicheStage.open();
//on récupère tous les fiches via le curseur
        Cursor c = BddFicheStage.getData();
        Toast.makeText(getApplicationContext(), "il y a " + String.valueOf(c.getCount()) +
                " fiches dans la table", Toast.LENGTH_LONG).show();
// colonnes à afficher
        String[] columns = new String[]{DAOClient.COL_NOMPRENOM, DAOClient.COL_EMAIL, DAOClient.COL_EMAIL};
// champs dans lesquelles afficher les colonnes
        int[] to = new int[]{R.id.textViewNom, R.id.textViewPrenom, R.id.textViewNomEntreprise};
//on choisit le type d’adapter pour notre affichage de la liste
        SimpleCursorAdapter dataAdapter = new SimpleCursorAdapter(this,
                R.layout.activity_main, c, columns, to,0);
// on assigne cet adapter à notre ListView
        listViewClients.setAdapter(dataAdapter);
//on ferme la table
        BddFicheStage.close();






    }
    public void openActivity1() {
        Intent intent = new Intent(this, etape1Activity.class);
        startActivity(intent);

    }

}

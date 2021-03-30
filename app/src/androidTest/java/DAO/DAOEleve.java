package DAO;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.example.suivistage.BddFicheStage;

import Métier.Eleve;

public class DAOEleve {
    static final int VERSION_BDD =1;
    private static final String NOM_BDD = "BddFicheStage.db";

    static final String TABLE_ELEVE = "table_Eleve";
    static final String COL_ID_ELEVE = "Id_Eleve";
    static final String COL_NOM_ELEVE = "Nom";
    static final String COL_PRENOM_ELEVE = "Prenom";
    static final String COL_CLASSE_ELEVE = "Classe";
    static final String COL_ANNEE_ELEVE = "Annee";

    static final int NUM_COL_ID_ELEVE = 0;
    static final int NUM_COL_NOM_ELEVE = 1;
    static final int NUM_COL_PRENOM_ELEVE = 2;
    static final int NUM_COL_CLASSE_ELEVE = 3;
    static final int NUM_COL_ANNEE_ELEVE = 4;

    private BddFicheStage tableEleve;
    private Context context;
    private SQLiteDatabase db;

    //le constructeur
    public DAOEleve (Context context){
        this.context = context;
        tableEleve = new BddFicheStage(context, NOM_BDD, null, VERSION_BDD);
    }

    public DAOEleve open(){
        db = tableEleve.getWritableDatabase();
        return this;
    }

    public DAOEleve close (){
        db.close();
        return null;
    }

    public long insererEleve (Eleve unEleve){
        //Création d'un ContentValues (fonctionne comme une HashMap)
        ContentValues values = new ContentValues();

        //On lui ajoute une valeur associé à une clé (qui est le nom de la colonne où on veut mettre la valeur)
        values.put(COL_NOM_ELEVE, unEleve.getNom());
        values.put(COL_PRENOM_ELEVE, unEleve.getPrenom());
        values.put(COL_CLASSE_ELEVE, unEleve.getClasse());
        values.put(COL_ANNEE_ELEVE, unEleve.getAnnee());

        //On insère l'objet dans la BDD via le ContentValues
        return db.insert(TABLE_ELEVE, null, values);
    }
}

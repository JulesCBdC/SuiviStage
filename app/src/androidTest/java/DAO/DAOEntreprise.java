package DAO;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.suivistage.BddFicheStage;

import Métier.Eleve;
import Métier.Entreprise;

public class DAOEntreprise {
    static final int VERSION_BDD =1;
    private static final String NOM_BDD = "BddFicheStage.db";

    static final String TABLE_ENTREPRISE = "table_Entreprise";
    static final String COL_ID_ENTREPRISE = "Id_Entreprise";
    static final String COL_NOM_ENTREPRISE = "Nom";
    static final String COL_ADRESSE_ENTREPRISE = "Adresse";
    static final String COL_TEL_ENTREPRISE = "Tel";
    static final String COL_ID_TUTEURENTREPRISE_TUTEUR = "Id_Tuteur";

    static final int NUM_COL_ID_ENTREPRISE = 0;
    static final int NUM_COL_NOM_ENTREPRISE = 1;
    static final int NUM_COL_ADRESSE_ENTREPRISE = 2;
    static final int NUM_COL_TEL_ENTREPRISE = 3;
    static final int NUM_COL_ID_TUTEURENTREPRISE_ENTREPRISE = 4;

    private BddFicheStage tableEntreprise;
    private Context context;
    private SQLiteDatabase db;

    //le constructeur
    public DAOEntreprise (Context context){
        this.context = context;
        tableEntreprise = new BddFicheStage(context, NOM_BDD, null, VERSION_BDD);
    }

    public DAOEntreprise open(){
        db = tableEntreprise.getWritableDatabase();
        return this;
    }

    public DAOEntreprise close (){
        db.close();
        return null;
    }

    public long insererEntreprise (Entreprise uneEntreprise){
        //Création d'un ContentValues (fonctionne comme une HashMap)
        ContentValues values = new ContentValues();

        //On lui ajoute une valeur associé à une clé (qui est le nom de la colonne où on veut mettre la valeur)
        values.put(COL_NOM_ENTREPRISE, uneEntreprise.getNom());
    values.put(COL_ADRESSE_ENTREPRISE, uneEntreprise.getAdresse());
        values.put(COL_TEL_ENTREPRISE, uneEntreprise.getTel());

        //On insère l'objet dans la BDD via le ContentValues
        return db.insert(TABLE_ENTREPRISE, null, values);
    }
}

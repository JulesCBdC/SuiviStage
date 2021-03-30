package DAO;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.suivistage.BddFicheStage;

public class DAOProfesseur {
    static final int VERSION_BDD =1;
    private static final String NOM_BDD = "BddFicheStage.db";

    static final String TABLE_PROFESSEUR = "table_Professeur";
    static final String COL_ID_PROFESSEUR = "Id_Professeur";
    static final String COL_NOM_PROFESSEUR = "Nom";
    static final String COL_PRENOM_PROFESSEUR = "Prenom";
    static final String COL_EMAIL_PROFESSEUR = "Email";

    static final int NUM_COL_ID_PROFESSEUR = 0;
    static final int NUM_COL_NOM_PROFESSEUR = 1;
    static final int NUM_COL_PRENOM_PROFESSEUR = 2;
    static final int NUM_COL_EMAIL_PROFESSEUR = 3;

    private BddFicheStage tableProfesseur;
    private Context context;
    private SQLiteDatabase db;

    //le constructeur
    public DAOProfesseur (Context context){
        this.context = context;
        tableProfesseur = new BddFicheStage(context, NOM_BDD, null, VERSION_BDD);
    }

    public DAOProfesseur open(){
        db = tableProfesseur.getWritableDatabase();
        return this;
    }

    public DAOProfesseur close (){
        db.close();
        return null;
    }
}

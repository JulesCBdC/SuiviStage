package DAO;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.suivistage.BddFicheStage;

public class DAOTuteurEntreprise {
    static final int VERSION_BDD =1;
    private static final String NOM_BDD = "BddFicheStage.db";

    static final String TABLE_TUTEUR_ENTREPRISE = "table_TuteurEntreprise";
    static final String COL_ID_TUTEUR_ENTREPRISE = "Id_TuteurEntreprise";
    static final String COL_NOM_TUTEUR_ENTREPRISE = "Nom";
    static final String COL_PRENOM_TUTEUR_ENTREPRISE = "Prenom";
    static final String COL_TEL_TUTEUR_ENTREPRISE = "Tel";
    static final String COL_MAIL_TUTEUR_ENTREPRISE = "Mail";

    static final int NUM_COL_ID_TUTEUR_ENTREPRISE = 0;
    static final int NUM_COL_NOM_TUTEUR_ENTREPRISE = 1;
    static final int NUM_COL_PRENOM_TUTEUR_ENTREPRISE = 2;
    static final int NUM_COL_TEL_TUTEUR_ENTREPRISE = 3;
    static final int NUM_COL_MAIL_TUTEUR_ENTREPRISE = 4;

    private BddFicheStage tableTuteurEntreprise;
    private Context context;
    private SQLiteDatabase db;

    //le constructeur
    public DAOTuteurEntreprise (Context context){
        this.context = context;
        tableTuteurEntreprise = new BddFicheStage(context, NOM_BDD, null, VERSION_BDD);
    }

    public DAOTuteurEntreprise open(){
        db = tableTuteurEntreprise.getWritableDatabase();
        return this;
    }

    public DAOTuteurEntreprise close (){
        db.close();
        return null;
    }
}

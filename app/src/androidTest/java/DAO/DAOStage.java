package DAO;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.suivistage.BddFicheStage;

public class DAOStage {
    static final int VERSION_BDD =1;
    private static final String NOM_BDD = "BddFicheStage.db";

    static final String TABLE_STAGE = "table_Stage";
    static final String COL_ID_STAGE = "Id_Stage";
    static final String COL_INTITULE_STAGE = "Intitule";
    static final String COL_DEBUT_STAGE = "Debut";
    static final String COL_FIN_STAGE = "Fin";
    static final String COL_VISITE_STAGE = "Visite";
    static final String COL_COMPTERENDUE_STAGE = "CompteRendue";
    static final String COL_CONDITIONS_STAGE = "Conditions";
    static final String COL_TRAVAUXREAL_STAGE = "TravauxReal";
    static final String COL_RESSOURCESOUTILS_STAGE = "RessourcesOutils";
    static final String COL_COMMENTAIRES_STAGE = "Commentaires";
    static final String COL_PARTICIPATIONPROFESSEUR_STAGE = "ParticipationProfesseur";
    static final String COL_OPPORTUNITE_STAGE = "Opportunite";
    static final String COL_DATEOPPORTUNITE_STAGE = "DateOpportunite";
    static final String COL_ID_ELEVE_STAGE = "Id_Eleve";
    static final String COL_ID_PROFESSEUR_STAGE = "Id_Professeur";
    static final String COL_ID_ENTREPRISE_STAGE = "Id_Entreprise";

    static final int NUM_COL_ID_STAGE = 0;
    static final int NUM_COL_INTITULE_STAGE = 1;
    static final int NUM_COL_DEBUT_STAGE = 2;
    static final int NUM_COL_FIN_STAGE = 3;
    static final int NUM_COL_VISITE_STAGE = 4;
    static final int NUM_COL_COMPTERENDUE_STAGE = 5;
    static final int NUM_COL_CONDITIONS_STAGE = 6;
    static final int NUM_COL_TRAVAUXREAL_STAGE = 7;
    static final int NUM_COL_RESSOURCESOUTILS_STAGE = 8;
    static final int NUM_COL_COMMENTAIRES_STAGE = 9;
    static final int NUM_COL_PARTICIPATIONPROFESSEUR_STAGE = 10;
    static final int NUM_COL_OPPORTUNITE_STAGE = 11;
    static final int NUM_COL_DATEOPPORTUNITE_STAGE = 12;
    static final int NUM_COL_ID_ELEVE_STAGE = 13;
    static final int NUM_COL_ID_PROFESSEUR_STAGE = 14;
    static final int NUM_COL_ID_ENTREPRISE_STAGE = 15;

    private BddFicheStage tableStage;
    private Context context;
    private SQLiteDatabase db;

    //le constructeur
    public DAOStage (Context context){
        this.context = context;
        tableStage = new BddFicheStage(context, NOM_BDD, null, VERSION_BDD);
    }

    public DAOStage open(){
        db = tableStage.getWritableDatabase();
        return this;
    }

    public DAOStage close (){
        db.close();
        return null;
    }
}

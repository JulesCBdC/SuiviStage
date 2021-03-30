package com.example.suivistage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

    public class BddFicheStage extends SQLiteOpenHelper {

    //Création de la table stage
    private static final String TABLE_STAGE = "table_Stage";
    static final String COL_ID_STAGE = "Id_Stage";
    private static final String COL_INTITULE_STAGE = "Intitule";
    private static final String COL_DEBUT_STAGE = "Debut";
    private static final String COL_FIN_STAGE = "Fin";
    private static final String COL_VISITE_STAGE = "Visite";
    private static final String COL_COMPTERENDUE_STAGE = "CompteRendue";
    private static final String COL_CONDITION_STAGE = "Conditions";
    private static final String COL_TRAVAUXREAL_STAGE = "TravauxReal";
    private static final String COL_RESSOURCESOUTILS_STAGE = "RessoucesOutils";
    private static final String COL_COMMENTAIRE_STAGE = "Commentaires";
    private static final String COL_PARTICIPATIONPROFESSEUR_STAGE = "ParticipationProfesseur";
    private static final String COL_OPPORTUNITE_STAGE = "Opportunite";
    private static final String COL_DATEOPPORTUNITE_STAGE = "DateOpportunite";
    private static final String COL_ID_ELEVE_STAGE = "Id_Eleve";
    private static final String COL_ID_ENTREPRISE_STAGE = "Id_Stage";
    private static final String COL_ID_PROFESSEUR_STAGE = "Id_Professeur";

    //Requête SQL création de stage
    private static final String CREATE_TABLE_STAGE = "CREATE TABLE " + TABLE_STAGE + "("
            + COL_ID_STAGE + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + COL_INTITULE_STAGE + " TEXT NOT NULL, "
            + COL_DEBUT_STAGE + " INTEGER NOT NULL, "
            + COL_FIN_STAGE + " INTEGER NOT NULL, "
            + COL_VISITE_STAGE + " INTEGER NOT NULL, "
            + COL_COMPTERENDUE_STAGE + " TEXT NOT NULL, "
            + COL_CONDITION_STAGE + " TEXT NOT NULL, "
            + COL_TRAVAUXREAL_STAGE + " TEXT NOT NULL, "
            + COL_RESSOURCESOUTILS_STAGE + " TEXT NOT NULL, "
            + COL_COMMENTAIRE_STAGE + " TEXT NOT NULL, "
            + COL_PARTICIPATIONPROFESSEUR_STAGE + " INTEGER NOT NULL, "
            + COL_OPPORTUNITE_STAGE + " INTEGER NOT NULL, "
            + COL_ID_ELEVE_STAGE + " INTEGER NOT NULL, "
            + COL_ID_ENTREPRISE_STAGE + " INTEGER NOT NULL, "
            + COL_ID_PROFESSEUR_STAGE + " INTEGER NOT NULL, "
            + COL_DATEOPPORTUNITE_STAGE + " INTEGER NOT NULL);";


    //Création de la table eleve
    private static final String TABLE_ELEVE = "table_Eleve";
    static final String COL_ID_ELEVE = "Id_Eleve";
    private static final String COL_NOM_ELEVE = "Nom";
    private static final String COL_PRENOM_ELEVE = "Prenom";
    private static final String COL_CLASSE_ELEVE = "Classe";
    private static final String COL_ANNEE_ELEVE = "Annee";

    //Requête SQL création de eleve
    private static final String CREATE_TABLE_ELEVE = "CREATE TABLE " + TABLE_ELEVE + "("
            + COL_ID_ELEVE + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + COL_NOM_ELEVE + " TEXT NOT NULL, "
            + COL_PRENOM_ELEVE + " TEXT NOT NULL, "
            + COL_CLASSE_ELEVE + " TEXT NOT NULL, "
            + COL_ANNEE_ELEVE + " INTEGER NOT NULL);";


    //Création de la table professeur
    private static final String TABLE_PROFESSEUR = "table_Eleve";
    static final String COL_ID_PROFESSEUR = "Id_Professeur";
    private static final String COL_NOM_PROFESSEUR = "Nom";
    private static final String COL_PRENOM_PROFESSEUR = "Prenom";
    private static final String COL_EMAIL_PROFESSEUR = "Email";

    //Requête SQL création de professeur
    private static final String CREATE_TABLE_PROFESSEUR = "CREATE TABLE " + TABLE_PROFESSEUR + "("
            + COL_ID_PROFESSEUR + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + COL_NOM_PROFESSEUR + " TEXT NOT NULL, "
            + COL_PRENOM_PROFESSEUR + " TEXT NOT NULL, "
            + COL_EMAIL_PROFESSEUR + " TEXT NOT NULL);";


    //Création de la table entreprise
    private static final String TABLE_ENTREPRISE = "table_Entreprise";
    static final String COL_ID_ENTREPRISE = "Id_Entreprise";
    private static final String COL_NOM_ENTREPRISE = "Nom";
    private static final String COL_ADRESSE_ENTREPRISE = "Adresse";
    private static final String COL_TEL_ENTREPRISE = "Tel";
    private static final String COL_ID_TUTEURENTREPRISE_ENTREPRISE = "Id_Tuteur";

    //Requête SQL création de entreprise
    private static final String CREATE_TABLE_ENTREPRISE = "CREATE TABLE " + TABLE_ENTREPRISE + "("
            + COL_ID_ENTREPRISE + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + COL_NOM_ENTREPRISE + " TEXT NOT NULL, "
            + COL_ADRESSE_ENTREPRISE + " TEXT NOT NULL, "
            + COL_ID_TUTEURENTREPRISE_ENTREPRISE + " INTEGER NOT NULL, "
            + COL_TEL_ENTREPRISE + " INTEGER NOT NULL);";


    //Création de la table tuteur_entreprise
    private static final String TABLE_TUTEUR_ENTREPRISE = "table_Entreprise";
    static final String COL_ID_TUTEUR_ENTREPRISE = "Id_TuteurEntreprise";
    private static final String COL_NOM_TUTEUR_ENTREPRISE = "Nom";
    private static final String COL_PRENOM_TUTEUR_ENTREPRISE = "Prenom";
    private static final String COL_EMAIL_TUTEUR_ENTREPRISE = "Email";
    private static final String COL_TEL_TUTEUR_ENTREPRISE = "Tel";

    //Requête SQL création de tuteur_entreprise
    private static final String CREATE_TABLE_TUTEUR_ENTREPRISE = "CREATE TABLE " + TABLE_TUTEUR_ENTREPRISE + "("
            + COL_ID_TUTEUR_ENTREPRISE + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + COL_NOM_TUTEUR_ENTREPRISE + " TEXT NOT NULL, "
            + COL_PRENOM_TUTEUR_ENTREPRISE + " TEXT NOT NULL, "
            + COL_EMAIL_TUTEUR_ENTREPRISE + " TEXT NOT NULL, "
            + COL_TEL_TUTEUR_ENTREPRISE + " INTEGER NOT NULL);";


        //Constructeur paramétré
    public BddFicheStage(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }


    //méthode d'instance permettant la gestion de l'objet
    @Override
    public void onCreate(SQLiteDatabase db) {
        //appelée lorsqu’aucune base n’existe et que la classe utilitaire doit en créer une
        //on créé la table à partir de la requête écrite dans la variable
        db.execSQL(CREATE_TABLE_STAGE);
        db.execSQL(CREATE_TABLE_ELEVE);
        db.execSQL(CREATE_TABLE_PROFESSEUR);
        db.execSQL(CREATE_TABLE_ENTREPRISE);
        db.execSQL(CREATE_TABLE_TUTEUR_ENTREPRISE);
    }


    // appelée si la version de la base a changé
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //On peut supprimer la table et de la recréer
        db.execSQL("DROP TABLE " + TABLE_STAGE + ";");
        onCreate(db);

        db.execSQL("DROP TABLE " + TABLE_ELEVE + ";");
        onCreate(db);

        db.execSQL("DROP TABLE " + TABLE_PROFESSEUR + ";");
        onCreate(db);

        db.execSQL("DROP TABLE " + TABLE_ENTREPRISE + ";");
        onCreate(db);

        db.execSQL("DROP TABLE " + TABLE_TUTEUR_ENTREPRISE + ";");
        onCreate(db);
    }
}

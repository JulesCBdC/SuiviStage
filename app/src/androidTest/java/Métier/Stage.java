package Métier;

public class Stage {

    protected int Id_Stage;
    protected String Intitule;
    protected int Debut;
    protected int Fin;
    protected int Visite;
    protected String CompteRendue;
    protected String Conditions;
    protected String TravauxReal;
    protected String RessourcesOutils;
    protected String Commentaires;
    protected int ParticipationProfesseur;
    protected int Opportunite;
    protected int DateOpportunite;
    protected int Id_Eleve;
    protected int Id_Professeur;
    protected int Id_Entreprise;

    public Stage(int id_Stage, String intitule, int debut, int fin, int visite, String compteRendue, String conditions, String travauxReal, String ressourcesOutils, String commentaires, int participationProfesseur, int opportunite, int dateOpportunite, int id_Eleve, int id_Professeur, int id_Entreprise) {
        Id_Stage = id_Stage;
        Intitule = intitule;
        Debut = debut;
        Fin = fin;
        Visite = visite;
        CompteRendue = compteRendue;
        Conditions = conditions;
        TravauxReal = travauxReal;
        RessourcesOutils = ressourcesOutils;
        Commentaires = commentaires;
        ParticipationProfesseur = participationProfesseur;
        Opportunite = opportunite;
        DateOpportunite = dateOpportunite;
        Id_Eleve = id_Eleve;
        Id_Professeur = id_Professeur;
        Id_Entreprise = id_Entreprise;
    }

    public int getId_Stage() {
        return Id_Stage;
    }

    public void setId_Stage(int id_Stage) {
        Id_Stage = id_Stage;
    }

    public String getIntitule() {
        return Intitule;
    }

    public void setIntitule(String intitule) {
        Intitule = intitule;
    }

    public int getDebut() {
        return Debut;
    }

    public void setDebut(int debut) {
        Debut = debut;
    }

    public int getFin() {
        return Fin;
    }

    public void setFin(int fin) {
        Fin = fin;
    }

    public int getVisite() {
        return Visite;
    }

    public void setVisite(int visite) {
        Visite = visite;
    }

    public String getCompteRendue() {
        return CompteRendue;
    }

    public void setCompteRendue(String compteRendue) {
        CompteRendue = compteRendue;
    }

    public String getConditions() {
        return Conditions;
    }

    public void setConditions(String conditions) {
        Conditions = conditions;
    }

    public String getTravauxReal() {
        return TravauxReal;
    }

    public void setTravauxReal(String travauxReal) {
        TravauxReal = travauxReal;
    }

    public String getRessourcesOutils() {
        return RessourcesOutils;
    }

    public void setRessourcesOutils(String ressourcesOutils) {
        RessourcesOutils = ressourcesOutils;
    }

    public String getCommentaires() {
        return Commentaires;
    }

    public void setCommentaires(String commentaires) {
        Commentaires = commentaires;
    }

    public int getParticipationProfesseur() {
        return ParticipationProfesseur;
    }

    public void setParticipationProfesseur(int participationProfesseur) {
        ParticipationProfesseur = participationProfesseur;
    }

    public int getOpportunite() {
        return Opportunite;
    }

    public void setOpportunite(int opportunite) {
        Opportunite = opportunite;
    }

    public int getDateOpportunite() {
        return DateOpportunite;
    }

    public void setDateOpportunite(int dateOpportunite) {
        DateOpportunite = dateOpportunite;
    }

    public int getId_Eleve() {
        return Id_Eleve;
    }

    public void setId_Eleve(int id_Eleve) {
        Id_Eleve = id_Eleve;
    }

    public int getId_Professeur() {
        return Id_Professeur;
    }

    public void setId_Professeur(int id_Professeur) {
        Id_Professeur = id_Professeur;
    }

    public int getId_Entreprise() {
        return Id_Entreprise;
    }

    public void setId_Entreprise(int id_Entreprise) {
        Id_Entreprise = id_Entreprise;
    }
}

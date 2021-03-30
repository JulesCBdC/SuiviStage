package Métier;

public class Eleve {

    protected int Id_Eleve;
    protected String Nom;
    protected String Prenom;
    protected String Classe;
    protected int Annee;

    public Eleve(int id_Eleve, String nom, String prenom, String classe, int annee) {
        Id_Eleve = id_Eleve;
        Nom = nom;
        Prenom = prenom;
        Classe = classe;
        Annee = annee;
    }

    public int getId_Eleve() {
        return Id_Eleve;
    }

    public void setId_Eleve(int id_Eleve) {
        Id_Eleve = id_Eleve;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public void setPrenom(String prenom) {
        Prenom = prenom;
    }

    public String getClasse() {
        return Classe;
    }

    public void setClasse(String classe) {
        Classe = classe;
    }

    public int getAnnee() {
        return Annee;
    }

    public void setAnnee(int annee) {
        Annee = annee;
    }
}

package Métier;

public class Professeur {

    protected int Id_Professeur;
    protected String Nom;
    protected String Prenom;
    protected String Email;

    public Professeur(int id_Professeur, String nom, String prenom, String email) {
        Id_Professeur = id_Professeur;
        Nom = nom;
        Prenom = prenom;
        Email = email;
    }

    public int getId_Professeur() {
        return Id_Professeur;
    }

    public void setId_Professeur(int id_Professeur) {
        Id_Professeur = id_Professeur;
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

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}

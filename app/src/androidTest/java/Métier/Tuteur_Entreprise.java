package Métier;

public class Tuteur_Entreprise {

    protected int Id_TuteurEntreprise;
    protected String Nom;
    protected String Prenom;
    protected String Email;
    protected int Tel;

    public Tuteur_Entreprise(int id_TuteurEntreprise, String nom, String prenom, String email, int tel) {
        Id_TuteurEntreprise = id_TuteurEntreprise;
        Nom = nom;
        Prenom = prenom;
        Email = email;
        Tel = tel;
    }

    public int getId_TuteurEntreprise() {
        return Id_TuteurEntreprise;
    }

    public void setId_TuteurEntreprise(int id_TuteurEntreprise) {
        Id_TuteurEntreprise = id_TuteurEntreprise;
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

    public int getTel() {
        return Tel;
    }

    public void setTel(int tel) {
        Tel = tel;
    }
}

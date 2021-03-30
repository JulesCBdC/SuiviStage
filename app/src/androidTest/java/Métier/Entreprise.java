package Métier;

public class Entreprise {

    protected int Id_Entreprise;
    protected String Adresse;
    protected String Nom;
    protected int Tel;
    protected int Id_Tuteur;

    public Entreprise(int id_Entreprise, String adresse, String nom, int tel, int id_Tuteur) {
        Id_Entreprise = id_Entreprise;
        Adresse = adresse;
        Nom = nom;
        Tel = tel;
        Id_Tuteur = id_Tuteur;
    }

    public int getId_Entreprise() {
        return Id_Entreprise;
    }

    public void setId_Entreprise(int id_Entreprise) {
        Id_Entreprise = id_Entreprise;
    }

    public String getAdresse() {
        return Adresse;
    }

    public void setAdresse(String adresse) {
        Adresse = adresse;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public int getTel() {
        return Tel;
    }

    public void setTel(int tel) {
        Tel = tel;
    }

    public int getId_Tuteur() {
        return Id_Tuteur;
    }

    public void setId_Tuteur(int id_Tuteur) {
        Id_Tuteur = id_Tuteur;
    }
}

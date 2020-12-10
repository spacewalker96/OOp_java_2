package pers;
public class Etudiant extends Personne{
    private String diplome;
    public void ecrirePersonne(){

    }

    public Etudiant(String nom, String prenom, int dateNaissance, String adresse, String ville, String diplome) {
        super(nom, prenom, dateNaissance, adresse, ville);
        this.diplome = diplome;
    }
}

public class Enseignant extends Personne{
    private String specialite;
    public void ecrirePersonne(){

    }

    public Enseignant(String nom, String prenom, int dateNaissance, String adresse, String ville, String specialite) {
        super(nom, prenom, dateNaissance, adresse, ville);
        this.specialite = specialite;
    }
}

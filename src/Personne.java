public abstract class Personne {
    private String nom;
    private String prenom;
    private int dateNaissance;
    private String adresse;
    private String ville;
    public abstract void ecrirePersonne();

    public Personne(String nom, String prenom, int dateNaissance, String adresse, String ville) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.adresse = adresse;
        this.ville = ville;
    }

    @Override
    public String toString() {
        return "Personne{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", dateNaissance=" + dateNaissance +
                ", adresse='" + adresse + '\'' +
                ", ville='" + ville + '\'' +
                '}';
    }
    void modifiePersonne (String adresse, String ville){
        this.adresse = adresse;
        this.ville = ville;
    }
}

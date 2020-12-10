public class Personne2 {
    private String nom;
    private String prenom;
    private String ville;
    private int date;

    public Personne2(String nom, String prenom, String ville, int date) {
        this.nom = nom;
        this.prenom = prenom;
        this.ville = ville;
        this.date = date;
    }

    public void Afficher(){
        System.out.println("Nom est : "+nom+"\n"+"Prenom est : "+prenom+"\n"+"Ville est : "+ville+"\n"+"Date de naissance est : "+date);
    }

}

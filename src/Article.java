public class Article {
    private String nom;
    private  double prix;
    public void afficer(){
        System.out.println("Le Nom est : "+nom+"\n"+"Le Prix est : "+prix+" DH");
    }

    public String getNom() {
        return nom;
    }

    public double getPrix() {
        return prix;
    }

    public Article setNom(String nom) {
        this.nom = nom;
        return this;
    }

    public Article setPrix(double prix) {
        this.prix = prix;
        return this;
    }
}


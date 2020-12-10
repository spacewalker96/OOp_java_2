public class Employe2 extends Personne2{
    private double salair;

    public Employe2(String nom, String prenom, String ville, int date, double salair) {
        super(nom, prenom, ville, date);
        this.salair = salair;
    }
    public void afficher(){
        super.Afficher();
        System.out.println("Salaire est : "+salair);
    }
}

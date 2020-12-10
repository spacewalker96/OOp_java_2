public class Directeur extends Chef{
    private String societe;

    public Directeur(String nom, String prenom, String ville, int date, double salair, String service, String societe) {
        super(nom, prenom, ville, date, salair, service);
        this.societe = societe;
    }
    public void afficher(){
        super.afficher();
        System.out.println("Societe est : "+societe);
    }


}

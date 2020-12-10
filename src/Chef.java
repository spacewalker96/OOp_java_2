public class Chef extends Employe2{
    private String service;

    public Chef(String nom, String prenom, String ville, int date, double salair, String service) {
        super(nom, prenom, ville, date, salair);
        this.service = service;
    }
    public void afficher(){
        super.afficher();
        System.out.println("Service de chef est : "+service);
    }
}

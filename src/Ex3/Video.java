package Ex3;

public class Video extends Ouvrage{
    private String editeur;
    private int durée;
    public void afficher(){
        super.afficher();
        System.out.println("Editeur : "+editeur+"\n"+"Durée : "+durée);
    }
}

package Ex3;

public class Livre extends Ouvrage{
    private String auteur;

    public void afficher(){
        super.afficher();
        System.out.println("L'auteur' : "+auteur);
    }

}

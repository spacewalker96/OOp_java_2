package Ex3;

public class Ouvrage {
    private String titre;
    private int date;
    private boolean indic;
    public void afficher(){
        System.out.println("Le titre d'ouvrage : "+titre+"\n"+"La date : "+date+"\n"+"Existe : "+indic);
    }
}

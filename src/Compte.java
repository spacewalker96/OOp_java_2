public class Compte {
    private long nmCmt;
    private double sold;
    public double ajouter(double aj){
        return sold+aj;
    }
    public double retirer(double rt){
        return sold-rt;
    }
    public void afficher(){
        System.out.println("Persone a num de compte : "+nmCmt+"\n");
    }
}

public class ArticleEnSolde extends Article{
    private double reduc;
    double calculeReduc(){
        return getPrix()-(getPrix()*reduc/100);
    }

    public ArticleEnSolde setReduc(double reduc) {
        this.reduc = reduc;
        return this;
    }

    public double getReduc() {
        return reduc;
    }

    public void afficer(){
        super.afficer();
        System.out.println("Le prix avec reduction est : "+calculeReduc()+" DH");
    }

    public static void main(String[] args) {
        ArticleEnSolde ar = new ArticleEnSolde();
        ar.setNom("Hmiyed Hassan");
        ar.setPrix(400);
        ar.setReduc(30);
        ar.afficer();
    }
}


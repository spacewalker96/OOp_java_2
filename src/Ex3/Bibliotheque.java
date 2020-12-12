package Ex3;

public class Bibliotheque {
    Abonne ab;
    Ouvrage ouvrage;



   void ajoutOuvrage(Ouvrage ouvrage){
       if (ouvrage.isIndic() == false){
       this.ouvrage = ouvrage;}
   }

    public Ouvrage getOuvrage(String tit) {
       if (tit == ouvrage.getTitre()){
        return ouvrage;}
       else return null;
    }
    void ajoutAbonne(String titAb){
       if (titAb != ab.getNomAbonne()){
        this.ab = ab;}
    }

    public String getAb(int id) {
        if (id == ab.getNumId()){
        return ab.getNomAbonne();}
        else return "Dont found";
    }
}

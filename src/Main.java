public class Main {
    public static void main(String[] args) {

        Employe2 em1 = new Employe2("eqrg","zef","sefsf",234,23432);
        Employe2 em2 = new Employe2("hz ef","erg","erg",195436,3453);
        Employe2 em3 = new Employe2("fa f","haergssan","regaerg",3333,5453);
        Employe2 em4 = new Employe2("faa","aergr","ergrgb",3434,34534);
        Employe2 em5 = new Employe2("grgztg","erge","zrgeger",5453,34534);
        Chef ch1 = new Chef("rgqrgq","ergqerg","regrg",3243,465,"kfff");
        Chef ch2 = new Chef("EFZEEF","gergerqg","hyjr",3232,3553,"fhswdh");
        Directeur dr = new Directeur("hmiyed ","hassan ","youssoufia ",1996,50000,"Directeur ","Google ");
        dr.afficher();


        Employe em = new Employe("Hassan","Hmiyed","fzlefzef effz efz theth ",1996,2020);
        int cpt = 0;
        if (em instanceof Employe) {
            cpt = cpt+1;
        }
        System.out.println(cpt);
            }
}

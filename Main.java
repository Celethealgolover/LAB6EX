import calcul.CalculChirie;
import calcul.CalculChirieAlimentar;
import calcul.CalculChirieHaine;
import calcul.CalculChirieChimicale;
import model.*;
import java.util.Collections;
import java.util.Comparator;
public class Main {
    public static void main(String[] args) {
     ShoppingMall mall=new ShoppingMall();
     Proprietar p1=new Proprietar("Negraru","Celestin",21);
     Proprietar p2=new Proprietar("Iacob","Victor",20);
     Proprietar p3=new Proprietar("Protopopescu","Emanoil",19);
     CalculChirie alimentar=new CalculChirieAlimentar();
     Magazin profi=new Magazin(1,"Profi",p1,150,12500);
     profi.setChirie(alimentar);
     Magazin carrefour=new Magazin(2,"Carrefour",p2,800,65000);
     carrefour.setChirie(alimentar);
     CalculChirie haine=new CalculChirieHaine();
     Magazin nike=new Magazin(3,"Nike",p1,300,42000);
     nike.setChirie(haine);
     Magazin hm=new Magazin(4,"H&M",p3,200,5000);
     hm.setChirie(haine);
     Magazin buzz=new Magazin(5,"Buzz",p2,150,14000);
     buzz.setChirie(haine);
     CalculChirie chimicale=new CalculChirieChimicale();
     Magazin dm=new Magazin(6,"DM",p1,50,4000);
     dm.setChirie(chimicale);
     mall.addMagazin(profi);
     mall.addMagazin(carrefour);
     mall.addMagazin(nike);
     mall.addMagazin(hm);
     mall.addMagazin(buzz);
     mall.addMagazin(dm);
     Collections.sort(mall.getListaMagazine(),Comparator.comparing(Magazin::getNumeProprietar).thenComparing(Magazin::getPrenumeProprietar).thenComparing(Magazin::getChirie));
     mall.showMagazine();
     Collections.sort(mall.getListaMagazine(),Comparator.comparing(Magazin::getNumeMagazin).thenComparing(Magazin::getVenit).thenComparing(Magazin::getChirie).thenComparing(Magazin::getSuprafata));
     mall.showMagazineProprietar(p1);
     System.out.println(mall.venitTotal(p2));
     System.out.println(mall.venitTotal(p3));
    }
}

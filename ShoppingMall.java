package model;
import java.util.*;
public class ShoppingMall {
    private List<Magazin> listaMagazine= new ArrayList<>();
    public ShoppingMall(){}
    public void addMagazin(Magazin m)
    {
        listaMagazine.add(m);
    }
    public void showMagazine()
    {
        for(int i=0;i<listaMagazine.size();i++)
        {
            System.out.println(listaMagazine.get(i).getNumeMagazin()+" "+listaMagazine.get(i).getNumeProprietar()+" "+listaMagazine.get(i).getChirie());
        }
    }
    public void showMagazineProprietar(Proprietar p)
    {
        for(int i=0;i<listaMagazine.size();i++)
        {
            if(listaMagazine.get(i).getNumeProprietar().equals(p.getNume()))
              System.out.println(listaMagazine.get(i).getNumeMagazin()+" "+listaMagazine.get(i).getNumeProprietar()+" "+listaMagazine.get(i).getChirie());
        }
    }
    public int venitTotal(Proprietar p)
    {
        int total=0;
        for(int i=0;i<listaMagazine.size();i++)
        {
            if(listaMagazine.get(i).getNumeProprietar().equals(p.getNume()))
                total+=listaMagazine.get(i).getVenit();
        }
        return total;
    }
    public int chirieTotal(Proprietar p)
    {
        int total=0;
        for(int i=0;i<listaMagazine.size();i++)
        {
            if(listaMagazine.get(i).getNumeProprietar().equals(p.getNume()))
                total+=listaMagazine.get(i).getChirie();
        }
        return total;
    }
    public List<Magazin> getListaMagazine()
    {
        return this.listaMagazine;
    }
}

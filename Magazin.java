package model;
import calcul.CalculChirie;

public class Magazin {
    private int id;
    private String numeMagazin;
    private Proprietar proprietar;
    private int suprafata;
    private int venit;
    private int chirie;
    public Magazin(int id, String numeMagazin, Proprietar proprietar, int suprafata,int venit) {
        this.id = id;
        this.numeMagazin = numeMagazin;
        this.proprietar = proprietar;
        this.suprafata = suprafata;
        this.venit=venit;
    }
    public void setChirie(CalculChirie c)
    {
        this.chirie=c.setChirie(this.suprafata);
    }

    public int getId() {
        return id;
    }

    public String getNumeMagazin() {
        return numeMagazin;
    }

    public Proprietar getProprietar() {
        return proprietar;
    }
    public String getNumeProprietar()
    {
        return proprietar.getNume();
    }
    public String getPrenumeProprietar()
    {
        return proprietar.getPrenume();
    }

    public int getSuprafata() {
        return suprafata;
    }

    public int getVenit() {
        return venit;
    }

    public int getChirie() {
        return chirie;
    }
}

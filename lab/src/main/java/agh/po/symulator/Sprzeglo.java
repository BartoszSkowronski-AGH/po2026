package agh.po.symulator;

public class Sprzeglo extends Komponent{

    boolean stanSprzegla;

    public Sprzeglo(){
        stanSprzegla = false;
    }

    void wcisnij(){
        this.stanSprzegla = true;
    }

    void zwolnij(){
        this.stanSprzegla = false;
    }


}

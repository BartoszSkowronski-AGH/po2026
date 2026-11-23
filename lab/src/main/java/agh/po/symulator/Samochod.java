package agh.po.symulator;

public class Samochod {

    Silnik silnik;
    SkrzyniaBiegow skrzynia;

    void uruchom(){
        this.silnik.uruchom();
    }

    void zatrzymaj(){
        this.silnik.zatrzymaj();
        this.skrzynia.aktualnePrzelozenie = 0;
    }
}

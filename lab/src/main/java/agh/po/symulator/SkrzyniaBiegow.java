package agh.po.symulator;

public class SkrzyniaBiegow extends Komponent {

    int iloscBiegow;
    int aktualnePrzelozenie;

    public SkrzyniaBiegow(int ileB){
        this.iloscBiegow = ileB;
        this.aktualnePrzelozenie = 0;
    }

    void zwiekszBieg(){
        if(this.aktualnePrzelozenie < this.iloscBiegow){
            this.aktualnePrzelozenie += 1;
        } else{
            System.out.print("Maksymalny bieg!");
        }
    }

    void zmniejszBieg(){
        if(this.aktualnePrzelozenie > -1){
            this.aktualnePrzelozenie -= 1;
        } else{
            System.out.print("Nie mozna zmniejszyc!");
        }
    }

    int getAktualnePrzelozenie(){
        return this.aktualnePrzelozenie;
    }

}

package agh.po.symulator;

public class Silnik extends Komponent{

    private int maxObroty;
    private int obroty;

    public Silnik(int max){
        this.maxObroty = max;
    }

    void zatrzymaj(){
        this.obroty = 0;
    }

    void uruchom(){
        this.obroty = 1000;
    }

    void zwiekszObroty(){
        if(this.obroty + 500 < this.maxObroty){
            this.obroty+=500;
        } else if (this.obroty < this.maxObroty) {
            this.obroty = this.maxObroty;
        } else{
            System.out.println("Maksymalne obroty!");
        }
    }

    void zmniejszObroty(){
        if(this.obroty - 500 > 0){
            this.obroty -= 500;
        } else if(this.obroty <= 500){
            this.obroty = 0;
            System.out.println("Silnik zgasł!");
        } else{
            System.out.println("Silnik jest zgaszony!");
        }
    }

}

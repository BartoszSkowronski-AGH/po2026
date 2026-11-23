package agh.po.symulator;

public class Pozycja {
    private double x;
    private double y;

    public Pozycja(double X, double Y){
        this.x = 0;
        this.y = 0;
        this.x = X;
        this.y = Y;
    }

    void aktualizujPozycje(double deltaX, double deltaY){
        this.x += deltaX;
        this.y += deltaY;
    }

    public double getX(){
        return this.x;
    }

    public double getY(){
        return this.y;
    }

    String getPozycja(){
        return "Obecna pozycja x: " + String.valueOf(this.getX()) + ", y: " + String.valueOf(this.getY());
    }
}

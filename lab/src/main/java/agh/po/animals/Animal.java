package agh.po.animals;

public abstract class Animal {
    private String name;
    private int legs;

    public abstract String getDescription();

    public void setLegs(int l){
        this.legs = l;
    }

    public int getLegs() {
        return legs;
    }

    public void setName(String l){
        this.name = l;
    }

    public abstract void makeSound();
}

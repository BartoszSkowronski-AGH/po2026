package agh.po.animals;

public class Parrot extends Animal{
    public Parrot() {
        setLegs(2);
        setName("Parrot");
    }
    public String getDescription(){
        return "papuga";
    }
    public void makeSound(){
        System.out.println("parrot's noises");
    }
}

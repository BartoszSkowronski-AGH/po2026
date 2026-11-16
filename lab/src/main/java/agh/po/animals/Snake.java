package agh.po.animals;

public class Snake extends Animal{
    public Snake(){
        setLegs(0);
        setName("Snake");
    }
    public String getDescription(){
        return "waz";
    }
    public void makeSound(){
        System.out.println("snake's noises");
    }
}

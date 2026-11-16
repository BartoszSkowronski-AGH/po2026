package agh.po.animals;

public class Dog extends Animal{
    public Dog(){
        setLegs(4);
        setName("Dog");
    }
    public String getDescription(){
        return "pies";
    }
    public void makeSound(){
        System.out.println("dog's noises");
    }
}

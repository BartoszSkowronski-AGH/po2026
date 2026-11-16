package agh.po.zadania;

import agh.po.animals.Animal;
import agh.po.animals.Dog;
import agh.po.animals.Parrot;
import agh.po.animals.Snake;
import java.util.Random;

public class Zoo {
    Animal[] animals = new Animal[100];

    public static void main(String[] args){
        Zoo z1 = new Zoo();
        z1.animals[2].getDescription();
        int legs = z1.legsSum();
        z1.animals[5].makeSound();
    }


    public Zoo(){
        Random randomInt = new Random();
        for(int i= 0; i<100; i++){
            int l = randomInt.nextInt(3);
            if(l == 0){
                animals[i] = new Parrot();
            }
            if(l == 1){
                animals[i] = new Dog();
            }
            if(l == 2){
                animals[i] = new Snake();
            }
        }
    }

    public int legsSum(){
        int sum = 0;
        for(int i=0; i<100; i++){
            sum += animals[i].getLegs();
        }
        return sum;
    }
}

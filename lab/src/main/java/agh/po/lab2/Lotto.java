package agh.po.lab2;

import java.util.ArrayList;
import java.util.Random;

public class Lotto {
    public static void main(String[] args){
        ArrayList<Integer> lista = new ArrayList<>();
        /*
        Random randomNumbers = new Random();
        int liczba;
        for(int i= 0; i<6; i++){
            do{
                liczba = randomNumbers.nextInt(49) + 1;
            }
            while(lista.contains(liczba));
            lista.add(liczba);
        }
         */
        if(args.length == 6){
            for(int i = 0; i<6; i++){
                do{
                    lista.add(Integer.parseInt(args[i]));
                }
                while((lista.contains(Integer.parseInt(args[i]))));
                lista.add(Integer.parseInt(args[i]));
            }
            lista.forEach(System.out::println);
        }
        else{
            System.out.println("Tablica nie zawiera 6 liczb!");
        }
        }

    }
package agh.po.lab2;

import java.util.ArrayList;
import java.util.Random;

public class Lotto {
    public static void main(String[] args){
        long suma=0;
        for(int j = 0; j<1; j++){
            boolean hura=false;
            long start = System.currentTimeMillis();
            long ilosc_powtorzen=1;
            while(hura == false){
                ArrayList<Integer> lista_losowa = new ArrayList<>();
                Random randomNumbers = new Random();
                int liczba;
                for(int i= 0; i<6; i++) {
                    do {
                        liczba = randomNumbers.nextInt(49) + 1;
                    }
                    while (lista_losowa.contains(liczba));
                    lista_losowa.add(liczba);
                }
                ArrayList<Integer> lista_uzytkownika = new ArrayList<>();
                if(args.length == 6){
                    for(int i = 0; i<6; i++){
                        lista_uzytkownika.add(Integer.parseInt(args[i]));
                    }
                    int trafienia = 0;
                    for (int l : lista_uzytkownika) {
                        if (lista_losowa.contains(l)) {
                            trafienia++;
                        }
                    }
                    if(trafienia == 6){
                        hura = true;
                        long end = System.currentTimeMillis();
                        long time = end - start;
                        suma += ilosc_powtorzen/time;
                        System.out.println("Liczby uzytkownika: " + lista_uzytkownika);
                        System.out.println("Wylosowane liczby: " + lista_losowa);
                        System.out.println("Liczba trafień: " + trafienia);
                        System.out.println("Czas wykonania: " + time + " ms. Wygrana za " + ilosc_powtorzen + " proba!");

                    }
                }
                else{
                    System.out.println("Tablica nie zawiera 6 liczb!");
                    break;
                }
                ilosc_powtorzen++;
            }
        }
        long srednia = suma/100;
        System.out.println("Sredni czas zgadniecia przy 100 probach: "+srednia+"ms");
        }
    }
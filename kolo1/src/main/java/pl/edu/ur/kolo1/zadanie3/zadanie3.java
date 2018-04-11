/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.kolo1.zadanie3;

import java.util.Scanner;

/**
 *
 * @author student
 */
public class zadanie3 {

    public static void zad3() {

        Scanner skaner = new Scanner(System.in);

        int[] liczby = new int[10];
        int x=1;
        
        while(x!=0){
        System.out.println("Wybierz numer:\n1.Wyswietl tablice\n2.Wpisz dane\n3.Srednia");
        x = skaner.nextInt();

        switch (x) {
            case 1:
                zadanie3.wyswietl(liczby);
                break;
            case 2:
                zadanie3.dane(liczby);
                break;
            case 3:
                zadanie3.srednia(liczby);
                break;
        }
        }
    }

    public static void dane(int[] liczby) {
        Scanner skaner = new Scanner(System.in);
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Podaj " + (i + 1) + " liczbe");
            String liczba = skaner.nextLine();
            liczby[i] = Integer.parseInt(liczba);
        }
    }
        
     
    public static void srednia(int[] liczby) {
        int suma = 0;
        for (int i = 0; i < 10; i++) {
            suma += liczby[i];
        }
        System.out.println("Wartość średnia elementów tablicy wynosi: " + suma / 4);
    }

    public static void wyswietl(int[] liczby) {
        for (int i = 0; i < 10; i++) {
            System.out.println(liczby[i]);
        }
    }

}

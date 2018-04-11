package pl.edu.ur.kolo1;

import java.util.Scanner;
import pl.edu.ur.kolo1.zadanie1.zadanie1;
import pl.edu.ur.kolo1.zadanie2.zadanie2;
import pl.edu.ur.kolo1.zadanie3.zadanie3;
import pl.edu.ur.kolo1.zadanie4.Osoba;

/**
 *
 * @author mchyla
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int x = 1;

        while (x != 0) {
            System.out.println("Podaj numwer zadanie 1-4, 0 konczy dzialanie programu:");

            Scanner odczyt = new Scanner(System.in);
            x = odczyt.nextInt();

            switch (x) {
                case 1:
                    zadanie1.zad1();
                    break;
                case 2:
                    zadanie2.zad2();
                    break;
                case 3:
                    zadanie3.zad3();
                    break;
                case 4:
                    Osoba.zad4();
                    break;

            }
        }
    }

}

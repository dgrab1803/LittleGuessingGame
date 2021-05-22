package academy.learnprogramming;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int i = 0;
        int los;
        int odp;

        Random rnd = new Random();
        los = rnd.nextInt(10) +1;

        Scanner scanner = new Scanner (System.in);

        System.out.println("Zgadnij liczbe od 1 do 10 ");
        do{
            i++;
            System.out.print("Podaj liczbe : ");
            odp = scanner.nextInt();
            if(odp > los){
                System.out.println("Niestety nie odgadles ! Moja liczba jest mniejsza.");
            }
            else if(odp < los ) {
                System.out.println("Niestety nie  odgadles ! Moja liczba jest wieksza ");
            }

        }while(odp != los);
        System.out.println("Brawo odgadles za  " + i + " razem!");
    }
}

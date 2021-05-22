package academy.learnprogramming;

import java.util.Random;
import java.util.Scanner;

public class Gierka {
    public static void main(String[] args) {
        int i = 0 ;
        int los;
        int odp;

        Random rnd = new Random();
        los = rnd.nextInt(10) +1 ;
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Zgadnij liczbe od 1 do 10 ");

        do{
            i++;
            System.out.println("Podaj liczbe ");
            odp = scanner.nextInt();
            if(odp < los){
                System.out.println("Liczba jest wieksza ");
            }else
            {
                System.out.println(" liczba jest mniejsza ");
            }

        }while(odp != los);
        System.out.println("Brawo odgladles za " + i + " razem ");
    }
}

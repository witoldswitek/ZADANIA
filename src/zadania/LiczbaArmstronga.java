package zadania;
import java.util.Scanner;
import java.math.*;
public class LiczbaArmstronga {


    public void wyswietlWiadomosc(){
        System.out.print("Ten program liczy liczby Armstronga.\nPodaj przedzial od zera do:");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        System.out.print("Podales przedzial:\n[ 0 - "+a+" ]\n");
        this.wyliczLiczby(a);

    }

    private void wyliczLiczby(int a){

        System.out.println("Liczby Armstronga to:");

        for (int i=0; i<=a; i++){

            int iSize;
            iSize = String.valueOf(i).length(); // z klasy String uzywamy metode valueOf na int i. nastepnie na jej wymniku (stringu) uzywamy metody lenght ktora zwraca inta.

            double c =0;

            for (int j=0;j<iSize;j++ )
            {
                String iString = String.valueOf(i);
                char iChar = iString.charAt(j);  // dla j =0 ichar =1,     dla j = 1 ichar = 5,      dla j = 2 ichar = 3
                int iCharInt = Integer.parseInt(String.valueOf(iChar));
                double iCharExponentiation = Math.pow(iCharInt,iSize);

                c = c + iCharExponentiation;
            }

            if (c == i){
                System.out.print(c+"; ");
            }

        }

    }

}

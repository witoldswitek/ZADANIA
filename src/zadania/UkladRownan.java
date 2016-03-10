package zadania;

import java.util.Scanner;


public class UkladRownan {

    private float liczWyznacznik(int w1,int w2, int w3, int w4){

        return ((w1 * w2) - (w3 * w4));
    }


    public void rozwiazRownanie(){

        int a,b,c,d,e,f;

        Scanner sc = new Scanner(System.in);

        System.out.print("Ten program rozwiazuje uklad rownan: \nAx + By = C\nDx + Ey = F\n\n");


        System.out.println("Podaj A");
        a = sc.nextInt();
        System.out.println("Podaj B");
        b = sc.nextInt();
        System.out.println("Podaj C");
        c = sc.nextInt();
        System.out.println("Podaj D");
        d = sc.nextInt();
        System.out.println("Podaj E");
        e = sc.nextInt();
        System.out.println("Podaj F");
        f = sc.nextInt();

        System.out.println("Podales uklad rownan: \n"+a+"x+"+b+"y="+c+"\n"+d+"x+"+e+"y="+f);

        float wyznacznik = liczWyznacznik(a,e,b,d);
        System.out.println("Wyznacznik wynosi: "+wyznacznik);

        float wx = liczWyznacznik(c,e,b,f);
        System.out.println("Wyznacznik X wynosi: "+wx);

        float wy = liczWyznacznik(a,f,c,d);
        System.out.println("Wyznacznik Y wynosi: "+wy);

        if (wyznacznik!=0){
            System.out.println("Uklad jest oznaczony");
            float x = wx/wyznacznik;
            float y = wy/wyznacznik;
            System.out.println("Rozwiazanie: x ="+x+", y="+y+".");
        }
        else if (wx!=0 || wy!=0){
            System.out.println("Uklad jest sprzeczny!");
        }
        else{
            System.out.println("Uklad jest nieoznaczony!");
        }

    }

}

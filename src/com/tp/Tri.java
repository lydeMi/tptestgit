package com.tp;
import java.util.Scanner;

public class Tri {

    public static void main(String[] args) {
	// write your code here
        int n=0;
        int [] tab = new int[50];
        Scanner clavier = new Scanner(System.in);
        while (n<1 || n>50){
            System.out.println("Saisissez un entier entre 1 et 50");
            n = clavier.nextInt();
        }

        for (int i=0; i<n; ++i){
            System.out.println("Saisissez les" +n+ " entier du tableau");
            tab[i] = clavier.nextInt();
        }

        for(int i = 0 ; i <= n-2 ; i++)
        {
            int rangmin = i;
            for (int j=i+1 ; j <= n-1 ; ++j)
            {
                if(tab[j] < tab[rangmin]) { rangmin = j; }
            }
            int aux = tab[i];
            tab[i] = tab[rangmin];
            tab[rangmin] = aux ;
        }

        System.out.println("quelle valeur chercher?");
        int a = clavier.nextInt();

        int deb = 0, fin = n-1, milieu = (deb + fin)/2;
        while(deb <= fin && a != tab[milieu])
        {
            if(a < tab[ milieu ]) { fin = milieu-1; }
            if(a > tab[ milieu ]) { deb = milieu+1; }
            milieu = (deb+fin)/2;
        }




    }
}

/*
        1. Výpis všetkých štvorciferných čísel deliteľných číslom 615

        2. Výpis pekných trojciferných čísel. Číslo je pekné ak cifry klesajú, napr: 543, 951, 421, 862, 943, ... atd

        3. Scitat vsetky dvojciferné čísla deliteľné číslom 3, teda vypísať ich súčet

        4. Zistiť a vypísať počet deliteľov čísla 1000000 (milion)

        5. Vypocitat povrch a objem kvadra. Strany su 45, 87, 37

        6. Vypísat cisla od 10 do 2 s krokom 0,5 , teda: 10 9.5 9 8.5 8  .......3 2.5 2

        7. Vypocitat faktorial cisla 7!, teda 7*6*5*4*3*2*1  cez cyklus for

        8. vypisat vsetky trojciferne neparne cisla, ktore su delitelne cislom 27 a nie su delitelne cislom 13.

        9. vypisat vsetky nasobky cisla 91 az do 10000, teda: 91,  182,, 273, .............

        10. vypisat vsetky 5 ciferne cisla, ktore su palindromy, cize odpredu aj odzadu rovnako citatelne, napr:  45854, 30903, 11111, 22722, ......
*/



package sk.itsovy.matysko.orter;

public class Homework1 {

    public void first() {
        System.out.print("1. ");
        for (int i = 1000; i < 10000; i++) {
            if (i % 615 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public void second() {
        System.out.print("2. ");
        for (int i = 100; i < 1000; i++) {
            int a = i % 10;
            int b = (i / 10) % 10;
            int c = (i / 100) % 10;
            if (c > b && b > a) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public void third() {
        int p = 0;
        System.out.print("3. ");
        for (int i = 10; i < 100; i++) {
            if (i % 3 == 0) {
                p = p + i;
            }
        }
        System.out.print(p);
        System.out.println();
    }

    public void fourth() {
        int p = 0;
        System.out.print("4. ");
        for (int i = 1; i <= 1000000; i++) {
            if (1000000 % i == 0) {
                p = p + 1;
            }
        }
        System.out.print(p);
        System.out.println();
    }

    public void fiveth() {
        System.out.print("5. ");
        int a = 45;
        int b = 87;
        int c = 37;
        System.out.print("V=" + a * b * c + " S=" + 2 * (a * b + a * c + b * c));
        System.out.println();
    }

    public void sixth() {
        System.out.print("6. ");
        for (double i = 10; i >= 2; i=i-0.5) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public void seventh() {
        double p=7;
        System.out.print("7. ");
        for (double i = 6; i >= 1; i=i-1) {
            p=p*i;
        }
        System.out.print(p);
        System.out.println();
    }

    public void eightth() {
        System.out.print("8. ");
        for (int i = 101; i < 1000; i=i+2) {
            if (i%27==0){
                if (i%13!=0){
                    System.out.print(i+"" +" ");
                }
            }
        }
        System.out.println();
    }

    public void nineth() {
        System.out.print("9. ");
        for (int i = 91; i <= 1000; i=i*2) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public void tenth() {
        System.out.print("10. ");
        for (int i = 10000; i < 100000 ; i++) {
            int a = i % 10;
            int b = (i / 10) % 10;
            int c = (i / 100) % 10;
            int d = (i / 1000) % 10;
            int e = (i / 10000) % 10;
            if (a==e&&b==d){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        System.out.println();
    }




}
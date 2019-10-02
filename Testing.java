package sk.itsovy.matysko.orter;

import org.w3c.dom.ls.LSOutput;

public class Testing {

    public void test() {
        for (int i = 10; i < 100; i++) {
            System.out.print(i + " ");
        }
    }

    public void neparne() {
        for (int i = 99; i > 10; i--) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }
    }

    public void delitelne11() {
        for (int i = 100; i <= 999; i++) {
            if (i % 11 == 0 && i % 3 > 0) {
                System.out.print(i + " ");
            }
        }
    }

    public void delitelne2alebo3() {
        for (int i = 10; i < 100; i++) {
            if (i % 2 == 0 || i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public void pekne3cifcisla() {
        for (int i = 100; i <= 999; i++) {
            int a = i % 10;
            int b = (i / 10) % 10;
            int c = (i / 100) % 10;
            if (a == b || b == c || c == a) {
                System.out.print(i + " ");
            }
        }
    }

    public void prave2pekne3cifcisla() {
        for (int i = 100; i <= 999; i++) {
            int a = i % 10;
            int b = (i / 10) % 10;
            int c = (i / 100) % 10;
            if ((a == b && a != c) || (b == c && b != a) || (c == a && c != b)) {
                System.out.print(i + " ");
            }
        }
    }

    //vypisat kolko je peknych cisel, neparne, ciferny sucet je menej ako 6
    public void kolkojepeknychcisel() {
        int p = 0;
        for (int i = 1; i <= 500; i++) {
            int a = i % 10;
            int b = (i / 10) % 10;
            int c = (i / 100) % 10;

            if (i % 2 == 1) {
                if ((a + b + c) < 6) {
                    p++;
                }
            }
        }
        System.out.print(p);
    }

    public void daco() {
        int count = 0;
        int j = 870;
        for (int i = 1; i < 870; i++) {
            if (j % i == 0) {
                count++;
            }
        }
        System.out.println(count);

    }

    //vypisat mocniny cisla 2 do 100 000
    public void mocniny2do100000() {
        for (int i = 2; i < 100000; i *= 2) {
            System.out.print(i + " ");
        }
    }

    public void pinkod() {
        for (int i = 1000; i < 10000; i++) {
            int a = i / 1000;
            int b = (i / 100) % 10;
            //int c = i % 10;
            int d = i % 10;
            if (i % 12 == 0 && a > d && b % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public void cas() {
        int time = 514623;
        int day = time / 86400;
        time = time % 86400;
        int hour = time / 3600;
        time = time % 3600;
        int minute = time / 60;
        time = time % 60;

        System.out.println(day);
        System.out.println(hour);
        System.out.println(minute);


    }

    public void scitaniecisel() {
        int p = 0;
        for (int i = 1; i <= 158; i++) {
            p = p + i;
        }
        System.out.println(p);
    }

    public void centy() {
        int p = 1;
        for (int i = 1; i <= 30; i++) {
            p = p * 2;
        }
        System.out.println(p);
    }

    public void spocitaniezlomkov() {
        double p = 0;
        for (int i = 1; i <= 100; i++) {
            p = p + ((double) 1 / i);//why
        }
        System.out.println(p);
    }

    public void prvocislo() {
        int c = 1881;
        int p = 0;
        for (int i = 1; i <= c; i++) {
            if (c % i == 0) {
                p++;
            }
        }
        if (p == 2) {
            System.out.println("Je prvocislo, pocet delitelov:" + p);
        } else {
            System.out.println("Nie je prvocislo, pocet delitelov:" + p);
        }
    }

    public void sucet43() {
        int i = 10000;
        while (i <= 99999) {
            int a = i % 10;
            int b = (i / 10) % 10;
            int c = (i / 100) % 10;
            int d = (i / 1000) % 10;
            int e = (i / 10000) % 10;
            if (a + b + c + d + e == 43) {
                System.out.print(i + " ");
            }
            i++;
        }
    }

    public void delitelne613() {
        int i = 99999;
        while (i % 613 != 0) {
            i--;
        }
        System.out.println();
        System.out.println("deliterlne 613:" + i);
    }

    public void abdelenie() {
        int a = 6;
        int b = 8;
        int x = 1;
        while ((a * x) % b != 0) {
            x++;
        }
        System.out.println("ab nasobok:" + a);
    }

    public void nsd() {
        int a = 96;
        int b = 27;
        int f = 0;

        if (a < b) {
            f = a;
            a = b;
            b = f;
        }
        while (a % b != 0) {
            if (a < b) {
                f = a;
                a = b;
                b = f;
            }
            f = 0;
            f = a - b;
            a = b;
            b = f;
        }
        System.out.println("nsd:" + b);
    }

    public void vymena() {
        int a=22;
        int b=33;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("vymena:"+a);

    }

//cujes idzeme vypic ne?
}

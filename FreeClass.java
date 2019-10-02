package sk.itsovy.matysko.orter;

public class FreeClass {

    public void sayHello() {
        System.out.println("Hello");
    }

    public void sayNHello(int n) {
        int i;
        for (i = 1; i <= n; i++) { //cyklus opakovanie
            System.out.println("Hello");
            System.out.println(); // medzera
        }
    }


    public void sayHi() {
        System.out.println("HI");
    }

    /*
       public  void  sayNHi(int n){
           for (int i=1; i<=n; i++) {
               System.out.println("HI");
           }
           System.out.println();
       }
   */
    public void sayNHi(int n) {
        int i = 1;
        while (i <= 1) {
            System.out.println("HI");
            i++;
        }
        System.out.println();
    }
/*
    public void getEvenNumber(int n){
        if (n%2==0)
            System.out.println(n);
        else
            System.out.println(n++);
    }
*/

    public void test() {
        for (int n = 10; n != 100; n++)
            System.out.print(n + " ");
    }

    public void parne() {
        for (int n = 10; n < 100; n = n + 2)
            System.out.print(n);

    }

    public void neparn() {
        for (int n = 99; n > 0; n = n - 2)
        System.out.println(n + " ");
    }

    public void tojCifDelitEleven() {
        for (int n = 100; n < 1000; n++)
            System.out.println();
    }
}





















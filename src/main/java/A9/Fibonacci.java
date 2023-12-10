package A9;

public class Fibonacci {
    public static void main(String[] args) {

      /*  int n = 10;
        int fib1 = 0;
        int fib2 = 1;

        System.out.println("Fibonacci Dizisi (ilk " + n + " terim):");

        for (int i = 0; i < n; i++) {
            System.out.print(fib1 + " ");

            int toplam = fib1 + fib2;
            fib1 = fib2;
            fib2 = toplam;
        }*/

        int n=10;
        int fib1=0;
        int fib2=1;
        System.out.println("Fibonacci dizisi (ilk "+ n + " terim):");
        for (int i=0;i<n;i++){
            System.out.println(fib1+" ");
            int toplam=fib1+fib2;
            fib1=fib2;
            fib2=toplam;
        }




    }
}
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int res, n;
        do {
            System.out.println("Entrez un nombre compris entre 1 et 10 : ");
            n = Sc.nextInt();
        } while (n < 1 || n > 10);

        for (int i = 1; i <= 10; i++) {
            res = n * i;
            System.out.println(n + " * " + i + " = " + res);
        }

    }
}

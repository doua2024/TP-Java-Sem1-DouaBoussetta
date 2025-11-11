import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n, i, f;
        do {
            System.out.println("sasir un entier");
            n = Sc.nextInt();
        } while (n < 0);

        f = 1;
        for (i = 1; i < n; i++) {
            f = f * i;
        }

        System.out.println("le  fact n est " + f);

    }
}

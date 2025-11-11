import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("sasir n");
            n = Sc.nextInt();
        } while ((n <= 1) || (n >= 12));

        if ((n == 1) || (n == 2) || (n == 3)) {
            System.out.println("saison hiver");

        } else if ((n == 3) || (n == 4) || (n == 5)) {
            System.out.println("saison printemps");
        } else if ((n == 6) || (n == 7) || (n == 8)) {
            System.out.println("saison été");
        } else if ((n == 9) || (n == 10) || (n == 11)) {
            System.out.println("saison été");
        }

    }
}

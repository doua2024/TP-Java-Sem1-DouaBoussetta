import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        double x;
        System.out.println("donner une temperature");
        x = Sc.nextDouble();
        if (x < 0) {
            System.out.println("le etat est glace ");
        } else if (x > 100) {
            System.out.println("le etat est eau");
        } else {
            System.out.println("le etat est vapeur");
        }

    }
}
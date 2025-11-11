import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        String ch;
        char car;
        int nb, i;
        do {
            System.out.println("donner ch");
            ch = Sc.nextLine();
        } while (ch.length() > 20);

        System.out.println("donner un car");
        car = Sc.next().charAt(0);
        nb = 0;
        for (i = 0; i < ch.length(); i++) {
            if (ch.charAt(i) == car) {
                nb = nb + 1;
            }
        }
        System.out.println("le nombre d'occurance est" + nb);

    }
}
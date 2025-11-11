import java.util.Scanner;

public class mes_methode {
    public static int lecteurN() {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("donner n");
            n = sc.nextInt();
        } while (n <= 0);
        return n;

    }

    public static int compter(int n) {
        String ch;
        ch = String.valueOf(n);
        return (ch.length());
    }

    public static int compter1(int n) {
        int i = 0;
        while (n != 0) {
            n = n / 10;
            i++;
        }
        return i;

    }

}

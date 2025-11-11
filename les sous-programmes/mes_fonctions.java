import java.util.Scanner;

public class mes_fonctions {
    public static int lecteurN() {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("donner n");
            n = sc.nextInt();   
        } while (n <= 0);
        return n;

    }
}

public class mes_fonctions {
    public static boolean estpair() {
        boolean test;
        int n;
        test = true;
        while (test) {
            if (n % 2 == 0) {
                test = true;

            } else {
                test = false;
            }
        }
        return test;

    }
}

public class mes_fonctions {
    public static int compter() {
        String ch;
        ch = String.valueOf(n);
        return ch.length();
    }

}

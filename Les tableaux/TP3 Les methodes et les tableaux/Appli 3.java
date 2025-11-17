import java.util.Scanner;

public class Appli3 {

    static int lireN(Scanner sc) {
        int n;
        do { n = sc.nextInt(); } while (n <= 0);
        return n;
    }

    static void remplir(int[] T, Scanner sc) {
        for (int i = 0; i < T.length; i++)
            T[i] = sc.nextInt();
    }

    static int[] pairs(int[] T) {
        int k = 0;
        for (int x : T) if (x % 2 == 0) k++;
        int[] R = new int[k];
        int j = 0;
        for (int x : T) if (x % 2 == 0) R[j++] = x;
        return R;
    }

    static int[] impairs(int[] T) {
        int k = 0;
        for (int x : T) if (x % 2 != 0) k++;
        int[] R = new int[k];
        int j = 0;
        for (int x : T) if (x % 2 != 0) R[j++] = x;
        return R;
    }

    static void afficher(int[] T) {
        for (int x : T) System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = lireN(sc);
        int[] T = new int[n];

        remplir(T, sc);

        int[] P = pairs(T);
        int[] I = impairs(T);

        afficher(P);
        afficher(I);
    }
}

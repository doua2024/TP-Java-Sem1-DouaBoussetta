import java.util.*;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] T = new int[n];
        int s = 0;

        for (int i = 0; i < n; i++) { T[i] = sc.nextInt(); s += T[i]; }

        double moy = (double)s / n;
        int c = 0;
        for (int v : T) if (v > moy) c++;

        System.out.println("Moy = " + moy);
        System.out.println("Nb > moy = " + c);
    }
}
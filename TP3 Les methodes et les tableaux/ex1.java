import java.util.*;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] T = new int[n];
        for (int i = 0; i < n; i++) T[i] = sc.nextInt();

        int x1 = sc.nextInt(), x2 = sc.nextInt();
        for (int i = 0; i < n; i++) if (T[i] == x1) T[i] = x2;

        for (int v : T) System.out.print(v + " ");
    }
}
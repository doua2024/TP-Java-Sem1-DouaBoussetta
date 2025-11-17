import java.util.*;

public class ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] T = new int[n + 1];

        for (int i = 0; i < n; i++)
            T[i] = sc.nextInt();

        int X = sc.nextInt();
        int p = sc.nextInt();

        for (int i = n; i > p; i--)
            T[i] = T[i - 1];

        T[p] = X;

        for (int i = 0; i <= n; i++)
            System.out.print(T[i] + " ");
    }
}

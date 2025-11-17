import java.util.*;

public class ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] T = new int[n];

        for (int i = 0; i < n; i++)
            T[i] = sc.nextInt();

        int p = sc.nextInt();

        for (int i = p; i < n - 1; i++)
            T[i] = T[i + 1];

        for (int i = 0; i < n - 1; i++)
            System.out.print(T[i] + " ");
    }
}

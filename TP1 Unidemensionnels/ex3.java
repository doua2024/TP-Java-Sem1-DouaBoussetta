import java.util.*;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] T = new int[n];

        for (int i = 0; i < n; i++)
            T[i] = sc.nextInt();

        int X = sc.nextInt();
        int c = 0;

        for (int v : T)
            if (v == X) c++;

        System.out.println("Occurrences = " + c);
    }
}

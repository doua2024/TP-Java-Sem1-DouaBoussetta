import java.util.*;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] T = new int[n];

        for (int i = 0; i < n; i++)
            T[i] = sc.nextInt();

        boolean sorted = true;
        for (int i = 0; i < n - 1; i++)
            if (T[i] > T[i + 1]) sorted = false;

        System.out.println(sorted ? "Trie" : "Non trie");
    }
}

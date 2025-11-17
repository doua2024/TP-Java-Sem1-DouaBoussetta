import java.util.*;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), m = sc.nextInt();
        int[][] M = new int[n][m];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                M[i][j] = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int s = 0;
            for (int j = 0; j < m; j++) s += M[i][j];
            System.out.println("Somme ligne " + i + " = " + s);
        }
    }
}
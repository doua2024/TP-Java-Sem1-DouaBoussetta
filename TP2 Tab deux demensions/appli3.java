import java.util.Scanner;

public class Appli3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nl = sc.nextInt();
        int nc = sc.nextInt();

        int[][] M = new int[nl][nc];
        int[] T = new int[nl];   

        for (int i = 0; i < nl; i++) {
            for (int j = 0; j < nc; j++) {
                M[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < nl; i++) {
            int somme = 0;
            for (int j = 0; j < nc; j++) {
                somme += M[i][j];
            }
            T[i] = somme;
        }
        int min = T[0];
        int max = T[0];

        for (int i = 1; i < nl; i++) {
            if (T[i] < min) min = T[i];
            if (T[i] > max) max = T[i];
        }
        System.out.println("Somme minimale : " + min);
        System.out.println("Somme maximale : " + max);
    }
}

import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        int n1, n2;
        System.out.print("n1 = ");
        n1 = sc.nextInt();
        System.out.print("n2 = ");
        n2 = sc.nextInt();

        if (n1 <= 0 || n1 >= 30 || n2 <= 0 || n2 >= 30) {
            System.out.println("Taille invalide");
            return;
        }

        int[][] M = new int[n1][n2];
        long s = 0;
        long p = 1;

        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                M[i][j] = sc.nextInt();
                s += M[i][j];
                p *= M[i][j];
            }
        }

        double moy = (double) s / (n1 * n2);

        System.out.println("Somme = " + s);
        System.out.println("Produit = " + p);
        System.out.println("Moyenne = " + moy);
    }
}
    


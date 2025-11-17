import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Donner n (>0) : ");
            n = sc.nextInt();
        } while (n <= 0);

        int[] T = new int[n];
        int somme = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("T[" + i + "] = ");
            T[i] = sc.nextInt();
            if (T[i] % 2 != 0)
                somme += T[i];
        }

        System.out.println("Somme des impairs = " + somme);
    }
}
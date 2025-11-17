import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Donner la taille du tableau ");
            n = sc.nextInt();
        } while (n <= 0);
           int[] T = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("T[" + i + "] = ");
            T[i] = sc.nextInt();
        }
    }
}
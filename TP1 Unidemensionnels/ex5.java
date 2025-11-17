import java.util.*;

public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] T = new int[n];

        for (int i = 0; i < n; i++)
            T[i] = sc.nextInt();

        int[] P = new int[n], I = new int[n];
        int ip = 0, ii = 0;

        for (int v : T) {
            if (v % 2 == 0) P[ip++] = v;
            else I[ii++] = v;
        }

        System.out.println("Paires:");
        for (int i = 0; i < ip; i++) System.out.print(P[i] + " ");

        System.out.println("\nImpaires:");
        for (int i = 0; i < ii; i++) System.out.print(I[i] + " ");
    }
}

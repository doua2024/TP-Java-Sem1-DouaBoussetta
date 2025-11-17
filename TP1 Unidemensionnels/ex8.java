import java.util.*;

public class ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] T = new String[n];

        for (int i = 0; i < n; i++)
            T[i] = sc.next();

        System.out.println("Nb mots = " + n);
    }
}

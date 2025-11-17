import java.util.Scanner;

public class exercice1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] T = {2, 5, 7, 12, 15, 20, 28, 33, 40, 50};
        System.out.print("saisir la valeur : ");
        int x = sc.nextInt();

        int inf = 0;
        int sup = T.length - 1;     
        boolean trouve = false;

        while (inf <= sup && !trouve) {
            int m = (inf + sup) / 2;
            if (T[m] == x) {
                trouve = true;
            } else if (x < T[m]) {
                sup = m - 1;
            } else {
                inf = m + 1;
            }
        }

        if (trouve)
            System.out.println("Valeur trouvée");
        else
            System.out.println("Valeur non trouvée");
    }
}

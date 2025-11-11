import java.util.Scanner;
public class ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Entrez le nombre de lignes de la figure à dessiner : ");
        int lignes = scanner.nextInt();
        for (int i = 1; i <= lignes; i++) {
            for (int j = 1; j <= lignes - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
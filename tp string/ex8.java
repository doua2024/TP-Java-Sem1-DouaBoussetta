import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez une phrase : ");
        String phrase = sc.nextLine();
        String[] mot = phrase.split(" +");

        System.out.println("\nNombre de mots : " + mots.length);
        System.out.println("Les mots de la phrase :");

        for (String mots : mots) {
            System.out.println(mot);
        }
    }
}

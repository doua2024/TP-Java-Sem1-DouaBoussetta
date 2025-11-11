import java.util.Scanner;
public class ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez vos coordonnées séparées par des virgules :");
        System.out.println("(Nom, Prénom, CIN, Date de naissance, Ville, Spécialité du bac, Année du bac)");
        String ligne = sc.nextLine();
        String[] infos = ligne.split(",");
        System.out.println("\n Vos coordonnées ");
        System.out.println("Nom : " + infos[0].trim());
        System.out.println("Prénom : " + infos[1].trim());
        System.out.println("CIN : " + infos[2].trim());
        System.out.println("Date de naissance : " + infos[3].trim());
        System.out.println("Ville : " + infos[4].trim());
        System.out.println("Spécialité du bac : " + infos[5].trim());
        System.out.println("Année du bac : " + infos[6].trim());
    }
}

import java.util.Scanner;
public class DebugExercice4 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Entrer un nombre entier : ");
int n = sc.nextInt();
int somme = 0;
for (int i = 1; i <= n; i++) {
somme = somme + i;
}
System.out.println("La somme des entiers de 1 à " + n + " est : " + somme);
sc.close();}}
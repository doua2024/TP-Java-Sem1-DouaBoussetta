public class DebugExemple2 {
public static void main(String[] args) {
int note1 = 14;
int note2 = 16;
int note3 = 13;
double moyenne = (note1 + note2 + note3) / 3.0;
System.out.println("La moyenne est : " + moyenne);
System.out.printf("La moyenne est : %.2f\n", moyenne);

if (moyenne >= 10)
System.out.println("Admis !");
else
System.out.println("Ajourné !");
}
}
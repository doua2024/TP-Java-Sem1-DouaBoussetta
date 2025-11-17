import java.util.Scanner;

public class Appli1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nl = sc.nextInt();
        int nc = sc.nextInt();

        int[][] M = new int[nl][nc];

        for (int i = 0; i < nl; i++)
            for (int j = 0; j < nc; j++)
                M[i][j] = sc.nextInt();

        int X = sc.nextInt(); 
        boolean found = false;
        for (int i = 0; i < nl && !found; i++)
            for (int j = 0; j < nc; j++)
                if (M[i][j] == X) {
                    found = true;
                    break;
                }

        if (found)
            System.out.println("Existe");
        else
            System.out.println("N'existe pas");
    }
}

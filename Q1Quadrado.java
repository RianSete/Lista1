import java.util.Scanner;

public class Q1Quadrado {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int vl, Area;
        System.out.println("Insira o valor do lado do quadrado: ");
        vl = input.nextInt();
        Area = vl*vl;
        System.out.println("A area do quadrado é: " + Area);
        input.close();
    }
}

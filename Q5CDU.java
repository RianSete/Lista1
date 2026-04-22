import java.util.Scanner;

public class Q5CDU {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int CDU, UCD, u, c, d;
        System.out.println("Insira um valor de 3 digitos: ");
        CDU = input.nextInt(); 
        c = CDU/100;
        d = CDU % 100 / 10;
        u = CDU % 10;
        UCD = (u * 100) + (c * 10) + d;
        System.out.println("A sequencia do numero " + CDU + " no formato UCD é: " + UCD);
        input.close();
    }
}
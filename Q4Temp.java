import java.util.Scanner;

public class Q4Temp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Double C, F;
        System.out.println("insira a temperatura em Celcius: ");
        C = input.nextDouble();
        F = (C * 1.8) + 32;
        System.out.println(" " + C + "º em graus fahrenheint é: " + F);
        input.close();
    }
}

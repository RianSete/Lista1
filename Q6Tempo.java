import java.util.Scanner;

public class Q6Tempo {
 public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int MinOriginal;
    int D, H, M, S;
    System.out.println("Escreva a medida de tempo em minutos para a conversão");
    MinOriginal = input.nextInt();
    D = MinOriginal / (60*24);
    H = (MinOriginal % (60 * 24)) / 60;
    M = MinOriginal / 60;
    System.out.println(" " + MinOriginal + " Minutos = " + D + " Dias " + H + " Horas " + M + " Minutos");
    input.close();
 }    
}

import java.util.Scanner;

public class Q2Media {
    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);
        float sn = 0, n, m;

        for(int i = 1; i <= 3; i++){

            System.out.print("Insira o " + i + "º Numero: ");
            n = input.nextFloat();
            sn = sn + n;
        }

        m = sn/3;
        System.out.print("A media dos 3 numeros é: " + m);
        
        input.close();
    }
}

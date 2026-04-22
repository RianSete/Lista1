import java.util.Scanner;

public class Q3Angulos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double Ang, rad, seno, coss, tang, cossec, sec, cotg;
        
        System.out.println ("Insira o angulo em graus: ");
        Ang = input.nextDouble();
        rad = Ang * (Math.PI / 180);
        seno = Math.sin(rad);
        coss = Math.cos(rad);
        tang = Math.tan(rad);

        cossec = 1/seno;
        sec = 1/coss;
        cotg = 1/tang;

        System.out.println("Resultados para o angulo de " + Ang + " graus");
        System.out.println("Radianos: " + rad);
        System.out.println("Seno: " + seno);
        System.out.println("Cosseno: " + coss);
        System.out.println("tangente: " + tang);
        System.out.println("cossecante: " + cossec);
        System.out.println("secante: " + sec);
        System.out.println("Cotangente: " + cotg);
        input.close();
    }
}
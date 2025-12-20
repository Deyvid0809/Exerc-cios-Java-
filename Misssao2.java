import java.util.Scanner;

public class Misssao2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos número você quer saber a média:");
        double quantNumero = sc.nextInt();

        double media = 0;
        for (int i = 1; i <= quantNumero; i++) {
            System.out.print("Digite um numero pra calcular sua média:");
            double pergunmedia = sc.nextDouble();
            media += pergunmedia;            
        }
        double resulMedia = media/quantNumero;
        System.out.printf("Média: %.2f%n", resulMedia);
    }
}

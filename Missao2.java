import java.util.Scanner;

public class Missao2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos número você quer saber a média:");
        int quantNumero = sc.nextInt();

        double media = 0;
        for (int i = 1; i <= quantNumero; i++) {
            System.out.print("Digite um numero pra calcular sua média:");
            double pergunmedia = sc.nextDouble();
            media += pergunmedia;            
        }
        double resulMedia = media/quantNumero;
        System.out.printf("Média: %.2f%n", resulMedia);

        int acima, igua, abaixo;
        acima = 0;
        abaixo = 0;
        igua = 0;
        for (int i = 1; i <= quantNumero; i++) {
            System.out.print("Digite um numero pra calcular sua média:");
            double pergunmedia = sc.nextDouble();
            
            if (pergunmedia > resulMedia) {
                System.out.print("Acima de média");
                System.out.println();
                acima += 1;
            }else if (pergunmedia == resulMedia) {
                System.out.print("Igua há média");
                System.out.println();
                igua += 1;
            }else {
                System.out.print("Abaixo da média");
                System.out.println();
                abaixo += 1;
            }
        }
        System.out.printf("Foram acima da média: %d, Foram igua há média: %d, Foram menor que a média: %d", acima, igua, abaixo);
        sc.close(); 
    }
}

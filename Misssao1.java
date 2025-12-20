import java.util.Scanner;

public class Misssao1{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números você quer digita:");
        int quantNumero = sc.nextInt();

        int menor = 0;
        for (int i = 1; i <= quantNumero; i++) {

            System.out.print("Digite um numero:");
            int numero = sc.nextInt();
            if (i == 1) {
                menor = numero;
            }else if (numero <= menor) {
                menor = numero;
            }
        }

        System.err.printf("O menor numero: %d", menor);

        sc.close();

    }
}
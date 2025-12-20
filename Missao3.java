import java.util.Scanner;

public class Missao3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = sc.nextInt();

        int invertido = 0;

        while (n > 0) {
            int ultimo = n % 10;
            invertido = invertido * 10 + ultimo;
            n = n / 10;
        }

        System.out.println("Número invertido: " + invertido);

        sc.close();
    }
}

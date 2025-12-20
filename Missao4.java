import java.util.Scanner;

public class Missao4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int op = 0;
        while (op != 3) {
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Dizer Ola");
        System.out.println("2 - Mostrar uma frase");
        System.out.println("3 - sair");
        op = sc.nextInt();
        
        if (op == 1) {
            System.out.println("Olá, seja bem-vindo!");
        }else if (op == 2) {
            System.out.println("Você está aprendendo Java");
        }else if (op == 3) {
            System.out.println("Encerrando programa!!");
        } else{
        System.out.println("Opção inválida");}
        }

        sc.close();
    }
}

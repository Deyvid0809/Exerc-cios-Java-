import java.util.Scanner;

public class Missao4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int op = 0;
        while (op != 4) {
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Dizer Ola");
        System.out.println("2 - Mostrar uma frase");
        System.out.println("3 - Digitar nome e mostrar em maiúsculo");
        System.out.println("4 - sair");
        op = sc.nextInt();
        
        if (op == 1) {
            System.out.println("Olá, seja bem-vindo!");
        }else if (op == 2) {
            System.out.println("Você está aprendendo Java");
        }else if(op == 3){
            System.out.println("Me diga seu nome:");
            String nome = sc.next();
            nome = nome.toUpperCase();
            System.err.printf("Seu nome com letras Maiúsculas: %s", nome);
            System.err.println();
        } 
        else if (op == 4) {
            System.out.println("Encerrando programa!!");
        } else{
        System.out.println("Opção inválida");}
        }

        sc.close();
    }
}

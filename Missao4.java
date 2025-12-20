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
            dizerOla();
        }else if (op == 2) {
            mostrarFrase();
        }else if(op == 3){
            nomeMaiusculo(sc);  
        } 
        else if (op == 4) {
            encerrar();
            sc.close();
        } else{
            invalido();
        }
    }


    } 

    static void dizerOla(){
        System.out.println("Olá, seja bem-vindo!");
    }
    static void mostrarFrase(){
        System.out.println("Você está aprendendo Java");
    }
    static void nomeMaiusculo(Scanner sc){
        System.out.println("Me diga seu nome:");
        String nome = sc.next();
        nome = nome.toUpperCase();
        System.out.printf("Seu nome com letras Maiúsculas: %s", nome);
        System.out.println();
    }
    static void encerrar(){
        System.out.println("Encerrando programa!!");
    }
    static void invalido(){
        System.out.println("Opção inválida");}
}
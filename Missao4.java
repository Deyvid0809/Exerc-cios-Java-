import java.util.Scanner;

public class Missao4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int op = 0;
        while (op != 5) {
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Dizer Ola");
        System.out.println("2 - Mostrar uma frase");
        System.out.println("3 - Digitar nome e mostrar em maiúsculo");
        System.out.println("4 - Contra letra em um nome");
        System.out.println("5 - sair");
        op = sc.nextInt();
        sc.nextLine();
        
        if (op == 1) {
            dizerOla();
        }else if (op == 2) {
            mostrarFrase();
        }else if(op == 3){
            nomeMaiusculo(sc);  
        } 
        else if(op == 4){
            contarLetraNome(sc);
        } 
        else if (op == 5) {
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

    static void contarLetraNome(Scanner sc){
        System.out.println("Me diga seu nome:");
        String nome = sc.nextLine();
        int letras = nome.length();
        System.out.printf("Tem %d letras", letras);
        System.err.println();
    }

    static void nomeMaiusculo(Scanner sc){
        System.out.println("Me diga seu nome:");
        String nome = sc.nextLine();
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
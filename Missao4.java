import java.util.Scanner;

public class Missao4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int op = 0;
        while (op != 6) {
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Dizer Ola");
        System.out.println("2 - Mostrar uma frase");
        System.out.println("3 - Digitar nome e mostrar em maiúsculo");
        System.out.println("4 - Contra letra em um nome");
        System.out.println("5 - Contra de vogais em um nome");
        System.out.println("6 - sair");
        op = sc.nextInt();
        sc.nextLine();

        switch (op) {
            case 1:
            dizerOla();
                break;
            case 2:
            mostrarFrase();
                break;
            case 3:
            nomeMaiusculo(sc);  
                break;
            case 4:
            contarLetraNome(sc);
                break;
            case 5:
            cotadorVogaisNome(sc);
                break;
            case 6:
            encerrar();
                break;
            default:
            invalido();
                break;
        }
    }
    sc.close();

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

    static void cotadorVogaisNome(Scanner sc){
        System.out.println("Me diga seu nome:");
        String nome = sc.nextLine();
        String nomeM = nome.toUpperCase();
        int contador = 0;
        for (int i = 0; i < nome.length(); i++) {
            char letra = nomeM.charAt(i);
            if (letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' ||  letra == 'U') {
                contador++;
            }
        }
        System.out.printf("Tem %d vogais", contador);
        System.out.println();
    }

    static void encerrar(){
        System.out.println("Encerrando programa!!");
    }
    static void invalido(){
        System.out.println("Opção inválida");}
}
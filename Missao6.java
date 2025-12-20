import java.util.ArrayList;
import java.util.Scanner;

public class Missao6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 
        ArrayList<String> nomes = new ArrayList<>();
        String nome;

        for (int i = 0; i < 3; i++) {
            System.out.print("Me diga um nome:");
            nome = sc.nextLine();
            nomes.add(nome);
        }
        for (int i = 0; i < nomes.size(); i++) {
            System.out.printf("Nome: %s", nomes.get(i));
            System.out.println();
        }

        sc.close();
    }
}

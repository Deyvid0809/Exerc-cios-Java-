import java.util.ArrayList;
import java.util.Scanner;

public class Missao7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();
        String nome = "a";
            System.out.println("Vou guarda quanto nomes você quiser. quando for parar digite fim");
        while (true) {
            nome = sc.nextLine();

            if (nome.equals("fim")) {
                break;
            }else{
                nomes.add(nome);
            }
        }

        for(String n : nomes){
            System.out.println("Nome:" + n);
        }

        sc.close();
    }
}

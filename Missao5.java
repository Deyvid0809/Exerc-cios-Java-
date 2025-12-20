import java.util.ArrayList;
import java.util.Scanner;

public class Missao5 {
    public static void main(String[] args) {

        ArrayList<Produto> produtos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int op = 0;
        while (op != 3) {
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Listar produtos");
            System.out.println("3 - Sair");
            op = sc.nextInt();
            sc.nextLine();
            switch (op) {
                case 1:
                cadastrarProduto(sc, produtos);
                    break;
                case 2:
                verProdutos(produtos);
                    break;
                default:
                encerrar();
                    break;
            }
        }

    sc.close();

    }

    static void encerrar(){
        System.out.println("Encerrando programa!!");}

    static void verProdutos(ArrayList produtos){
    System.out.println(produtos)  ;   
    }




    static void cadastrarProduto(Scanner sc, ArrayList produtos){
        System.out.println("Qual nome do produto:");
        String pName = sc.nextLine();
        System.out.println("Qual preço do produto:");
        double pPreco = sc.nextDouble();
        System.out.println("Quanto de estoque do produto:");
        int pEstoque = sc.nextInt();

        produtos.add(new Produto(pName, pPreco, pEstoque));


        }
}
class Pessoa {
        
        private String nome;
        private int idade;

        public void apresentar(){
            System.out.printf("Prezer, meu nome é %s e tenho %d anos.%n", nome, idade);
        }

        public Pessoa(String nome, int idade){
            this.nome = nome;
            this.idade = idade;
        }
        
    }

class Produto{

    private String nome;
    private double preco;
    private int estoque;
    
    public int getEstoque() {
        return estoque;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public Produto(String nome, double preco, int estoque){
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }
    @Override
    public String toString() {
        return "Produto{Nome='" + nome + "', preço=" + preco + "', estoque=" + estoque + '}';
    }

    public String resumo(){
        return String.format("Produto: %s | Preço: %.2f | Estoque: %d", nome, preco, estoque);
    }

    }
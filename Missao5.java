import java.util.ArrayList;
import java.util.Scanner;

public class Missao5 {
    public static void main(String[] args) {

        ArrayList<Produto> produtos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int op = 0;
        while (op != 5) {
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Listar produtos");
            System.out.println("3 - Prcurar produto");
            System.out.println("4 - Deletar produto");
            System.out.println("5 - Sair");
            
            op = Integer.parseInt(sc.nextLine());
            switch (op) {
                case 1:
                cadastrarProduto(sc, produtos);
                    break;
                case 2: 
                verProdutos(produtos);
                    break;
                case 3:
                procurarProduto(sc, produtos);
                    break;
                case 4:
                deletarProduto(sc, produtos);
                    break;
                case 5:
                encerrar();
                    break;
                default:
                System.out.print("Opção inválida");
                    break;
            }
        }

    sc.close();

    }


    //Deletar um produto
    static void deletarProduto(Scanner sc, ArrayList<Produto> produtos){
        System.out.println("Qual produto deseja deleta?");
        String pName = sc.nextLine();
        boolean encontro = false;
        Produto encontrado = null;
        for (Produto p : produtos){
            if (p.getNome().equalsIgnoreCase(pName)) {
                encontrado = p;
                System.out.println();
                encontro = true;
                break;
            }
            
        }
        if (!encontro) {
        System.out.println("Produto não encontrado!!!");
        }else{
        System.out.println("Produto deletado com sucesso!!!");
        produtos.remove(encontrado);
        }
    }


    //Procura um produto
    static void procurarProduto(Scanner sc, ArrayList<Produto> produtos){
        System.out.println("Qual produto deseja procurar?");
        String pName = sc.nextLine();
        boolean encontro = false;

        for (Produto p : produtos){
            if (p.getNome().equalsIgnoreCase(pName)) {
                System.out.print(p);
                System.out.println();
                encontro = true;
                break;
            }
            
        }
        if (!encontro) {
            System.out.println("Produto não encontrado!!!");
        }
    }

    //Ecerra o loop
    static void encerrar(){
        System.out.println("Encerrando programa!!");}

    //Mostra todos os produtos cadastrados
    static void verProdutos(ArrayList<Produto> produtos){
        if (produtos.isEmpty()) {
            System.out.println("Não tem produtos cadastrados");
        } else{
            for(Produto p : produtos){
                System.out.print(p);
                System.out.println();
            }
        }
    }

    //Cadastra produto
    static void cadastrarProduto(Scanner sc, ArrayList<Produto> produtos){
        System.out.println("Qual nome do produto:");
        String pName = sc.nextLine();
        System.out.println("Qual preço do produto:");
        double pPreco = Double.parseDouble(sc.nextLine());
        System.out.println("Quanto de estoque do produto:");
        int pEstoque = Integer.parseInt(sc.nextLine());

        produtos.add(new Produto(pName, pPreco, pEstoque));

        System.out.println("Produto cadastrado com sucesso!!!");


        }
}

//Molde do Produto e printa os produtos no formato
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
        return "Produto{Nome=" + nome + ", preço=R$" + preco + ", estoque=" + estoque + "}";
    }

    }
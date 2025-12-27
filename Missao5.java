import java.util.ArrayList;
import java.util.Scanner;

public class Missao5 {
    public static void main(String[] args) {

        ArrayList<Produto> produtos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int op = 0;
        while (op != 6) {
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Listar produtos");
            System.out.println("3 - Prcurar produto");
            System.out.println("4 - Deletar produto");
            System.out.println("5 - Alterar preço");
            System.out.println("6 - Sair");
            
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
                alterarPreco(sc, produtos);
                    break;
                case 6:
                encerrar();
                    break;
                default:
                System.out.print("Opção inválida");
                    break;
            }
        }

    sc.close();

    }


    //Alterar Preço de um produto
    static void alterarPreco(Scanner sc, ArrayList<Produto> produtos){
    if (produtos.isEmpty()) {
            System.err.println("Nenhum produto na lista!!!");
            return;
        }
        System.out.println("Qual nomedo produto que deseja mudar o preço?");
        String nome= sc.nextLine();
        
        Produto encontrado = null;

        for(Produto p : produtos){
            if (p.getNome().equalsIgnoreCase(nome)) {
                encontrado = p;
                break;
            }
        }

        if (encontrado == null) {
            System.err.println("Produto não encontrado");
            return;
        }

        System.out.println("Digite para qual preço você deseja alterar:");
        double preco = Double.parseDouble(sc.nextLine());
    

        if (preco > 0) {
            encontrado.setPreco(preco);
            System.out.println("Preço alterado com sucesso");
            System.out.println(encontrado);
        }else{
            System.err.println("Preço invalido digite novamente");
        }

    }


    //Deletar um produto
    static void deletarProduto(Scanner sc, ArrayList<Produto> produtos){
        if (produtos.isEmpty()) {
            System.err.println("Nenhum produto na lista!!!");
            return;
        }
        System.out.println("Qual produto deseja deleta?");
        String pName = sc.nextLine();
        Produto encontrado = null;
        for (Produto p : produtos){
            if (p.getNome().equalsIgnoreCase(pName)) {
                encontrado = p;
                System.out.println();
                break;
            }
            
        }
        if (encontrado == null) {
        System.out.println("Produto não encontrado!!!");
        }else{
        System.out.println("Produto deletado com sucesso!!!");
        produtos.remove(encontrado);
        }
    }


    //Procura um produto
    static void procurarProduto(Scanner sc, ArrayList<Produto> produtos){
        if (produtos.isEmpty()) {
            System.err.println("Nenhum produto na lista!!!");
            return;
        }
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

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public void setPreco(double preco) {
        this.preco = preco;
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
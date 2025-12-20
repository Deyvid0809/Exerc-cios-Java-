public class Missao5 {
    public static void main(String[] args) {

        Pessoa davi = new Pessoa("Davi Faustino Souza Lima", 18);
        Pessoa maria = new Pessoa("Maria clara", 20);

        davi.apresentar();
        maria.apresentar();

        Produto carro = new Produto();

        carro.setEstoque(-1);
        carro.setPreco(-20.000);
        carro.setNome("M5");
        System.out.print(carro.resumo());
        carro.setEstoque(1);
        carro.setPreco(20000.00);
        carro.setNome("M5");
        System.out.print(carro.resumo());

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

    public void setPreco(double preco) {

        if (preco > 0) {
        this.preco = preco;
        }
    }

    public void setEstoque(int estoque) {
        if (estoque >= 0) {
        this.estoque = estoque;
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String resumo(){
        return String.format("Produto: %s | Preço: %.2f | Estoque: %d", nome, preco, estoque);
    }

    }
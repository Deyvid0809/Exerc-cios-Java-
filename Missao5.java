public class Missao5 {
    public static void main(String[] args) {

        Pessoa davi = new Pessoa("Davi Faustino Souza Lima", 18);
        Pessoa maria = new Pessoa("Maria clara", 20);

        davi.apresentar();
        maria.apresentar();

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
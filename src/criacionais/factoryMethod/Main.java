package criacionais.factoryMethod;

public class Main {

    //A complexidade de criação de um objeto é delegada para a classe Factory e não quem esta utilizando o método

    public static void main(String[] args) {
        Moeda moeda = MoedaFactory.criarMoeda("Brazil");
    }
}

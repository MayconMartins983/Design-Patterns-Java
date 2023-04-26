package acoplamento;

public class Main {

    //Então, caso eu tenha um objeto pessoa e 10 implementações do interface Endereco, o baixo acoplamento se dá,
    // devido o atributo endereco da classe Pessoa ser do tipo Endereco (uma interface) e não a classe concreta EnderecoImpl?
    // Logo se eu quiser dar um novo tipo de endereco para classe pessoa é so alterar a classe passada no construtor de Pessoa?

    //Sim, exatamente! O baixo acoplamento é obtido porque a classe Pessoa não conhece as implementações concretas da interface
    // Endereco, ela só conhece a abstração fornecida pela interface. Dessa forma, se você quiser adicionar uma nova implementação
    // da interface Endereco, você só precisa criar essa nova implementação e passá-la para o construtor da classe Pessoa,
    // sem precisar alterar o código da classe Pessoa em si. Isso torna o código mais flexível e facilita a manutenção
    // a longo prazo.

    public static void main(String[] args) {
        var pessoa = new Pessoa(new EnderecoImpl("Rua teste"));
        var pessoa2 = new Pessoa(new EnderecoImpl("Rua teste 2"));
        var pessoa3 = new Pessoa(new EnderecoImpl("Rua teste 3"));
    }
}

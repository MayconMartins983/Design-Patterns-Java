package criacionais.abstractFactory2;

public class Main {

    public static void main(String[] args) {
        // Cria uma fábrica de botões Android
        FabricaBotao fabricaAndroid = new FabricaBotaoAndroid();
        // Cria um botão Android com a fábrica criada
        Botao botaoAndroid = fabricaAndroid.criarBotao();
        // Renderiza o botão Android
        botaoAndroid.renderizar();

        // Cria uma fábrica de botões iOS
        FabricaBotao fabricaIOS = new FabricaBotaoIos();
        // Cria um botão iOS com a fábrica criada
        Botao botaoIOS = fabricaIOS.criarBotao();
        // Renderiza o botão iOS
        botaoIOS.renderizar();
    }
}

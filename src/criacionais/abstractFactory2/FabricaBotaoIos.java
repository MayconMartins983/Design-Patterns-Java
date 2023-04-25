package criacionais.abstractFactory2;

public class FabricaBotaoIos implements FabricaBotao {

    @Override
    public Botao criarBotao() {
        return new BotaoIos();
    }
}

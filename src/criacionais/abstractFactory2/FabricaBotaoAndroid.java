package criacionais.abstractFactory2;

public class FabricaBotaoAndroid implements FabricaBotao {

    @Override
    public Botao criarBotao() {
        return new BotaoAndroid();
    }
}

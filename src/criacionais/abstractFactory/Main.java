package criacionais.abstractFactory;

public class Main {

    public static void main(String[] args) {
        FabricaArmas fabricaDeArmasElfos = new FabricaArmaElfos();
        Espada espadaElfa = fabricaDeArmasElfos.criarEspada();
        Arco arcoElfo = fabricaDeArmasElfos.criarArco();
        System.out.println(espadaElfa.getDescricao());
        System.out.println(arcoElfo.getDescricao());

        FabricaArmas fabricaDeArmasOrcs = new FabricaArmaOrcs();
        Espada espadaOrc = fabricaDeArmasOrcs.criarEspada();
        Arco arcoOrc = fabricaDeArmasOrcs.criarArco();
        System.out.println(espadaOrc.getDescricao());
        System.out.println(arcoOrc.getDescricao());
    }
}

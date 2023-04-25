package criacionais.abstractFactory;

import criacionais.abstractFactory.elfo.ArcoElfo;
import criacionais.abstractFactory.elfo.EspadaElfo;

public class FabricaArmaElfos implements FabricaArmas {

    @Override
    public Espada criarEspada() {
        return new EspadaElfo();
    }

    @Override
    public Arco criarArco() {
        return new ArcoElfo();
    }
}

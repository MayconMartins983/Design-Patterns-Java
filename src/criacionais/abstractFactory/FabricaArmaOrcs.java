package criacionais.abstractFactory;

import criacionais.abstractFactory.orc.ArcoOrc;
import criacionais.abstractFactory.orc.EspadaOrc;

public class FabricaArmaOrcs implements FabricaArmas {

    @Override
    public Espada criarEspada() {
        return new EspadaOrc();
    }

    @Override
    public Arco criarArco() {
        return new ArcoOrc();
    }
}

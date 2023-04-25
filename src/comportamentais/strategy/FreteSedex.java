package comportamentais.strategy;

public class FreteSedex implements Frete {

    @Override
    public Double calcularFrete(Double distancia) {
        return distancia + 10;
    }
}

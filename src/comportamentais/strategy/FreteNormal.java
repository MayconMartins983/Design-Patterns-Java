package comportamentais.strategy;

public class FreteNormal implements Frete {

    @Override
    public Double calcularFrete(Double distancia) {
        return distancia + 5;
    }
}

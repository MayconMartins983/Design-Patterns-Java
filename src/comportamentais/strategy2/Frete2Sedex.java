package comportamentais.strategy2;

public class Frete2Sedex implements Frete2 {

    @Override
    public Double calcularFrete(Double distancia) {
        return distancia + 10;
    }
}

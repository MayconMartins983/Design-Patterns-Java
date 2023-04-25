package comportamentais.strategy2;

public class Frete2Normal implements Frete2 {

    @Override
    public Double calcularFrete(Double distancia) {
        return distancia + 5;
    }


}

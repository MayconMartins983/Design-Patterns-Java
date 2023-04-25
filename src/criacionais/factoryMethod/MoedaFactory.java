package criacionais.factoryMethod;

public class MoedaFactory {

    public static Moeda criarMoeda(String pais) {
        if (pais.equals("Brazil")) {
            return new Real();
        } else if (pais.equals("EUA")) {
            return new Dolar();
        }

        throw new IllegalArgumentException("País inexistente.");
    }
}

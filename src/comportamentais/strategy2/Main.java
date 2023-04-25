package comportamentais.strategy2;

import java.util.EnumMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("Informe a distância: ");
            double distancia = entrada.nextInt();
            System.out.println("Informe a tipo Frente: (1) Normal, (2) Sedex: ");
            int tipoFrete = entrada.nextInt();
            ETipoFrete2 tipoFreteEnum = ETipoFrete2.values()[tipoFrete - 1];

            EnumMap<ETipoFrete2, Class<? extends Frete2>> enumMap = new EnumMap<>(ETipoFrete2.class);
            enumMap.put(ETipoFrete2.NORMAL, Frete2Normal.class);
            enumMap.put(ETipoFrete2.SEDEX, Frete2Sedex.class);

            Class<? extends Frete2> classeFrete  = enumMap.get(tipoFreteEnum);
            Frete2 classeInstanciada = classeFrete.getDeclaredConstructor().newInstance();

            System.out.println(classeInstanciada.calcularFrete(distancia));
        } catch (Exception e) {
            System.out.printf(e.getMessage());
        }
    }
}

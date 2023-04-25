package comportamentais.strategy;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try(Scanner entrada = new Scanner(System.in)) {
            System.out.println("Informe a distância: ");
            double distancia = entrada.nextInt();
            System.out.println("Informe a tipo Frente: (1) Normal, (2) Sedex: ");
            int tipoFrete = entrada.nextInt();
            ETipoFrete tipoFreteEnum = ETipoFrete.values()[tipoFrete - 1];

            Frete frete = tipoFreteEnum.obterClasseFrete();
            System.out.println(frete.calcularFrete(distancia));
        } catch (Exception e) {
            System.out.printf(e.getMessage());
        }
    }
}

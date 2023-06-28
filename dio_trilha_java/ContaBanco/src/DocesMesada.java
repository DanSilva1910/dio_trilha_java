import java.util.concurrent.ThreadLocalRandom;

public class DocesMesada {

    public static void main(String[] args) {
        double mesada = 50.0;

        while (mesada > 0) {
            double valorDoce = valorAleatorio();
            if (valorDoce > mesada)
                valorDoce = mesada;

            System.out.println("\n Doce valor: " + valorDoce + " Adicionado ao carrinho");
            mesada = mesada - valorDoce;
            System.out.println("Mesada restante: " + mesada);

        }

        System.out.println("\n Mesada: " + mesada);
        System.out.println("\n Joãozinho gastou toda a mesada em doces");

    }

    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(1.50, 10.50);

    }
}
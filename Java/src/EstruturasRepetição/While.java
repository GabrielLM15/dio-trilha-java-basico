package EstruturasRepetição;
import java.util.concurrent.ThreadLocalRandom;

public class While {
    public static void main(String[] args) {
        double mesada = 50.0;

        while(mesada > 0) {
            double valorDoce = ValorAleatorio();
            if(valorDoce > mesada)
                break;

            System.out.println("Doce do valor: " + valorDoce + " adicionado no carrinho");
            mesada = mesada - valorDoce;

        }
        System.out.println("Mesada: " + mesada);
    }
    public static double ValorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}

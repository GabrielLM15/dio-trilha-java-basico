package EstruturasRepetição;
import java.util.Locale;
import java.util.Scanner;
import java.util.InputMismatchException;

public class TryCatch {
    public static void main(String[] args) {
        try {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome completo ");
        String nome = scanner.nextLine().strip();
        while (nome == ""){
            System.out.println("Digite seu nome completo ");
            nome = scanner.nextLine().strip();
        }

        System.out.println("Digite sua idade ");
        int idade = scanner.nextInt();
        
        System.out.println("Digite sua altura ");
        double altura = scanner.nextDouble();

        scanner.close();

        System.out.println("Bem vindo " + nome + ", tudo bem?");
        System.out.println("Sua idade é " + idade + " anos");
        System.out.println("Sua altura é " + altura + "cm");
        }
        catch (InputMismatchException e) {
            System.err.println("Informações precisam ser numericas");
        }
    }
}
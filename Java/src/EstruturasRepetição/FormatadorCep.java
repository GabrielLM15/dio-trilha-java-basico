package EstruturasRepetição;
import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

import javax.swing.text.MaskFormatter;
public class FormatadorCep {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
            System.out.println("Digite seu CEP: ");
            String cepFormatado = formatarCep(scanner.next());
            scanner.close();

            try {
                MaskFormatter formatador = new MaskFormatter("##.###-###");
                formatador.setValueContainsLiteralCharacters(false);
                String cepCorreto = formatador.valueToString(cepFormatado);
                System.out.println(cepCorreto);
            } catch (ParseException e) {
                System.out.println("ERRO DESCONHECIDO");
            }
        } catch (CepInvalidoException e) {
            System.out.println("Quantidade de numeros errado para um cep");
        }
    }

    static String formatarCep(String cep) throws CepInvalidoException {
        if(cep.length() != 8)
            throw new CepInvalidoException();
        return cep;
    }
    
}

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Atividade7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite a referencia: ");
        String entrada = sc.nextLine();
        String regex = "^[A-Z]{3}-\\d{4}$";

        Pattern padrao = Pattern.compile(regex);
        Matcher matcher = padrao.matcher(entrada);

        if (matcher.find()) {
            System.out.println("Codigo correto");
        }else {
            System.out.println("Código seguindo o padrão errado");
        }

        sc.close();
    }
}

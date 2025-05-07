import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Atividade9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a frase: ");
        String texto = sc.nextLine();

        String regex = "#(\\w+)";

        Pattern padrao = Pattern.compile(regex);
        Matcher matcher = padrao.matcher(texto);

        if (!matcher.matches()) {
            System.out.println("Hastags encontradas: ");
            while (matcher.find()) {
                System.out.print(matcher.group(1));
            }
        } else {
            System.out.println("Não encontrado hastags");
        }
    
        sc.close();
    }
}

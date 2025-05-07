import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Atividade4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String regex = "[^.]+\\.(\\w+)$";

        System.out.print("Digite o nome do arquivo: ");
        String nomeArquivo = sc.nextLine();
        
        Pattern padrao = Pattern.compile(regex);
        Matcher matcher = padrao.matcher(nomeArquivo);

        if (matcher.find()) {
            System.out.println("Extensão arquivo: " + matcher.group(1));
        } else {
            System.out.println("Nenhuma extensão encontrada");
        }

        sc.close();
    }
}

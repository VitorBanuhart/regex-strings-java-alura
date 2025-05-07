import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Atividade8 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o cpf");
        String cpf = sc.nextLine();


        String regex = "^\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}$";
        Pattern padrao = Pattern.compile(regex);
        Matcher match = padrao.matcher(cpf);
        
        if (!match.matches()) {
            System.out.println("CPF fora do padrão");
        } else {
            System.out.println("CPF dentro do padrão");
        }
        
        sc.close();
    }
}

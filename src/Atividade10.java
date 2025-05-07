import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Atividade10 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite sua senha: ");
        String senha = sc.nextLine();

        String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$%^&+=!])(.{8})$";
        Pattern padrao = Pattern.compile(regex);
        Matcher matcher = padrao.matcher(senha);

        if (!matcher.matches()) {
            System.out.println("senha ok");
        } else {
            System.out.println("Senha fora do padrão");
        }
    
        sc.close();
    }
}

import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o texto: ");
        String texto = sc.nextLine();

        System.out.println(texto.toUpperCase());
        System.out.println(texto.toLowerCase());

        sc.close();
    }
}

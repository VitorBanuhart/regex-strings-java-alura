import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a frase: ");
        String frase = sc.nextLine();

        System.out.println("Digite a palavra que quer encontrar: ");
        String palava = sc.nextLine();

        if (!frase.contains(palava)) {
            System.out.println("A palavra não existe no texto");
        }else {
            System.out.println("A palavra \""+ palava +"\" está presente no texto");
        }


        sc.close();
    }
}

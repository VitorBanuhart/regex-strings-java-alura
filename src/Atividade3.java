import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira frase:");
        String frase = sc.nextLine();

        System.out.print("Digite a palavra a ser susbtituída: ");
        String palavra = sc.nextLine();

        
        System.out.print("Digite a nova palavra: ");
        String palavraNova = sc.nextLine();

        if (!frase.contains(palavra)) {
            System.out.println("Palavra não encontrada");
            sc.close();
            return;
        }

        String novaFrase = frase.replace(palavra, palavraNova);
        System.out.println(novaFrase);

        sc.close();
    }
}

import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) throws Exception {
    
        Scanner sc = new Scanner(System.in);

        String nome = sc.nextLine();
        System.out.println(nome);
   
        String nomeFormatado = nome.trim();

        System.out.println(nomeFormatado);

        sc.close();
    }

}

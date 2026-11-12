
import java.util.Scanner;                     // 1. traz a ferramenta

public class Desafio_1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);   // 2. cria o leitor do teclado
        int pergunta = 1;

        while (pergunta <= 3){
            int total = 0;

             System.out.print("Digite um número? ");
            int n = leitor.nextInt();             // 3. lê um inteiro

            for (int i = 1; i <= n; i++) {
                total += i;
            }

        System.out.println("A soma de 1 até " + n + " é: "+ total);
            pergunta++;

        }

        leitor.close();  // fecha o leitor
    }
}
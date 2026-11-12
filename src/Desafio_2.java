
import java.util.Scanner;  // 1. traz a ferramenta

public class Desafio_2 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);// 2. cria o leitor do teclad
        boolean continuar = true;


        System.out.print("BEM VINDO AO PAR/IMPAR TEST!!! \n");

        while(continuar == true) {

            System.out.print("Digite um número: ");

            if (leitor.hasNextInt()) {
                int n = leitor.nextInt(); // 3. lê um inteiro
                if (n % 2 == 0) {
                    System.out.print("Este número é PAR!!!\n");
                } else {
                    System.out.print("Este número é IMPAR!!!\n");
                }
                String verif = ""; // Variável para guardar a resposta

                while (true) {
                    System.out.print("Deseja continuar? (s/n): ");
                    verif = leitor.next(); // Lê a resposta do usuário

                    // Verifica se é 's' ou 'n' (ignorando maiúsculas)
                    if (verif.equalsIgnoreCase("s") || verif.equalsIgnoreCase("n")) {
                        break; // Resposta válida! Sai do loop de validação
                    } else {
                        // Se digitou qualquer outra coisa, avisa e repete
                        System.out.println("Erro: Escreva apenas 's' para sim ou 'n' para não!");
                    }
                }

                if (verif.equalsIgnoreCase("n")) {
                    continuar = false;
                }
            } else {
                System.out.println("Erro:Por favor, digite apenas números inteiros.");
                leitor.next();
                continue;
            }
        }
        System.out.print("\nTESTE ENCERRADO");
        leitor.close();// fecha o leitor
    }

}
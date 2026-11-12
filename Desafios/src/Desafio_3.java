import java.util.Scanner;

public class Desafio_3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Vamos ver qual o maior numero entre 3!");
        System.out.print("Digite o primeiro número: ");
        int n = leitor.nextInt();

        System.out.print("Digite o segundo número: ");
        int n2 = leitor.nextInt();

        System.out.print("Digite o primeiro número: ");
        int n3 = leitor.nextInt();

        if (n > n2 && n > n3) {
            System.out.print("o primeiro número " + n + " é o maior!");
        } else if (n2 > n && n2 > n3) {
            System.out.print("o segundo número " + n2 + " é o maior!");
        } else if (n3 > n && n3 > n2) {
            System.out.print("o terceiro número " + n3 + " é o maior!");
        }
    }
}

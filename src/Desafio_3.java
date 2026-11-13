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

   // Usando >= para lidar caso haja empate nos maiores
        if (n >= n2 && n >= n3) {
            System.out.print("O primeiro número " + n + " é o maior!");
        } else if (n2 >= n && n2 >= n3) {
            System.out.print("O segundo número " + n2 + " é o maior!");
        } else {
            System.out.print("O terceiro número " + n3 + " é o maior!");
        }
        leitor.close();
    }
}

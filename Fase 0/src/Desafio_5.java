import java.util.Scanner;

public class Desafio_5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String palavra =  "";
        StringBuilder inverso = new StringBuilder();
        System.out.print("Escreva uma palavra: ");
        palavra = leitor.nextLine();

        for(int i = palavra.length(); i>0; i--) {
            inverso.append(palavra.charAt(i - 1));
        }

        System.out.print("\n O inverso da palavra é: " + inverso);

    }

}
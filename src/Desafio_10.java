import java.util.Scanner;

public class Desafio_10 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        String inverso = "";
        System.out.print("Escreva uma palavra: ");
        String palavra = leitor.nextLine();
        boolean ehPalindromo = true;

        for (int inicio = 0, fim = palavra.length()-1; inicio < fim; inicio ++, fim--){
            if(palavra.charAt(inicio) != palavra.charAt(fim)){
                ehPalindromo = false;
                break;
            }

        }

       if (ehPalindromo){
           System.out.print(palavra + " é um palindromo ");
       }else {
           System.out.print("Não é um palindromo");
       }

    }
}

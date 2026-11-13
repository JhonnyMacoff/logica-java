import java.util.Scanner;

public class Desafio_10 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        String inverso = "";
        System.out.print("Escreva uma palavra: ");
        String palavra = leitor.nextLine();

        for (int i = palavra.length(); i>0;i--){
            inverso += palavra.charAt(i-1);
        }
       if (inverso.equals(palavra)){
           System.out.print(palavra + " é um palindromo ");
       }else {
           System.out.print("Não é um palindromo");
       }

    }
}

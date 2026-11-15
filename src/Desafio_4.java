import java.util.Scanner;

public class Desafio_4 {
    public static void main(String[] args){
    Scanner leitor = new Scanner(System.in);
    String frase =  "";
    System.out.print("Escreva uma frase: ");
    frase = leitor.nextLine();
    int n = 0; // Contador de vogais

    String vogais = "aeiou";


    for (char letra : frase.toCharArray()) {
        System.out.println(vogais.indexOf(letra));
        if(vogais.indexOf(letra) != -1){
            n++;
        }
    }
        System.out.println("Sua frase possui: " + n + " Vogais!");

//    for(int i = 0; i < frase.length(); i++){
//        char letra = frase.charAt(i);
//        if (letra == 'a' || letra == 'e' || letra == 'i' ||
//                letra == 'o' || letra == 'u' || letra == 'A' ||
//                letra == 'E' || letra == 'I' || letra == 'O' ||
//                letra == 'U') {
//                n += 1;
//            }
//        }
//        System.out.print("Sua frase possui: " + n + " Vogais!");
//
  }
}

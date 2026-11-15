import java.util.Scanner;

public class Desafio_7 {
    public static void main (String[] args){
    Scanner leitor = new Scanner(System.in);
    System.out.print("Digite um número e descubra se ele é Primo: ");
    int dig = leitor.nextInt();
    boolean ehPrimo = true;

        System.out.println(validaMensagemPrimo(ehPrimo(dig)));

//    if (ehPrimo){
//    System.out.print("\n" + dig + " É primo!");
//    }
//
//    else  {
//        System.out.print("\n" + dig + " Não é primo!");
//    }

    }

    public static boolean ehPrimo(int numero){
        for (int i=2;i<numero;i++){
            if(numero%i==0){
                return false;
            }
        }
        return true;
    }
    public static String validaMensagemPrimo(boolean isPrimo){
        if (isPrimo){
            return "É primo";
        }
        return "Não é primo";
    }
}

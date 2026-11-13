import java.util.Scanner;

public class Desafio_7 {
    public static void main (String[] args){
    Scanner leitor = new Scanner(System.in);
    System.out.print("Digite um número e descubra se ele é Primo: ");
    int dig = leitor.nextInt();
    Boolean ehPrimo = true;

    for (int i=2;i<dig;i++){

        if(dig%i==0){
            ehPrimo = false;
            break;
        }
        }
    if (ehPrimo){
    System.out.print("\n" + dig + " É primo!");
    }
    else  {
        System.out.print("\n" + dig + " Não é primo!");
    }
    }
}

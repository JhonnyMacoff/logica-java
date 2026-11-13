import java.util.Scanner;

public class Desafio_8 {
    public static void main (String[] args){
        Scanner leitor = new Scanner(System.in);
        int n=0;
        int fatorial;

        while(true) {
            System.out.print("\n Digite um número para descobrir o fatorial dele: ");
            n = leitor.nextInt();

            if(n >=13){
                System.out.print("\n o fatorial disto ultrapassa o limite de2.147.483.647. Por favor digite um número menor que 13!\n");
                continue;
            }
            else if (n < 0) {
                System.out.print("\nNão existe fatorial de número negativo!\n");
                continue;
            }
            fatorial = 1;
                for (int i = n; i >= 1; i--) {
                    fatorial *= i;
                }

            System.out.print("\n O fatorial de n é: " + fatorial);
            break;
        }
        leitor.close();
    }
}


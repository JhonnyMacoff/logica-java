import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in); //cria um novo leitor

        boolean rodando = true;

        int operacao;


        while (rodando){

            System.out.print("Qual operação deseja realizar: \n 1 - soma, 2 - subtração, 3 - multiplicação, 4 - divisão, 5 - sair;");
            System.out.print("\n Opção: ");

            try {
                operacao = Integer.parseInt(leitor.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("\nOpção inválida. Digite um número de 1 a 5.");
                continue;
            }

            if (operacao == 5) {
                System.out.println("Encerrando...");
                rodando = false;
                continue;
            }

            if (operacao < 1 || operacao > 4) {
                System.out.println("Opção inválida. Escolha entre 1 e 5.");
                continue;
            }

            double primeiroNum = leValidaNumero(leitor, "Digite o primeiro número: "); // lê um número com virgula e valida se é finito.
            double segundoNum = leValidaNumero(leitor, "Digite o segundo número: ");   // lê um número com virgula e valida se é finito.


            switch (operacao){

                case 1:
                    System.out.println("\nO resultado é:" + somar(primeiroNum, segundoNum) +"\n");
                    break;
                case 2:
                    System.out.println("\nO resultado é:" + subtrair(primeiroNum, segundoNum) +"\n");
                    break;
                case 3:
                    System.out.println("\nO resultado é:" + multiplicar(primeiroNum, segundoNum) +"\n");
                    break;
                case 4:
                    if (segundoNum == 0) {
                        System.out.println("\nErro: divisão por zero não é permitida.");
                    } else {
                        System.out.println("\nO resultado é: " + dividir(primeiroNum, segundoNum) +"\n");
                    }

                }
            }

    }

    public static double leValidaNumero(Scanner leitor, String mensagem) {
        while (true) {
            System.out.print(mensagem);
            String entrada = leitor.nextLine().trim().replace(',', '.');
            try {
                double valor = Double.parseDouble(entrada);
                if (!Double.isFinite(valor)) {
                    System.out.println("Digite um número finito.");
                    continue;
                }
                return valor;
            } catch (NumberFormatException e) {
                System.out.println("Número inválido. Tente novamente.");
            }
        }


    }

    public static double somar(double a, double b){
        return  a+b;
    }
    public static double subtrair(double a, double b){
        return  a-b;
    }
    public static double multiplicar(double a, double b){
        return  a*b;
    }
    public static double dividir(double a, double b){
        return  a/b;
    }

}
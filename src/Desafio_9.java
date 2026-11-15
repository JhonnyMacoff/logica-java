public class Desafio_9 {
    public static void main(String[] args){
        int[] notas ={5, 8, 10, 4, 20};
        int soma = 0;
        int maiorValor = 0;

        for (int j : notas) {
            soma += j;
            if (j > maiorValor) {
                maiorValor = j;
            }
        }
    int qtdNumAcimaMedia = 0;

    float media = (float)soma/notas.length;
        for (int nota : notas) {
            if (nota > media) {
                qtdNumAcimaMedia++;
            }
        }

        System.out.println("A média do vetor é: " + media);
        System.out.println("O maior valor do vetor é: " + maiorValor);
        System.out.println("há " + qtdNumAcimaMedia + " notas maiores que o valor da média");

    }

}

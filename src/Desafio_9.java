public class Desafio_9 {
    public static void main(String[] args){
        int[] vetor ={5, 8, 10, 4, 20};
        int soma =0;
        int maiorValor=0;

        for (int i =0;i<vetor.length; i++){
            soma += vetor[i];
            if(vetor[i]>maiorValor){
            maiorValor= vetor[i];
            }
        }
    int contador = 0;

    float resultado = (float)soma/vetor.length;

        for (int i =0;i<vetor.length; i++){
            
            if(vetor[i]>resultado){
            contador++;
            }
        }

        System.out.println("A média do vetor é: " + resultado);
        System.out.println("O maior valor do vetor é: " + maiorValor);
        System.out.println("há " + contador + " notas maiores que o valor da média");

    }

}

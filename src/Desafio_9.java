public class Desafio_9 {
    public static void main(String[] args){
        int[] vetor ={5, 8, 10, 4, 20};
        int soma =0;
        int media=0;
        int maiorValor=0;

        for (int i =0;i<vetor.length; i++){
            soma += vetor[i];
            media ++;
            if(vetor[i]>maiorValor)
            maiorValor= vetor[i];
        }

        int resultado = soma/media;

        System.out.println("A média do vetor é: " + resultado);
        System.out.println("O maior valor do vetor é: " + maiorValor);

    }

}

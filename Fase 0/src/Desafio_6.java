
public class Desafio_6 {

    public static void main (String[] args){

        for(int i=1;i<=100;i++) {

            if (restoRetornaZero(i,3) && restoRetornaZero(i,5)){
                System.out.println("FizzBuzz");
        } else if (restoRetornaZero(i,3)) {
                System.out.println("Fizz");
            } else if (restoRetornaZero(i,5)) {
                System.out.println("Buzz");
            }else {
                System.out.println(i);
            }
        }
    }

    public static boolean restoRetornaZero(int valor, int denominador){
        return valor % denominador == 0;
    }


}

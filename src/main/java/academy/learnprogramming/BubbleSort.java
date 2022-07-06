package academy.learnprogramming;

public class BubbleSort {

    public static void main(String[] args) {
        int[] intArray = new int[7];

        intArray[0] = 20;
        intArray[1] = 35;
        intArray[2] = -15;
        intArray[3] = 7;
        intArray[4] = 55;
        intArray[5] = 1;
        intArray[6] = -22;

        // define variável auxiliar que vai controlar a partição desordenada
        // define variável auxiliar que vai fazer a iteração
        // para cada elemento, faremos uma comparação entre o próprio elemento e seu vizinho
        // se o elemento for maior que o seu vizinho, trocar suas posições
        // incrementar 1 em i e fazer as comparações até que seu valor seja igual ao valor da partição desordenada
        // quando chegar, i tem que ser resetada para 0
        // valor da partição desordenada diminuir um
        // reiniciar o loop até que


        // moça
        int unsortedPartition = intArray.length-1;
        int index = 0;

        while (unsortedPartition > 0) {
            while (index < unsortedPartition) {
                if (intArray[index] > intArray[index + 1]) {
                    int temp = intArray[index + 1];
                    intArray[index + 1] = intArray[index];
                    intArray[index] = temp;
                }
                index++;
            }
            unsortedPartition--;
            index = 0;
        }

        for (int i :intArray) {
            System.out.println(i);
        }

        // moço, fazer comparação com indice fixo
    }
}

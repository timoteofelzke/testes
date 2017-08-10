/**
 * Faça um algoritmo com um vetor de 10 números. Após isto, o algoritmo
 * deve ordenar os números no vetor em ordem crescente. Escrever o vetor
 * ordenado.
 */
 
public class Exercicio2 {
    private static final void bubbleSort(int[] vetor) {
        int aux = 0;
        for(int i = 0; i < vetor.length; i++){
            for(int j = 0; j < vetor.length - 1; j++){
                if(vetor[j] > vetor[j + 1]){
                    aux = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = aux;
                }
            }
	    }
    }
    
    private static final void imprime(String mensagem, int[] valores) {
        System.out.println(mensagem);
        System.out.print("[");
        for(int valor : valores) {
            System.out.print(valor + " ");
        }
        System.out.print("]");  
    }

    public static void main(String[] args) {
        int[] valores = new int[]{1, 10, 7, 13, 8, 2, 40, 35, 27};
        
        Exercicio2.imprime("Valores fora de ordem: ", valores);
        
        Exercicio2.bubbleSort(valores);
        
        System.out.println("\n*************************");

        Exercicio2.imprime("Valores ordenados: ", valores);
      
    }
   
}
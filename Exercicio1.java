/**
 * Faça um algoritmo que retorne um vetor de Strings. Partindo desse vetor, 
 * crie um outro vetor contendo outras Strings, onde os dados deste vetor
 * acima sejam concatenados com os valores contidos nessa novo criado.
 */
 
public class Exercicio1 {

    public static void main(String[] args) {
        String[] valores = new String[]{"A", "B", "C", "D", "E"};
        String[] novosValores = new String[]{"F", "G", "H", "I", "J"};

        for (int i = 0; i < valores.length; i++) {
            valores[i] = valores[i] + novosValores[i];
        }

        System.out.println("*** IMPRESSÃO ***")
        for(String valor: valores) {
            System.out.println(valor);
        }

        System.out.println("Fim da execução...");
    }
}
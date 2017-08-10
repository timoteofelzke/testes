/**
 *Escreva um algoritmo que contenha o número total de eleitores de um município, 
 *o número de votos brancos, nulos e válidos. Calcular e escrever o percentual 
 *que cada um representa em relação ao total de eleitores.
 */

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Informe a quantidade de eleitores: ");
        int qtdEleitores = leitor.nextInt();

        System.out.print("Informe a quantidade de votos válidos : ");
        int qtdVotos = leitor.nextInt();

        System.out.print("Informe a quantidade de votos em branco : ");
        int qtdBranco = leitor.nextInt();

        System.out.print("Informe a quantidade de votos nulos : ");
        int qtdNulo = leitor.nextInt();

        double pVotoBranco = (qtdBranco * 100) / qtdEleitores;
        double pVotoComum = (qtdVotos * 100) / qtdEleitores;
        double pVotoNulo = (qtdNulo * 100) / qtdEleitores;
      
        String explicacao = "Total de eleitores: " + qtdEleitores + "\n";
        explicacao += String.format("quantidade de votos válidos ( %d votos)\n", pVotoComum, "%", qtdVotos);
        explicacao += String.format("quantidade de votos brancos ( %d votos)\n", pVotoBranco, "%", qtdBranco);
        explicacao += String.format("quantidade de votos nulos ( %d votos)\n", pVotoNulo, "%", qtdNulo);

        System.out.println("*****************\n" + explicacao);
    }
}
package com.example.demo;

import java.util.Random;
import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestedeAnalistaApplication {

	public static void main(String[] args) {

		Random random = new Random();
		int tamanhaVetor = 365;
		int vetor[] = new int[tamanhaVetor];
		int indice;

		for (indice = 0; indice < tamanhaVetor; indice++) {

			vetor[indice] = random.nextInt();
		}

		int soma = 0;
		int diasAcimaDaMedia = 0;
		int menor = vetor[0];
		int maior = vetor[0];
		for (indice = 0; indice < tamanhaVetor; indice++) {
			soma = soma + vetor[indice];

			if (vetor[indice] < menor)
				menor = vetor[indice];

			if (vetor[indice] > maior)
				maior = vetor[indice];
		}

		System.out.printf("\n");
		for (indice = 0; indice < tamanhaVetor; indice++) {
			if (vetor[indice] == menor)
				System.out.printf("Dia %d = %2d <--- menor valor\n", indice, vetor[indice]);
			else if (vetor[indice] == maior)
				System.out.printf("Dia %d = %2d <--- maior valor\n", indice, vetor[indice]);
			
		}
		for (indice = 0; indice < tamanhaVetor; indice++) {
			if (vetor[indice] > (soma / vetor.length))
				diasAcimaDaMedia++;
		}

		System.out.printf("Media de Faturamento  %d\n", soma / vetor.length);
		System.out.println("Dias acima da média " + diasAcimaDaMedia);
	}
}

package lessons.arrays;

public class Types {

	public static void main(String[] args) {

// Vettori

		int[] vettore = new int[5];

		vettore[0] = 10;

		vettore[1] = 20;

		vettore[2] = 30;

		vettore[3] = 40;

		vettore[4] = 50;

		System.out.println("Elemento all'indice 2: " + vettore[2]); // Stampa 30

// Matrici

		int[][] matrice = new int[3][2];

		matrice[0][0] = 1;

		matrice[0][1] = 2;

		matrice[1][0] = 3;

		matrice[1][1] = 4;

		matrice[2][0] = 5;

		matrice[2][1] = 6;

		System.out.println("Elemento alla posizione (1,1): " + matrice[1][1]); // Stampa 4

// Multidimensionali

// int[][][] tensor = new int[2][3][2];

//

// tensor[0][0][0] = 1;

// tensor[0][0][1] = 2;

// tensor[0][1][0] = 3;

// tensor[0][1][1] = 4;

// tensor[1][2][1] = 12;

//

// System.out.println("Elemento alla posizione (1,2,1): " + tensor[1][2][1]); // Stampa 12

// Inizializzazione tramite letterali

		int[][][] tensor = {

				{ { 23, 54, 123 }, { 12, 52 } },

				{ { 12, 65, 5095 }, { 34, 3 }, { 1 } },

				{ { 4132, 654 } },

				{ { 324, 46, 7, 8 }, { 546, 73434, 21, 6 }, { 34, 57, 6 } },

				{ { 67, 6547, 453, 3 } },

				{ { 1 }, { 34234, 52 } },

				{ { 0, 34, 6, 67, 4568 } },

				{ { -345, -4234, -6 }, { 1 }, { 0, -0 } }

		};

// Stampa del tensor

		for (int a = 0; a < tensor.length; a++) {

			System.out.println("Array Esterno: " + (a + 1) + ":");

			for (int b = 0; b < tensor[a].length; b++) {

				System.out.println("\tArray interno: " + (b + 1) + ":");

				for (int c = 0; c < tensor[a][b].length; c++) {

					System.out.println("\t\tValore: " + tensor[a][b][c]);

				}

			}

		}

// Jagged arrays

		int[] numbers = new int[] { 0, 3, 2, 4, 6, 9 };

		int max = numbers[0];

		for (int i = 1; i < numbers.length; i++) {

			if (numbers[i] > max) {

				max = numbers[i];

			}

		}

	}

}
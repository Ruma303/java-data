package lessons.arrays;

import java.util.Arrays;

public class Operations {

	public static void main(String[] args) {

// Creazione di un array di interi

		int[] arr = { 1, 2, 3, 4, 5 };

// Verificare presenza di un elemento

		int item = 3; // Elemento da cercare

		boolean element = contains(arr, item);

		if (element) {

			System.out.println("L'elemento " + item + " è presente nell'array.");

		} else {

			System.out.println("L'elemento " + item + " non è presente nell'array.");

		}

// Trovare la posizione di un elemento

		int item3 = 4; // Elemento da cercare

		int index = indexOf(arr, item3);

		if (index != -1) {

			System.out.println("L'elemento " + item3 + " si trova all'indice " + index + ".");

		} else {

			System.out.println("L'elemento " + item3 + " non è presente nell'array.");

		}

// Verificare se un array è null o vuoto

		int[] emptyArray = null; // Array vuoto

		boolean isEmpty = isNullOrEmpty(emptyArray);

		if (isEmpty) {

			System.out.println("L'array è null o vuoto.");

		} else {

			System.out.println("L'array non è null e non è vuoto.");

		}

// Copiare un array in modo indipendente

		int[] originale = { 1, 2, 3, 4, 5 };

// Metodo 1

		int[] copia = originale.clone();

		System.out.println(Arrays.toString(copia));

// Metodo 2

		int[] copia2 = new int[originale.length];

		System.arraycopy(originale, 0, copia2, 0, originale.length);

		System.out.println(Arrays.toString(copia2));

// Metodo 3

		int[] copia3 = Arrays.copyOf(originale, originale.length);

		System.out.println(Arrays.toString(copia3));

	}

	public static boolean contains(int[] arr, int item) {

		for (int n : arr) {

			if (item == n) {

				return true; // Elemento trovato

			}

		}

		return false; // Elemento non trovato

	}

	public static int indexOf(int[] arr, int item) {

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == item) {

				return i; // Restituisce l'indice

			}

		}

		return -1; // Elemento non trovato

	}

	public static boolean isNullOrEmpty(int[] arr) {

		return arr == null || arr.length == 0;

	}

}
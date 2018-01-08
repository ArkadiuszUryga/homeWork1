package b_Zadania_Domowe.a_Dzien_1;

import java.util.Arrays;
import java.util.Random;

//Uzupełnij ciało metody tak, aby dla otrzymanej tablicy jej zawartość została skopiowana do tymczasowej tablicy, której rozmiar ma być 2-krotnie większy od tablicy podanej.
//Uzupełnij brakujące elementy tymczasowej tablicy elementami tablicy pierwotnej w odwrotnej kolejności.
//Metoda ma zwrócić skopiowaną i uzupełnioną tablicę. Przykład: dla tablicy int arr[] = {1,2,3}; ma zostać zwrócona tablica int arrTmp[] = {1,2,3,3,2,1};
public class Main5a {

	public static void main(String[] args) {
		Random rand = new Random();
		int tableSize=rand.nextInt(10);
		int[] arr = new int[tableSize];
		for (int i=0;i<arr.length;i++) {
			arr[i]=rand.nextInt(100);
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(append(arr)));
	}
	static int[] append(int[] arr)	{
		int tableSize=arr.length*2;
		
		int[] temporaryTable = new int[tableSize];
		tableSize--;
		for (int i=0;i<arr.length;i++) {
			temporaryTable[i]=arr[i];
			temporaryTable[tableSize]=arr[i];
			tableSize--;
		}
		
		return temporaryTable;
		

		
	}

}

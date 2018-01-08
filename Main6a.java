package b_Zadania_Domowe.a_Dzien_1;

import java.util.Random;

//W pliku Main6.java umieść metodę o sygnaturze static int evenSum(int[][] arr).
//
//Uzupełnij ciało metody tak, aby zliczyła sumę wartości dla wszystkich elementów z nieparzystych indeksów.
//Metoda ma zwrócić sumę. Przykład: dla tablicy int arr[][] = {{1,2,3},{4,5,6}}; int sum = 2 + 5;
public class Main6a {

	public static void main(String[] args) {
		Random rand = new Random();
		int firstParameter=rand.nextInt(10);
		int secondParameter=rand.nextInt(10);
		int[][] doubledTable = new int[firstParameter][secondParameter];
		for (int i=0; i<doubledTable.length;i++) {
			for (int j=0;j<doubledTable[i].length;j++)	{
				doubledTable[i][j]=rand.nextInt(100);
			}
		}
		System.out.println("Suma liczb z indeksów nieparzystych wynosi: "+evenSum(doubledTable));

	}
	static int evenSum(int[][] arr)	{
		int sum=0;
		for (int i=0; i<arr.length;i++) {
			for (int j=0;j<arr[i].length;j++)	{
				if (j%2!=0) {
					sum+=arr[i][j];
				}
			}
		}
		
		return sum;
		
	}

}

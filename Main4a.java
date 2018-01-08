package b_Zadania_Domowe.a_Dzien_1;

import java.util.Arrays;

//Uzupełnij ciało metody tak, aby dla otrzymanej tablicy 2-wymiarowej obliczyć średnią arytmetyczną.
//Oblicz ile elementów jest mniejszych a ile większych od średniej.
//Metoda ma zwrócić tablicę składającą się z 2 elementów 1 - ilość elementów mniejszych od średniej, 2- ilość elementów większych.
public class Main4a {
	static int[][] test = {
			{	1,	3,	4	},
			{	4,	5,	6	},
			{	7,	8,	9	}	
			};
	 public static void main(String[] args) {
		 System.out.println(Arrays.toString(lessMore(test)));
		 
	 }
	 static int[] lessMore(int[][] arr)	{
		 int count=0;
		 int sum=0;
		for (int i=0;i<arr.length;i++) {
			for (int j=0;j<arr[i].length;j++)	{
				count++;
				sum+=arr[i][j];
			}
			
		}
		double average=sum/count;
		int less=0;
		int more=0;
		for (int i=0;i<arr.length;i++) {
			for (int j=0;j<arr[i].length;j++)	{
				if (arr[i][j]>average)	{
					more++;
				}
				else	{
					less++;
				}
			}
		}
		int[] result = {less, more};
		
		 
		 return result;
		 
	 }

}

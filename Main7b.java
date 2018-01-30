package b_Zadania_Domowe.a_Dzien_2;

import java.util.StringTokenizer;

//W pliku Main7.java umieść metodę o sygnaturze static String censor(String str, String[] words).
//
//Metoda:
//rozbije łańcuch tekstowy na tablicę wyrazów,
//sprawdzi, czy nie znajdują się w nim słowa niedozwolone zawarte w tablicy words,
//jeśli tak -- zamieni je na cztery gwiazdki (**)
//ponownie połączy tablicę w string i zwróci wartość.
public class Main7b {
	
	static String str=" Jedyny znany przedstawiciel monotypowego rodzaju Bundelkhandia";
	static String[] words= {"znany", "znana", "znane"};
	public static void main(String[] args) {
		System.out.println(censor(str, words));

	}
	static String censor(String str, String[] words)	{
		
	String[] toCheck = str.split(" ");
	StringBuffer sb = new StringBuffer();
	for (int i=0;i<toCheck.length;i++) {
		for (int j=0;j<words.length;j++)	{
			if (words[j].equals(toCheck[i]))	{
				toCheck[i]="****";
			}
			
			
		}
		sb.append(toCheck[i]+" ");
	}
		return sb.toString();
		
	}

}

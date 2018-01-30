package b_Zadania_Domowe.a_Dzien_2;

import java.text.CharacterIterator;

//W pliku Main5.java umieść metodę o sygnaturze static String replaceChar(String str, char forReplace, char replacement).
//
//Uzupełnij ciało metody tak, aby zwracała napis powstały z zamiany w napisie str wszystkich zmaków forReplace przez znaki replacement.
public class Main5b {
	static String str="ATV jest otwartym pojazdem (bez kabiny), przeznaczonym do jazdy poza drogami utwardzonymi.";
	static char forReplace = 's';
	static char raplacement='z';
	public static void main(String[] args) {
		System.out.println(replaceChar(str, forReplace, raplacement));

	}
	static String replaceChar(String str, char forReplace, char replacement)	{
		String strForReplace=""+forReplace;
		String strReplacement=""+replacement;
		
		
		return str.replaceAll(strForReplace, strReplacement);
		
		
	
		
	}

}

package b_Zadania_Domowe.a_Dzien_3;
//W pliku Main4.java umieść metodę o sygnaturze static int toInt(String str).
//
//Uzupełnij ciało metody tak, aby zwracała zamieniony napis str na typ int.
//Obsłuż możliwe wyjątki.
public class Main4c {
	static String str="dwadzieścia";
	static String str2="20";
	public static void main(String[] args) {
		try {
			System.out.println(toInt(str));
			
		} catch (NumberFormatException e)	{
			System.out.println("Nie można przekonwertować tego napisu na liczbę");
		}
		try {
			
			System.out.println(toInt(str2));
		} catch (NumberFormatException e)	{
			System.out.println("Nie można przekonwertować tego napisu na liczbę");
		}
		

	}
	static int toInt(String str)	{
		
		
		return Integer.parseInt(str);
		
	}

}

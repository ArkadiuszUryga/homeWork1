package b_Zadania_Domowe.a_Dzien_3;
//W pliku Main3.java umieść metodę o sygnaturze static int getLength(String str).
//
//Uzupełnij ciało metody tak, aby zwracała długość napisu str.
//Obsłuż wyjątek wywołania metody getLength(null).
public class Main3c {
	
	public static void main(String[] args) {
		String str=null;
		try	{
		System.out.println(getLength(str));
		}	catch (NullPointerException e)	{
			System.out.println("zadany tekst ma wartość Null! wykonanie funkcji wstrzymano");
		}

	}
	static int getLength(String str)	{
		
		
			return str.length();
			
		
		
		
	}

}

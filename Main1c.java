package b_Zadania_Domowe.a_Dzien_3;
//W pliku Main1.java umieść metodę o sygnaturze static void average(String a, String b).
//
//Uzupełnij ciało metody tak, aby dokonała konwersji zmiennych a i b na typ liczbowy int.
//Wykonała dzielenie zmiennej a przez zmienną b.
//Zabezpiecz program przed możliwymi błędami.
public class Main1c {

	public static void main(String[] args) {
		try {
			average("2", "1");
		}	
		catch	(ArithmeticException e) {
			e.printStackTrace();
		}
		catch (NumberFormatException ex)	{
			ex.printStackTrace();
		}

	}
	static void average(String a, String b)	{
		double result=Integer.parseInt(a)/Integer.parseInt(b);
		System.out.println(result);
	}

}

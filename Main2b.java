package b_Zadania_Domowe.a_Dzien_2;
//W pliku Main2.java umieść zmodyfikowaną metodę z zadania domowego 1 o sygnaturze static String encode(String str, int shift).
//
//shift - oznacza przesunięcie znaków
//Dodaj metodę deszyfrującą static String decode(String str, int shift) .
public class Main2b {

	public static void main(String[] args) {
		String str = "Wilkowiczki-Las – nieoficjalny przysiółek wsi Wilkowiczki w Polsce położony w województwie śląskim, w powiecie gliwickim, w gminie Toszek";
		int shift=6;
		System.out.println(encode(str, shift));

	}
	
	static String encode(String str, int shift)	{
		StringBuilder sb = new StringBuilder(str);
		for (int i = 0; i < sb.length(); i++) {
			int a = (int) sb.charAt(i);
			if (a == 32 || a == 45) {
				a = a;
			} else {

				if (a +shift > 122) {
					a = ((a + shift) - 122) + 31;
				} else {
					a += shift;
				}
			}
	
			sb.setCharAt(i, (char) a);

		}

		return sb.toString();
		
	}

}

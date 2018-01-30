package b_Zadania_Domowe.a_Dzien_2;

//Szyfr Cezara jest to szyfr za pomocą, którego Juliusz Cezar szyfrował swoje listy do Cycerona.
//
//W pliku Main1.java umieść metodę o sygnaturze static String encode(String str).
//
//Uzupełnij ciało metody tak, by zwracała napis zaszyfrowany szyfrem Cezara
public class Main1b {

	public static void main(String[] args) {
		String str = "Wilkowiczki-Las – nieoficjalny przysiółek wsi Wilkowiczki w Polsce położony w województwie śląskim, w powiecie gliwickim, w gminie Toszek";
		System.out.println(encode(str));
	}

	static String encode(String str) {
		StringBuilder sb = new StringBuilder(str);
		for (int i = 0; i < sb.length(); i++) {
			int a = (int) sb.charAt(i);
			if (a == 32 || a == 45) {
				a = a;
			} else {

				if (a + 3 > 122) {
					a = ((a + 3) - 122) + 31;
				} else {
					a += 3;
				}
			}
	
			sb.setCharAt(i, (char) a);

		}

		return sb.toString();

	}

}

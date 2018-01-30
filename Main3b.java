package b_Zadania_Domowe.a_Dzien_2;
//W pliku Main3.java umieść metodę o sygnaturze static String upperCase(String str, int index) .
//
//Metoda zwraca napis str, w którym znaki zostały zamienione na duże z pozycji podzielnych przez index
public class Main3b {

	public static void main(String[] args) {
		String str="olimpijka z rzymu (1960)";
		int index=3;
		System.out.println(upperCase(str, index));

	}
	static String upperCase(String str, int index)	{
		char[] arrayOfChars=str.toCharArray();
		for (int i=0;i<arrayOfChars.length;i++)	{
			//int j=i++;
			if (i%index==0) {
				arrayOfChars[i]=Character.toUpperCase(arrayOfChars[i]);
			}
		}
		
		return new String(arrayOfChars);
		
	}

}

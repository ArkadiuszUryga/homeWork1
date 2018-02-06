package b_Zadania_Domowe.a_Dzien_3;
//W pliku Main2.java umieść metodę o sygnaturze static String safeGet(String[] str, int index).
//
//Uzupełnij ciało metody tak aby zwracała element tablicy str zawarty pod indeksem index.
//Dodaj obsługę odpowiedniego wyjątku.
public class Main2c {
	static String[] str= {"Ala","ma","kota"};
	static int index=1;
	static int index2=3;
	public static void main(String[] args) {
		try	{
			System.out.println(safeGet(str, index));
			System.out.println(safeGet(str, index2));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Przekroczony index tabeli");
			
		}
		
		

	}
	static String safeGet(String[] str, int index)	{
		String result=str[index];
		return result;
	}

}

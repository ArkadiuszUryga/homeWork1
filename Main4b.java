package b_Zadania_Domowe.a_Dzien_2;
//W pliku Main4.java umieść metodę o sygnaturze static int tripple(String str)
//
//Metoda zwraca ilość potrójnych wystąpień znaków w napisie Przykład dla qazbbbwsx -> 1, dla aaawsxbbb ->2
public class Main4b {

	public static void main(String[] args) {
		System.out.println(tripple("aaawsxbbb"));
	}
	static int tripple(String str)	{
		
    	
    	int repeats=0;
    	char[] array = str.toCharArray(); 
    	for (int i=0; i<str.length()-2;i++) {
    		if (array[i]==array[i+1]&&array[i+1]==array[i+2])	{
    			repeats++;
    		}
    	}
    	return repeats;
	}

}

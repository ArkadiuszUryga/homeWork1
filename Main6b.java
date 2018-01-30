package b_Zadania_Domowe.a_Dzien_2;
//W pliku Main6.java umieść metodę o sygnaturze static String replaceStr(String str, String forReplace, String replacement).
//
//Uzupełnij ciało metody tak, aby zwracała napis powstały z zamiany w napisie str wszystkich wystąpień napisu forReplace przez napis replacement.
public class Main6b {
	static String str="Jesienią 1939 członkowie paramilitarnego Selbstschutzu i funkcjonariusze policji niemieckiej zamordowali tam blisko 400 mieszkańców Brodnicy i okolicznych miejscowości.";
	static String forReplace="członkowie";
	static String replacement="członki";
	public static void main(String[] args) {
		System.out.println(replaceStr(str, forReplace, replacement));

	}
	static String replaceStr(String str, String forReplace, String replacement)	{
		
		
		
		
		
		return str.replaceAll(forReplace, replacement);
		
	}

}

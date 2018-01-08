package b_Zadania_Domowe.a_Dzien_1;

import java.util.Random;

public class Main2a {

	public static void main(String[] args) {
		Random rand = new Random();
		int a=rand.nextInt(10);
		int b=rand.nextInt(10);
		System.out.println(divisibleBy(a, b));

	}
	static boolean divisibleBy(int a, int b )	{
		if (a%b==0) {
			return true;
		}
		
		return false;
		
	}

}

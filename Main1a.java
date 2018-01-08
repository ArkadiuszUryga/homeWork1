package b_Zadania_Domowe.a_Dzien_1;

import java.text.DecimalFormat;
import java.util.Random;

//W pliku Main1.java umieść metodę o sygnaturze static double dogAge(double dogAge) , która przeliczy wiek psa w psich latach.
//
//funkcja powinna przyjmować wiek psa jako parametr,
//dla pierwszych dwóch lat, każdy rok życia psa jest równy 10.5 ludzkiego roku,
//powyżej dwóch lat, każdy rok życia psa, to 4 ludzkie lata,
//funkcja powinna zwrócić wiek psa.

public class Main1a {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.00");
		Random rand = new Random();
		double min = 0.1;
		double max = 20.0;
		double randomValue= min+(max-min)*rand.nextDouble();
		System.out.println("Wiek psa: "+df.format(randomValue));
		System.out.println("Wiek człowieka: "+df.format(dogAge(randomValue)));

	}
	static double dogAge(double dogAge)	{
		double calculateAge = 0;
		if (dogAge<=2) {
			calculateAge=dogAge*10.5;
		}
		else	{
			double restOfDogLife=dogAge-2;
			calculateAge=restOfDogLife*4+21;
		}
		
		return calculateAge;
		
	}

}

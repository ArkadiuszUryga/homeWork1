package b_Zadania_Domowe.a_Dzien_1;
import java.util.Arrays;

public class Main3 {
	static int[][] test = {
			{	1,	3,	4	},
			{	4,	5,	6	},
			{	7,	8,	9	}	};

    public static void main(String[] args) {
    	System.out.println(Arrays.toString(minimum(test)));

    }
    public static int[] minimum(int[][] arr)	{
    	int[] result=new int[arr.length];
    	for (int i=0; i<arr.length; i++)	{
    		int min=arr[i][0];
    		for (int j=0; j<arr[i].length; j++)	{
    			if (arr[i][j]<min) {
    				min=arr[i][j];
    			}
    			
    		}
    		result[i]=min;
			
    	
    	}
    	return result;
    }

}

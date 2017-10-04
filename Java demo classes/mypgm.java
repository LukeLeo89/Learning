import java.util.*;
import java.lang.*;
import java.text.SimpleDateFormat;
import java.io.*;
public class mypgm
{
	public static void main(String args[]) throws IOException
	{
		/*
		FreshJuice FJ1 = new FreshJuice();
		FJ1.size = FreshJuice.FJSize.MEDIUM;
		
		
		System.out.println("Size: " +FJ1.size);
		*/
		
		
		/*
		StaticDemo s1 = new StaticDemo();
		s1.printcount();
		s1.printcount();
		*/
		
		
		
		
		/*
		int[] list = {0, 1, 2, 3, 4};
		int[] result = new int[5];
		
		
		for(int i = 0, j = result.length - 1; i < list.length; i++, j--)
		{
			result[j] = list[i];
		}
		
		for(int k = 0; k <= result.length; k++)
		{
			System.out.println(result[k]+"\n");
		}
		*/
		//mypgm m = new mypgm();
		
		
		//mypgm.printArray(new int[]{3, 1, 2, 6, 4});
		
		/*
		int[] test = m.printArr(new int[]{3, 5, 7, 8, 1});
		
		for(int k = 0; k < test.length; k++)
		{
			System.out.print(test[k]+" ");
		}
		*/
		
		
		/*
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date dt = new Date();
		String dt1 = "2017-04-07";
		
		System.out.println(sdf.format(dt).toString().equals(dt1));
		*/
		
		
		/*
		long start = System.currentTimeMillis();
		try
		{
			Thread.sleep(5*60*10); 
		}
		catch(Exception e)
		{
			System.out.println("Exception occured");
		}
		long end = System.currentTimeMillis();		
		long diff = end - start;
		
		System.out.println(diff);
		*/
		
		
		/*
		System.out.println("Args[0]: "+args[0]);
		System.out.println("Args[1]: "+args[1]);
		*/
		
		
		
		/*
		InputStreamReader cin = null;
		
		try
		{
			cin = new InputStreamReader(System.in);
			System.out.println("Enter characters, 'q' to quit");
			char c;
			do{
				c = (char)cin.read();
				System.out.print(c);
			}while(c != 'q');
		}
		finally{
			if(cin != null)
			{
				cin.close();
			}
		}
		*/
		
		
		
		
		
		/*
		int a = 40;
		int b = 20;
		
		Calculation calc = new my_calculation();
		
		calc.addition(a, b);
		calc.subtraction(a, b);
		calc.multiplication(a, b);
		calc.division(a, b);
		*/
		
		
		Animal a = new Animal();
		Dog b = new Dog();
		
		
		a.move();
		b.move();
		b.bark();
		
	}
		
		

	
	
	/*
	public static void printArray(int[] arrName)
	{
		for(int i = 0; i < arrName.length; i++)
		{
			System.out.print(arrName[i]+" ");
		}
	}
	
	
	
	
	public static int[] printArr(int[] list)
	{
		int[] result = new int[list.length];
		
		for(int i = 0, j = list.length - 1; i < list.length; i++, j--)
		{
			result[j] = list[i];
		}
		
		return result;
	}
	
	*/
	
	
	
}
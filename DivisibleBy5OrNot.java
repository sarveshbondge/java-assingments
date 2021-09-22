import java.util.Scanner;

public class DivisibleBy5OrNot 
{

	public static void main(String[] args) 
	{
		System.out.print("enter the num to check number is divisible by 5 and 11 or not ==");
		Scanner sc = new Scanner(System.in);
		int value =sc.nextInt();
		DivisibleBy5OrNot.comparev(value);
	}
	
	static void comparev(int value)
	{
		
		if(value/5==0 && value/11==0)
		{
			System.out.println(value+" is divisible by both 5 and 11");
		}
		else
		{
			System.out.println(value+" is not  divisible by both 5 and 11");
		}
	}

}


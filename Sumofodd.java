import java.util.Scanner;

/* Write a program to find sum of all odd numbers between 1 to n.*/
public class Sumofodd {

	public static void main(String[] args) 
	{
		Scanner sc  = new Scanner(System.in);
		int num  = sc.nextInt();
		Sumofodd.check(num);
		
	}
static void check(int num)
{
	int sum= 0;
	for(int i=0; i<=num; i++)
	{
		if(i%2!=0)
		{
			sum = sum + i;
		}
	}
	System.out.println("all odd sum is"+sum);
}
}

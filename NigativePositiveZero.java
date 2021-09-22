import java.util.Scanner;

public class NigativePositiveZero 
{

	public static void main(String[] args) 
	{
		System.out.println("enter value");
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();
		NigativePositiveZero.calculate(value);
	}
	
	
static void calculate(int value)
{
	if(value>0)
	{
		System.out.println("value is positive");
	}
	else if(value<0)
	{
		System.out.println("value is nigative");
	}
	else
	{
		System.out.println("value is zero");
	}
}


}

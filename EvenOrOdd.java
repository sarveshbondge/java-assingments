import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args)
	{
		System.out.println("enter number to check whether the num is even or odd");
		Scanner sc  = new Scanner(System.in);
		int num = sc.nextInt();
		
		EvenOrOdd.check(num);
		
	}
	
	
static void check(int num)
{
	if(num%2==0)
	{
		System.out.println(num+" is even num");
	}else
	{
		System.out.println(num+" is odd num");
	}
}

}

import java.util.Scanner;

public class MaxNum {

	public static void main(String[] args) 
	{
		int num1,num2,num3;
		Scanner sc = new Scanner(System.in);
		System.out.println("max between 3 num");
		System.out.println("-------------------------");
		System.out.println();
		System.out.print("num1 == ");
		num1 = sc.nextInt();
		System.out.print("num2 == ");
		num2 = sc.nextInt();
		System.out.print("num3== ");
		num3 = sc.nextInt();
		MaxNum.comparenum(num1, num2, num3);
	}
static void comparenum(int num1, int num2, int num3)
{
	
	
	if(num1>num2&&num1>num3)
	{
		System.out.println("number "+num1+" is grater");
	}
	else if(num2>num1&&num2>num3)
	{
		System.out.println("number "+num2+" is grater");
	}
	else
	{
		System.out.println("number "+num3+" is grater");
	}
}
}

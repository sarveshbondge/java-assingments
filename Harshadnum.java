import java.util.Scanner;

/*Eg 18 sum=9  and 18 is divisible by 9b */


public class Harshadnum {

	public static void main(String[] args) 
	{
		System.out.println("enter the number");
		Harshadnum.check();
	}
static void check()
{
	
	int lastnum = 1;
	int newval = 0;
	int newnum = 0;
	Scanner sc = new Scanner(System.in);
	int number = sc.nextInt();
	int temp = number;
	while(temp!=0)
	{
		lastnum = temp%10;
		newval = newval + lastnum;
		temp = temp/10;
	}//new val = 9
	
	if(number%newval==0)
	{
		System.out.println("number is harshad number");
	}
	else
	System.out.println("number is not harshad number");
}
}

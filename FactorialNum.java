import java.util.Scanner;

public class FactorialNum {

	public static void main(String[] args) 
	{
		
		System.out.println("enter the number for FACTORIAL");
		FactorialNum.check();
		
	}
static void check()	
{
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int fac = 1 ;
	int total = 0;
	
	
	for(int i = 1 ; i <= n; i ++)
	{
		fac = fac * i;
		total = total + fac;
	}	
	System.out.println("SUM OF FACTORIAL IS "+total);
}
}

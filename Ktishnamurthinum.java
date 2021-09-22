import java.util.Scanner;

public class Ktishnamurthinum {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		Ktishnamurthinum.check(number);	
	}
static void check(int number)
	{
	    int newnum = number;
		int lastnum =0;
		int total = 0;
		
		while(number!=0)
		{
		  lastnum = number%10;
		
		  total = total + Ktishnamurthinum.factorial(lastnum);
		
		  number/= 10;  
		}
						   
		if(newnum==total)
			{
				System.out.println("number is krishnamurthi num");
			}
		else
			{
				System.out.println("number is not krishnamurthi num");
			}
	}

static int factorial(int number)
{
	int fac = 1;
	for(int i = 1 ; i <= number; i++)
	  {
		fac = fac * i;
	  }	
	return fac;
}

}

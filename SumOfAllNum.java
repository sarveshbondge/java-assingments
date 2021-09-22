import java.util.Scanner;

public class SumOfAllNum {

	public static void main(String[] args) 
	{
		Scanner sc  = new Scanner(System.in);
		 System.out.println("enter the num");
		int input = sc.nextInt();
		
		SumOfAllNum.check(input);
	}
	
	
static void check(int input)
	{

	    int i,sum = 0;
	    for(i = 1; i<=input; i++)
	    {
	    	sum = sum + i;
	    	
	    }
	    System.out.println(sum);
	}

}
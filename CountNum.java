import java.util.Scanner;

public class CountNum {

	public static void main(String[] args) 
	{
		System.out.println("enter the num");
		Scanner sc  = new Scanner(System.in);
		int number = sc.nextInt();
		CountNum.check(number);
		
	}
	
	
	static void check(int number)//12345
		{
		
		   int count=0;
			while(number!=0)
			{
				number=number/10;
				count++;
			}
			System.out.println("total count is "+count);
		}
}

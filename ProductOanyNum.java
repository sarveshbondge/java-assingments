import java.util.Scanner;

public class ProductOanyNum {

	public static void main(String[] args) 
	{
		System.out.println("enter any number for product");
		
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		ProductOanyNum.check(number);
	}
	static void check(int number)
		{
			int total = 1;
			
			while(number!=0)
			{
				int sum = number%10;
				total = total*sum;
				number= number/10;
				
			}
			
			System.out.println("total is = "+total);
		}

}

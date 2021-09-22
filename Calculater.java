import java.util.Scanner;

public class Calculater {

	public static void main(String[] args) 
	{
		int total;
		
        Scanner sc =new Scanner(System.in);
		
		System.out.println("enter first num");
		int firstval  = sc.nextInt();
		
		System.out.println("enter second num");
		int secondval  = sc.nextInt();
	
		System.out.println("*************************************");
		System.out.println("print a for add");
		System.out.println("print s for sub");
		System.out.println("print d for div");
		System.out.println("print m for mul");
		System.out.println("*************************************");
		
		
		char value = sc.next().charAt(0);
		
			if(value=='a')
			{
				total =  firstval+secondval;
				System.out.println("add = "+total);
			}
			else if(value=='s')
			{
				total =  firstval-secondval;
				System.out.println("sub = "+total);
			}
			else if(value=='d')
			{
				total =  firstval/secondval;
				System.out.println("div = "+total);
			}
			else if(value=='m')
			{
				total =  firstval*secondval;
				System.out.println("mul = "+total);
			}
			else
			{
				System.out.println("invalid cahr");	
			}
	
	}

}

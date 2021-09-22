import java.util.Scanner;

public class CalculateSwitch {

	public static void main(String[] args) 
	{
 
        int total;
		
        Scanner sc =new Scanner(System.in);
		
		System.out.print("enter first num  ");
		int a  = sc.nextInt();
		
		System.out.print("enter second num  ");
		int b  = sc.nextInt();
	
		System.out.println("*************************************");
		System.out.println("print + for add");
		System.out.println("print - for sub");
		System.out.println("print / for div");
		System.out.println("print * for mul");
		System.out.println("*************************************");
		
		char operater = sc.next().charAt(0);
		switch(operater)
		{
		
			case '+':
				total =  a+b;
				System.out.println("add = "+total);
				break;
				
			case '-':
				total = a-b;
				System.out.println("sub = "+total);
				break;
				
			case '/':
				total = a/b;
				System.out.println("div = "+total);
				break;
				
			case '*':
				total = a*b;
				System.out.println("mul = "+total);
				break;
				
			default:
				System.out.println("invalid num");
			
		}
	}

}

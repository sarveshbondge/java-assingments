import java.util.Scanner;
//Write a Java program to enter number between 1to 5 and
public class NumInWord 
{

	public static void main(String[] args) 
	{
 		
        Scanner sc =new Scanner(System.in);
		
	
	
		System.out.println("*************************************");
		System.out.println("enter the number between 1 to 5");
		System.out.println("*************************************");
	
		
		int number = sc.nextInt();
		
		switch(number)
		{
		
		    case 1:
				System.out.println("number in word =  one");
				break;
			
			case 2:
				System.out.println("number in word = two ");
				break;
				
			case 3:
				
				System.out.println("number in word = three ");
				break;
				
			case 4:
				
				System.out.println("number in word = four");
				break;
				
			case 5:
				
				System.out.println("number in word = five");
				break;
				
				
			default:
				System.out.println("invalid number");
			
		}
	}

}
import java.util.Scanner;

public class NumToDate {

	public static void main(String[] args) 
	{
 		
        Scanner sc =new Scanner(System.in);
		
	
	
		System.out.println("*************************************");
		System.out.println("print 1 to 7 number for date");
		System.out.println("*************************************");
	
		
		int number = sc.nextInt();
		
		switch(number)
		{
		
		    case 1:
				System.out.println("day is sun ");
				break;
			
			case 2:
				System.out.println("day is monday ");
				break;
				
			case 3:
				
				System.out.println("day is tue ");
				break;
				
			case 4:
				
				System.out.println("day is wed ");
				break;
				
			case 5:
				
				System.out.println("day is the ");
				break;
				
			case 6:

				System.out.println("day is fri ");
				break;
			case 7:

				System.out.println("day is sat ");
				break;
				
			default:
				System.out.println("error the day not exit");
			
		}
	}

}

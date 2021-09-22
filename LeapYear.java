import java.util.Scanner;

public class LeapYear 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int inputyear;
		System.out.print("enter any num to start and 0 to exit ");	
		inputyear = sc.nextInt();
		while(inputyear!=0)
		{
			System.out.print("enter year  == ");
			inputyear = sc.nextInt();		
			if(inputyear>999 && inputyear<9999)
			{
				LeapYear.leapYear(inputyear);
			}
			else
			{
				System.out.println("enter year is invalid ");
			}

			System.out.println("-----------------------------------------");
			System.out.println("enter 0 for exit and any num for continew ");
			System.out.println("-----------------------------------------");


			int y = sc.nextInt();
			if(y==0)
			{
				System.out.println("thanck you so much for your responce");
				System.exit(0);
			}
		}

	}



	static void leapYear(int inputyear)
	{
		if(inputyear%4==0 && inputyear%100!=0 ||  inputyear%400==0)

		{
			System.out.println(">>>>>> year "+inputyear+" is leap year <<<<<<");


		}
		else
		{
			System.out.println(">>>>>> year "+inputyear+" is not leap year <<<<<<");
		}
	}
}


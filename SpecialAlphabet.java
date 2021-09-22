import java.util.Scanner;

public class SpecialAlphabet {

	public static void main(String[] args) 
	{
		System.out.println("enter the value");
		
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine().toUpperCase();
		int value = (int)input.charAt(0);
		
		
		SpecialAlphabet.check(value);
	}
	
	
static void check(int value)
{
	if(value>=48&& value<=57)
	{
		System.out.println("value is number");
	}
	else if(value>=65&& value<=90)
	{
		System.out.println("value is alphabet");
		
	}
	else
	{
		System.out.println("value is spatial char");
	}
}

}

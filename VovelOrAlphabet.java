import java.util.Scanner;

public class VovelOrAlphabet {

	public static void main(String[] args) 
	{
		
		System.out.println("enter any single alphabet");
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
	    char input = str.charAt(0);
		
	    VovelOrAlphabet.voVel(input);

     }
	
	static void voVel(char input)
	{
		if(input == 'a'||input == 'e'||input == 'i'||input == 'o'||input == 'u')
		{
			System.out.println("alphabet is voveis");
		}
		else
		{
			System.out.println("alphabet is not voveis");
		}
	}
}

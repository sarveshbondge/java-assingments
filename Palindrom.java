import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) 
	{
		int newstring = 0;
		int lastnum = 0 ;
		System.out.println("enter any number");
		
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int temp = number;
	   while(number!=0)
	   {
		  lastnum = number%10;
		  newstring = newstring*10+lastnum;
		  number = number/10;
	   }
	   if(temp==newstring)
	   {
		   System.out.println("NUMBER IS PALINDROME");
	   }
	   else
	   {
		   System.out.println("num is non palindrome");
	   }
	  
		
		
	}
}

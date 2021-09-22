import java.util.Scanner;

public class PowerBreath {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int base = sc.nextInt();
		int index = sc.nextInt();
		
		PowerBreath.check(base, index);
	}
	
static void check(int base , int index)
{
	int sum =0;
	for(int i = 1; i<=index; i++)
	{
	  base = base*i;
	    
	    System.out.println(base);
	}
	System.out.println(sum);
}

}

import java.util.Scanner;

/*WAP to check given no is automorphic or not
   input n=25
  output Automorphic
as 25*25=625
;*/



public class AutomorphineNum {

	public static void main(String[] args) 
	{
		System.out.println("enter any number");
		Scanner sc = new Scanner(System.in);
	    int number= sc.nextInt();
		AutomorphineNum.check(number);
	}
static void check(int number)
{
	int lastval = 0;
	int newval = 0;
	int newval1 = 0;
	
	
	
  
    int output = number*number;
    int temp  = output;
    int count = 1;
    while(temp!=0)
    {
    	lastval = temp%10;
    	newval = newval*10+lastval;
    	temp = temp/10;
    	
    	count++;
    	if(count==3)
    	
  		break;
    	
    }
    
    while(newval!=0)
    {
    	lastval = newval%10;
    	newval1 = newval1*10+lastval;
    	newval = newval/10;
    }
    
    if(number==newval1)
    {
    	System.out.println("number is automorphic number");
    }
    else
    {
    	System.out.println("number is not automorphic number");
    }
   
}

}

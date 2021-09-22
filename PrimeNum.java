
public class PrimeNum {    // 12345678

	public static void main(String[] args) 
	{
		PrimeNum.checkPrime();
	}
static void checkPrime()
{
	System.out.println("in check");
	int j;
	
	for(j =400; j>=300; j--)
	{
		int count = 0;
	   for(int i = 1; i<=j; i++)
	    {
		   if(j%i==0)
		     {
			   
				count++;
		     }
		}
	   if(count==2)
	   {
	   System.out.println(j);
	  
	   }
	}
}
}

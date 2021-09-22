
public class AllPalindromeNumber {

	public static void main(String[] args) 
	{
		System.out.println("all palindrom nuber are following");
		AllPalindromeNumber.rangeCheck();
		
	}

	static void rangeCheck()
{
	int lastval = 1;
	int newval =0;
	for(int i = 100; i<=500; i++)
	{
		int temp = i;
		
		while(temp!=0)        
		{
		 lastval = temp%10;         
		 newval = newval*10+lastval;    
		 temp= temp/10;
		}
		
		
       if(i==newval)
       {
    	   System.out.println(newval);
       }
       newval=0;
	}
	
}
}

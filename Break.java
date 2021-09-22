
public class Break
{
	public static void main(String args[])
	{
		Break.check();
	}
static void check()
{
	 for(int i=20; i>=1; i--)
	 {
			 if(i==10)
			 {
				 System.out.println("10 is find");
				 break;
			 }
			 System.out.println(i);	
		 }
	 }
}


/* WAP to print even numbers from 121 to 229 using for loop. */
public class EvannumFrom 
{
	public static void main(String args[])
	{
		 EvannumFrom.check();
	}
static void check()
{
	 for(int i=121; i<=229; i++)
	 {
		 if(i%2==0)
		 {
			 System.out.println(i);
		 }
	 }
}

}

/* WAP to print odd numbers from 521 to229 using for loop. */
public class Oddnum 
{
	public static void main(String args[])
	{
		Oddnum.check();
	}
static void check()
{
	 for(int i=521; i>=229; i--)
	 {
		 if(i%2!=0)
		 {
			 System.out.println(i);
		 }
	 }
}

}

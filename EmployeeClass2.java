/*2.	Create a class Account with member Variable: long account No, String customer Name.
 * 
Make them public.
Create default constructor assign new value to all variables and print I am in default constructor.
Create constructor which takes all arguments and assigns those values to the member variables
  and print I am in parameterized constructor.
*/

public class EmployeeClass2 {

	
	public long  account_No;
	public String customer_Name;
	
	public static void main(String[] args) 
	{
		EmployeeClass2 obj = new EmployeeClass2();
		obj.parMiteriseConstructer(34321,"bondge");
	}

	public EmployeeClass2()
	{
		account_No = 1;
		customer_Name = "start"; 
		System.out.println("i am in default constructer");
	}
	
	public void parMiteriseConstructer(int acn,String cosn)
	{
		account_No = acn;
		customer_Name = cosn;
		System.out.println("i am in paramiterise constructer");
	}
	
	
	
}

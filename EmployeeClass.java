/*1.	Create a class Account containing following methods - insert ()
 *  to insert account data
display () to display account information deposit () to deposit amount
withdraw () to withdraw amount check_balance() to check balance
*/
public class EmployeeClass 
{
	 int id;
	 String name;
	 int acc_number;
	 int balance;
	

	public static void main(String[] args) 
	{
		EmployeeClass obj = new EmployeeClass();
		obj.insert(1,"sarvesh",12345,22000);
		obj.display();
		obj.chick_balance();
		obj.deposit(90000);
		obj.chick_balance();
		
	}
	
	
    public void insert(int id,String name ,int acc_number,int balance )
	{
		this.id = id;
		this.name = name;
		this.acc_number = acc_number;
		this.balance = balance;
	}
   
	
    public void display()
	{
		System.out.println("emp id is - "+id);
		System.out.println("emp name is - "+name);
		System.out.println("emp account number is - "+acc_number);
		System.out.println("emp acc balance is - "+balance);
	}
	
	
    public void deposit(int amount)
	{
		 balance = balance + amount;
		
	}
	
	
    public void chick_balance()
	{
	    System.out.println("balance is - "+balance);
	}
}

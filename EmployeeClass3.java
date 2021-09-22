/*3.	Create one class Employee (id , name, salary) with private access modifier
 *      create getter and setter.*/

public class EmployeeClass3 
{
	private int id;
	private String name;
	private int salary;

	public static void main(String[] args) 
	{
		EmployeeClass3 obj = new EmployeeClass3();
		
		obj.setId(1234);
		obj.setName("sarvesh");
		obj.setSalary(22000);
		
		int id = obj.getId();
		System.out.println("emp is - "+id);
		
		String name = obj.getName();
		System.out.println("emp is - "+name);
		
		int sal = obj.getSalary();
		System.out.println("emp is - "+sal);
	}
	
	
	public void setId(int id)
	{
		this.id = id;
	}
	public int getId()
	{
		return id;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	
	public void setSalary(int salary)
	{
		this.salary = salary;
	}
	public int getSalary()
	{
		return salary;
	}
	

}

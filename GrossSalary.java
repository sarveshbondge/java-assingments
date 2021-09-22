import java.util.Scanner;



public class GrossSalary {

	public static void main(String[] args) 
	{
		System.out.println("what is the sallary of the employee");
		Scanner sc = new Scanner(System.in);
		
		float sallary = sc.nextFloat();
		
		GrossSalary.sallarycount(sallary);
	}
	
static void sallarycount(float sallary)
{
	if(sallary<=10000)
	{
		float i = 20f/100f;
		float HRA = i*sallary;
		System.out.println(HRA+"is the employee HRA");
		float DA = (80f/100f)*sallary;
		System.out.println(DA+"is the employee DA");		
	}
	else if(sallary>10000 && sallary<=20000 )
	{
		float HRA = (25f/100f)*sallary;
		System.out.println(HRA+"is the employee HRA");
		float DA = (90f/100f)*sallary;
		System.out.println(DA+"is the employee DA");		
	}
	else
	{
	
		float HRA = (30f/100f)*sallary;	
		System.out.println(HRA+"is the employee HRA");
		float DA = (95f/100f)*sallary;
		System.out.println(DA+"is the employee DA");		
	}
	
		
	
	
	
}

}

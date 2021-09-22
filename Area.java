import java.util.Scanner;

public class Area 
{

	public static void main(String[] args) 
	{
		int radius,width,length,value,breath,area;
 		
        Scanner sc =new Scanner(System.in);
		
	
	
		System.out.println("*************************************");
		System.out.println("1 Area of a circle");
		System.out.println("2.Area of a square");
		System.out.println("3.Area of a right angled triangle");
		System.out.println("4.Area of a rectangle Circumference of a circle");
		System.out.println("5.Circumference of a circle");
		System.out.println("*************************************");
	
		
		int number = sc.nextInt();

		switch(number)
		{
		
		    case 1:
		    	System.out.println("enter radius");
		    	radius = sc.nextInt();
		     float v = (float)(3.14f*(radius^2));
				System.out.println("Area of a circle = "+v);
				break;
			
			case 2:
				System.out.println("enter area");
		    	area = sc.nextInt();
				value = (area^2);
				System.out.println("Area of a square "+value);
				break;
				
			case 3:
				System.out.println("enter area");
		    	area = sc.nextInt();
		    	System.out.println("enter breath");
		    	breath = sc.nextInt();
				value = (area*breath);
				System.out.println("Area of a right angled triangle"+value);
				break;
				
			case 4:
				System.out.println("enter width");
		    	width = sc.nextInt();
		    	System.out.println("enter length");
		    	length = sc.nextInt();
				value = (width*length);
				System.out.println("Area of a rectangle"+value);
				break;
				
			case 5:
				System.out.println("enter radius");
		    	radius = sc.nextInt();
				value = (2*(27/2)*radius);
				System.out.println("Circumference of a circle = "+value);
				break;

				
				
			default:
				System.out.println("not in option");
			
		}
	}

}

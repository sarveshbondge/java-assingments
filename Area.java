import java.util.Scanner;

public class Area 
{
	int area;
	
	int width,length;
	float pi = 3.14f,radius,value;
	
	Scanner sc = new Scanner(System.in);
	
	public void Area(int area)
	{
		value = (area*area);
		System.out.println("Area of a square "+value);
	}
	
	public void Area(float radius)
	{
		float r=radius*radius;
	    value =	pi*r;
		System.out.println("Area of a circle "+value);
	}
	
	public void Area(int width,int length)
	{
	    
		int l = length;
		int w = width;
		int total = w*l;
		System.out.println("Area of a rectangle "+total);
	}
	
	public static void main(String[] args) 
	{
		Area ar = new Area();
		ar.Area(1234);
		ar.Area(30);
		ar.Area(32, 76);
	}

}


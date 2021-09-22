import java.util.Scanner;

public class TableOfGivanNum
{
public static void main(String args[])
{ 
	System.out.println("enter the num");
	Scanner sc = new Scanner(System.in);
	int number = sc.nextInt();
	TableOfGivanNum.check(number);
}

static void check(int number)
{
	for(int i =1;i<=10; i++)
	{
		int num= number*i;
		System.out.println(i+"="+num);
	}
}
}

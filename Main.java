/*	
 * Create a class Student with 4 variables called as rollNo, admissionNo, age, courseId.
 * Each of the variables should have one of the access modifier - public, protected, no-access-modifier and private.
 * Add 4 methods in the class – public, method doPublic, 
 * no access modifier method doDefault, protected method doProtected, private method doPrivate.
 * In main method outside the class but in same package – create object of type Student.
*/
public class Main
{
	public static void main(String[] args) 
	{
		Student s = new Student();
	    s.setAdmissionNo(12345);
	    int input = s.getAdmissionNo();
	    System.out.println("admission no is"+input);
	    
	    s.doPublic("123432");
	    s.doPublic(32);
	    s.doProtected("think1234");
	    
	}
}







/*	
 * Create a class Student with 4 variables called as rollNo, admissionNo, age, courseId.
 * Each of the variables should have one of the access modifier - public, protected, no-access-modifier and private.
 * Add 4 methods in the class – public, method doPublic, 
 * no access modifier method doDefault, protected method doProtected, private method doPrivate.
 * In main method outside the class but in same package – create object of type Student.
*/
class Student 
{
    public String rollNo; 
	private int admissionNo;  
	protected String courseId;
	int age;
	
	
	public int getAdmissionNo() 
	{
		return admissionNo;
	}

	public void setAdmissionNo(int admissionNo) 
	{
		this.admissionNo = admissionNo;
	}
	
    public void doPublic(String rollno)
    {
    	this.rollNo = rollno;
        System.out.println("roll no = "+rollno);
    }
    
    void doPublic(int a)
    {
    	this.age = a;
    	System.out.println("age ="+a);
    }
    
    protected void doProtected(String cId) 
    {
    	courseId = cId;
    	System.out.println("course id = "+cId);
    }
    

}







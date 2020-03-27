public class Student{
	
	String studentName;
	int studentId;
	String department;
	float cgpa;
	
	public Student(){
		studentName= " ";
		studentId=0;
		department=" ";
		cgpa= 0.00f;
	}
	
	public Student(String studentName, int studentId, String department,float cgpa)
	{
		this.studentName = studentName;
		this.studentId = studentId;
		this.department = department;
		this.cgpa = cgpa;
	}
	
	
		
	public void showInfo()
	{
		System.out.println("Student Name:"+studentName);
		System.out.println("Id Number:"+studentId);
		System.out.println("Department:"+department);
		System.out.println("Result:"+cgpa);
	}
	
	public void borrowBook(Book book,String borrowDate)
	{
		System.out.println("Borrowed Book:"+book.getbookName());
		System.out.println("Borrow Date:"+borrowDate);
	}
	
	
	
}
	
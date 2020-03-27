package information


public class Information{

	String name;
	int id;
	String department;
	float cgpa;
	
	
	Student(String nam, int id, String dept, float cg)
	{
		this.name= nam;
		this.id = id;
		this.department = dept;
		this.cgpa = cg;
		
	}
	
	void setName(String nam)
	{	
		name = nam;
	}
	
	String getname()
	{
		return name;
	}
	
	void setid(int id)
	{
		id = id;
	}
	int getid()
	{
		return id;
	}
	void setdepartment(String dept)
	{
		department = dept;
	}
	String getdepartment()
	{
		return department;
	}
	
	void setcgpa(float cg)
	{
		cgpa = cg;
	}
	float getcgpa()
	{
		return cgpa;
	}
	
	void showInfo()
	{
		System.out.println("Name :"+name);
		System.out.println("Id :"+id);
		System.out.println("Department :"+department);
		System.out.println("CGPA :"+cgpa);
		reverseit();
		
		
	}
	
	
	void reverseit()
	{
		
		
	String s = Integer.toString(getid()); 

	char[] charArray = new char[s.length()]; 

	charArray = s.toCharArray();
		
	System.out.print("Reverse ID:");
	
	

	for (int i=charArray.length-1;i>=0;i--)
	{
		System.out.print(charArray[i]);
		
	}
		
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	
					
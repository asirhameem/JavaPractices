public class Library
{
	private int libId;
	String libName;
	//int libDue;
	//int borrowDate;
	double libDue = 0.0f;
	
	Book[] listBook;
	

public Library()
{
	libId = 0;
	libName = " ";
	//libDue = 0;
	//borrowDate=" ";
	
}
public Library(int libId, String libName,Book[] listBook)
{
	this.libId = libId;
	this.libName = libName;
	this.listBook = listBook;
	//this.libDue = libDue;
	//this.borrowDate = borrowDate;
}
public double dueBalance(int dueDate)
{
	int n;
	
	if(dueDate>5)
	{
		for(n=6;n<=dueDate;n++)
		{
		libDue += 10;
		}
	}
	else
	{
		libDue = 0.0f;
	}
	System.out.println("Library Due:"+libDue);
	
	return libDue;
}

void showInfo()
{
	
	System.out.println("Library Name:"+libName);
	System.out.println("Id:"+libId);
	for(int i =0;i<=listBook.length -1; i++)
	{
		System.out.println("Book:"+listBook[i].getbookName());
	}
}

public double getdueBalance()
{
	return libDue;
}

}
public class Library{
	String libName;
	String libAddress;
	Book[] listOfBook;
	int totalBook;
	//int libDueBalance =0;
	double libDueBalance;
	
	public Library()
	{
		libName = " ";
		libAddress = " ";
		totalBook = 0;
	}
	
	public Library(String libName, String libAddress,Book[] listOfBook,int totalBook )
	{
		this.libName = libName;
		this.libAddress = libAddress;
		this.totalBook = totalBook;
		this.listOfBook = listOfBook;
		
	}
	
	public void showInfo()
	{
		System.out.println("Library Name:"+libName);
		System.out.println("Library Address:"+libAddress);
		System.out.println("Total Books In Library:"+totalBook);
		
		for(int i=0;i<=listOfBook.length-1;i++)
		{
			System.out.println("Book List:"+listOfBook[i].getbookName());
		}
		
	}
	
	public void libAccount(int dueDate)
	{
		
		
		int n;
		if(dueDate>5)
		{
			for(n=6;n<=dueDate;n++)
			{
				libDueBalance += 10;
			}
		}
		else
		{
			libDueBalance = 0;
		}
		System.out.println("Due Balance: "+libDueBalance);
		
	}
		
		public double getlibDueBalance()
		{
			return libDueBalance;
		}
		
		
	
	
	
	
}
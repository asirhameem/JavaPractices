public class Account{
	
	String accName;
	int accId;
	double accBalance;
	
	public Account()
	{
		accName = " ";
		accId = 0;
		accId = 0;
		accBalance = 0.00;
	}
	
	public Account(String accName, int accId, double accBalance)
	{
		this.accName = accName;
		this.accId = accId;
		this.accBalance = accBalance;
	}
	
	
	public void deposit(double y)
	{
		accBalance += y;
	}
	
	public void transaction(double z)
	{
		accBalance -= z;
	}
	
	public void accInfo()
	{
		System.out.println("Account Name:"+accName);
		System.out.println("Account Id:"+accId);
		System.out.println("Account Balance:"+accBalance);
		
	}
	
	public void payLibDue(Library d)
	{
		accBalance-=d.getlibDueBalance();
	}
	
	
}
		
		
		
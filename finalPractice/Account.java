public class Account
{
	int accId;
	double accBal;
	String accName;
	
public Account()
{
	accId = 0;
	accBal = 0.0f;
	accName = " ";
}
public Account(int accId,double accBal,String accName)
{
	this.accId = accId;
	this.accBal= accBal;
	this.accName = accName;
}
public String getaccName()
{
	return accName;
}
public double getaccBal()
{
	return accBal;
}
public void showInfo()
{
	System.out.println("Holder Name:"+accName);
	System.out.println("Account Id:"+accId);
	System.out.println("Account Balance:"+accBal);
}
public double paylibDue(Library l1)
{
	accBal -= l1.getdueBalance();
	
	System.out.println("Balance:"+accBal);
	
	return accBal;
}

}
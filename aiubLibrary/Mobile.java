public class Mobile{
	String mobileOwnerName,mobileNumber,mobileBalance,mobileOSName;
	boolean lock;
	
	public Mobile(){
		mobileOwnerName = "";
		mobileNumber = "";
		mobileBalance = "";
		mobileOSName = "";
		lock = true;
	}
	
	public Mobile(String mobileOwnerName,String mobileNumber,String mobileBalance,String mobileOSName,boolean lock){
		this.mobileOwnerName = mobileOwnerName;
		this.mobileNumber = mobileNumber;
		this.mobileBalance = mobileBalance;
		this.mobileOSName = mobileOSName;
		this.lock = lock;
	}
	
	public void showInfo(){
		if(!lock){
			System.out.println("/nOwner Name:"+mobileOwnerName);
			System.out.println("Mobile Number:"+mobileNumber);
			System.out.println("Balance:"+mobileBalance);
			System.out.println("OS Name:"+mobileOSName);
			System.out.println("Lock Info:"+lock);
		}
		else{
			System.out.println("Mobile is Lock/nUnlock to showInfo");
			
		}
	}
	
	public void recharge(int amount){
		if(!lock){
			int balance = Integer.parseInt(mobileBalance);
			balance += amount;
			mobileBalance = Integer.toString(balance);	
		}
		else{
			System.out.println("Recharge is not possible!!!\nunlock mobile first");
			
		}
	}
	
	void callSomeone(int timeDuration){
		if(!lock){
			int balance = Integer.parseInt(mobileBalance);
			balance -= (timeDuration*1);
			mobileBalance = Integer.toString(balance);
			System.out.println("Call duration "+timeDuration +"cost: "+(timeDuration*1));	
		}
		else{
			System.out.println("Phone is Lock can't make a phone call!!!");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
public class AddressBook{
	private String ownerName,info;
	private Contact [] listOfContact = new Contact[100];
	static int contactcount = 0;
	
	public AddressBook(){
		
	}
	
	public AddressBook(String ownerName,String info,Contact [] listOfContact){
		this.ownerName = ownerName;
		this.info = info ;
		this.listOfContact = listOfContact;
	}
	
	public void showAllContacInfo(){
		System.out.println("Owner's Name:"+ownerName);
		System.out.println("Owner's Info:"+info);
	}
	
	public void addContact(Contact con){
		listOfContact[contactcount++] = con;
	}
	
	public void deleteContact(Contact con){
		con = null;
	}
}
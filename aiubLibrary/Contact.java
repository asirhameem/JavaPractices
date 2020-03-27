public class Contact{
	private String personName,personId,mobileNumber;
	private int age;
	char gender;
	
	public Contact(){
		personName = "";
		personId = "";
		mobileNumber = "";
		age = 0;
	}
	
	public Contact(String personName,String personId,String mobileNumber,int age,char gender){
		this.personName = personName;
		this.personId = personId;
		this.mobileNumber = mobileNumber;
		this.age = age;
		this.gender = gender;
	}
	
	public void showPersonInfo(){
		System.out.println("/nPerson's Name: "+personName);
		System.out.println("ID: "+personId);
		System.out.println("age: "+age);
		System.out.println("Mobile Number: "+mobileNumber);
		System.out.println("Gender: "+gender);
	}
	
	public void detectMobileOperator(){
		int mobileNum = Integer.parseInt(mobileNumber);
		mobileNum /=100000000;
		mobileNum %=10;
		
		if(mobileNum == 7){
			System.out.println("Mobile Operator is GP");
		}
		else if(mobileNum == 9){
			System.out.println("Mobile Operator is Banglalink");
		}
		else if(mobileNum == 8){
			System.out.println("Mobile Operator is Robi");
		}
		else if(mobileNum == 6){
			System.out.println("Mobile Operator is Airtel");
		}
		else{
			System.out.println("Unkonwn Mobile Operator");
		}
		
	}
}
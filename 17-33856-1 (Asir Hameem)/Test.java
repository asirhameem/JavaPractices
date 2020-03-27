public class Test{
	
	public static void main(String[] x)
	{
		Student st1 = new Student("Hameem",33856,"CSE",3.3f);
		st1.showInfo();
		//st1.borrowBook(b3,"31-03-2019");
		
		
		Book b1 = new Book("Amar Bondhu Saqif", "Jafar bai", "121", "fiction");
		Book b2 = new Book("Amar Bondhu Himel", "putin bai", "125", "fiction");
		Book b3 = new Book("Amar Bondhu Minhaz", "trump bai", "126", "fiction");
		Book b4 = new Book("Amar Bondhu Fahmid", "obama bai", "128", "fiction");
		st1.borrowBook(b3,"31-03-2019");
		b1.showInfo();
		
		Book[] bookList ={b1, b2, b3, b4};
		Library l1 = new Library("saqif boi","block C",bookList,12);
		l1.showInfo();
		l1.libAccount(6);
		
		Account acc1 = new Account("Prodipta",93335,343.56);
		
		acc1.deposit(42);
		
		acc1.transaction(15.56);
		acc1.payLibDue(l1);
		acc1.accInfo();
		
		
		
	
	
	
		
		
		
		
	}		
	
}
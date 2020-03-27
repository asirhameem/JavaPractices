public class Test
{
	public static void main(String[] x)
	{
		
		Book bo1 = new Book("hath er majhe Ganja","obama",111);
		Book bo2 = new Book("hath er upore Ganja","obama",122);
		Book bo3 = new Book("hath er vitore Ganja","obama",133);
		Book bo4 = new Book("hath er niche Ganja","obama",144);
		Book bo5 = new Book("hath er pashe Ganja","obama",155);
		//bo.showInfo();
		
		
		Book[] bookList = { bo1, bo2, bo3, bo4, bo5};
		Library li = new Library(121,"Naughty",bookList);
		li.showInfo();
		li.dueBalance(9);
		

		
		
		Account ac = new Account(930,1000,"riaz");
		ac.showInfo();
		ac.paylibDue(li);
		
		
		
		
		
		
	
	}
	
	
}
		
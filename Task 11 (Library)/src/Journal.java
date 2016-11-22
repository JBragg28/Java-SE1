public class Journal extends Books
{

	public Journal(String author, int ed, String hd, String tle) 
	
	{
		super.book(author, ed, hd, tle);
		type = typeOfBook.Journal; 
	}
	
}
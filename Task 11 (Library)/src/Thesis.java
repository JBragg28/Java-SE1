public class Thesis extends Books
{

	public Thesis(String author, int ed, String hd, String tle) 
	
	{
		super.book(author, ed, hd, tle);
		type = typeOfBook.Thesis; 
	}
	
}
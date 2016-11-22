public class Novel extends Books
{

	public Novel(String author, int ed, String hd, String tle) 
	
	{
		super.book(author, ed, hd, tle);
		type = typeOfBook.Novel; 
	}
	
}
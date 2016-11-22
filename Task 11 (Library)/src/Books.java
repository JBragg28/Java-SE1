abstract class Books 
implements TypeOfBook

{
	protected Customer nCustomer;
	protected String title;
	protected String author;
	protected int edition;
	protected String hardback; 
	protected typeOfBook type;
	
	public void book(String author, int ed, String hd, String tle)
	{
		
		title = tle;
		this.author = author;
		edition = ed;
		hardback = hd;
		
	}
	
	public void testPrint()
	{
		System.out.println("Type of Book: " + type.toString());
		System.out.println("Title of Book: " + title);
		System.out.println("Author: " + author);
		System.out.println("Edition of Book: " + edition);
		System.out.println("Is it a hardback? " + hardback);
		
	}
	
	
	public typeOfBook getBookType() { return type; } 
	
	public void showBookDetails()
	{
		testPrint();
	}
	
	public void setCustomer(Customer cust)
	{
		nCustomer = cust;
	}
	
	public void removeCustomer()
	{
		nCustomer = null;
	}
	
	public boolean assignedToCustomer()
	{
		if(nCustomer != null)
			return true;
			else return false;
	}
	
	public String customerWhoOrdered()
	{
		return nCustomer.getName();
	}
}

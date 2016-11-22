import java.util.ArrayList;
import java.util.List;


public class Customer
{
	private List<Books> booksCustomerHas = new ArrayList<Books>();
	
	String name; 
	
	public Customer(String newName)
	{
		name = newName;
	}
	
	public void AddingToCustomer(Books item)
	{
		booksCustomerHas.add(item);
	}

public void removingFromCustomer(Books item)
	{
		booksCustomerHas.remove(item);
	}
	
	
	public String getName()
	{
		return name;
	}
	

}

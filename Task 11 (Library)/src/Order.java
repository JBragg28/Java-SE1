
public class Order 
{
	
	private Customer Custs;
	private Books items;
	
	public Order()
	{
		
	}
	
	
	
	public boolean checkOutOrder(Customer Cust, Books item)
	{
		
		
		if(!item.assignedToCustomer())
		{
		item.setCustomer(Cust);
		Custs = Cust;
		items = item;
		Cust.AddingToCustomer(item);
		return true;
		}
		else 
			System.out.println(Cust.getName() + ", A Customer Already Has This Book");
		return false;
	}
	
	public void displayOrder()
	{
		System.out.println(Custs.name + " Has Book: " + items.title);
	}
	
	
	
	

}

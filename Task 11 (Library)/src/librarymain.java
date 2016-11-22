import java.util.ArrayList;
import java.util.List;


public class librarymain
implements TypeOfBook
{
	
			public librarymain()
			{
			
			}
			
			private List<Books> booksInLibrary = new ArrayList<Books>();
			private List<Order> itemsOnOrder = new ArrayList<Order>(); 
 				
					public void displayOrder()
						{
							if(itemsOnOrder.isEmpty())
								{
									System.out.println("There are no currently on books on your order");
								}
							
							for(Order item : itemsOnOrder)
								{
									item.displayOrder();
								}
						}
			
			
			
					public void AddingToLibrary(Books item)
						{
							booksInLibrary.add(item);
						}
			
					public void removingFromLibrary(Books item)
						{
							booksInLibrary.remove(item);
						}
					
					public void addOrder(Customer Cust, Books item)
					{
						
						Order order = new Order();
						if(order.checkOutOrder(Cust, item))
						
						{
							removingFromLibrary(item);
							itemsOnOrder.add(order);
						}
					}
	
}

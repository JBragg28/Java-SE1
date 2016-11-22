
public class main 
{
	public static void main(String[] args)
	{
		Books mBooks  = new Novel ("Bernard Cornwell", 0, "No", "The Last Kingdom");
		Books mBooks1 = new Novel ("Bernard Cornwell", 0, "No", "The Pale Horseman");
		Books mBooks2 = new Novel ("Bernard Cornwell", 0, "No", "The Lords Of The North");
		Books mBooks3 = new Novel ("Bernard Cornwell", 0, "No", "Sword Song");
		Books mBooks4 = new Novel ("Bernard Cornwell", 0, "No", "The Burning Land");
		Books mBooks5 = new Novel ("Bernard Cornwell", 0, "No", "Death Of Kings");
		Books mBooks6 = new Novel ("Bernard Cornwell", 0, "No", "The Pagan Lord");
		Books mBooks7 = new Novel ("Bernard Cornwell", 0, "No", "The Empty Throne");
		Books mBooks8 = new Novel ("Bernard Cornwell", 0, "No", "Warriors Of The Storm");
		Books mBooks9 = new Novel ("Bernard Cornwell", 0, "No", "Flame Bearer");
		Books mBooks10 = new Novel ("Bernard Cornwell", 0, "Yes", "The Last Kingdom");
		Books mBooks11 = new Novel ("Bernard Cornwell", 0, "Yes", "The Pale Horseman");
		Books mBooks12 = new Novel ("Bernard Cornwell", 0, "Yes", "The Lords Of The North");
		Books mBooks13 = new Novel ("Bernard Cornwell", 0, "Yes", "Sword Song");
		Books mBooks14 = new Novel ("Bernard Cornwell", 0, "Yes", "The Burning Land");
		Books mBooks15 = new Novel ("Bernard Cornwell", 0, "Yes", "Death Of Kings");
		Books mBooks16 = new Novel ("Bernard Cornwell", 0, "Yes", "The Pagan Lord");
		Books mBooks17 = new Novel ("Bernard Cornwell", 0, "Yes", "The Empty Throne");
		Books mBooks18 = new Novel ("Bernard Cornwell", 0, "Yes", "Warriors Of The Storm");
		Books mBooks19 = new Novel ("Bernard Cornwell", 0, "Yes", "Flame Bearer");
		Books mBooks20 = new Journal ("Wendell Ricketts", 4, "No", "Fossil News: The Journal of Avocational Paleontology: Vol. 19");
		Books mBooks21 = new Thesis ("Walter James Harvey", 0, "No", "A Notational System For Live Electronic Music: A Thesis");
	
		// mBooks21.testPrint();
	
	Customer Cust = new Customer("Jordan");
	Customer Cust1 = new Customer("Mike");
	librarymain mOrder = new librarymain ();
	mOrder.addOrder(Cust, mBooks18);
	mOrder.addOrder(Cust, mBooks10);
	mOrder.addOrder(Cust1, mBooks19);
	mOrder.displayOrder();
	
	// mOrder.AddOnOrder(mBooks);
	
	
	}
	
}

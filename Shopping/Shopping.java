package Shopping;

public class Shopping {
	//instance variables
	private String itemName;
	private double itemPrice;
	private int itemCount;
	
	//default constructor
	public Shopping() {
		this.itemName = "no name";
		this.itemPrice = 1.0;
		this.itemCount = 0;
	}
	
	//parameterized constructor
	public Shopping(String xName, double xPrice, int xCount) {
		this.setItemName(xName);;
		this.setItemPrice(xPrice);
		this.setItemCount(xCount);;
	}
	//copy constructor
	public Shopping(Shopping sh) {
		this.setItemName(sh.getItemName());
	    this.setItemPrice(sh.getItemPrice());
	    this.setItemCount(sh.getItemCount());
	}
	//accessors
	public String getItemName() {
		return this.itemName;
	}
	/*
	 * Pre-condition:an instance of item price must be available
	 * Post-condition: the instance of item price is returned
	 * @return instance of item price
	 */
	public double getItemPrice() {
		return this.itemPrice;
	}
	public int getItemCount() {
		return this.itemCount;
	}
	//mutators
	public void setItemName(String xName) {
		this.itemName = xName;
	}
	public void setItemPrice(double xPrice) {
		if(xPrice > 0) {
			this.itemPrice = xPrice;
		}
		else {
			this.itemPrice = 1;
		}
	}
	/*
	 * Pre-condition: The count of items must be available
	 * Post-conditon: the instance of count of items is updated
	 */
	public void setItemCount(int xCount) {
		if(xCount > 0) {
			this.itemCount = xCount;
		}
		else {
			this.itemCount = 0;
		}
	}
	//totalCost method
	//method overloading - same method signature but different parameters
	public double totalCost() {
		return this.itemPrice * this.itemCount;
	}
	public double totalCost(double currentPrice) {
		return this.itemCount * currentPrice;
	}
	public double totalCost(double currentPrice, int newCount) {
		return currentPrice * newCount;
	}
	
	//toString
	public String toString() {
		return "Item Name: " + this.itemName + "\nItem Price : $" + this.itemPrice + "\nItem Count:" + this.itemCount;
	}
	public boolean equals(Shopping sh) {
		return sh.getItemName().equalsIgnoreCase(this.itemName) && sh.getItemPrice() == this.itemPrice  && sh.getItemCount() == this.itemCount;
	}
	
	
	
	
	
}

package Shopping;

public class ShoppingDemo {

	public static void main(String[] args) {
		Shopping sh1 = new Shopping();
		
		Shopping sh2 = new Shopping("Chocolates",5, 2);
		Shopping sh3 = new Shopping(sh2);
		System.out.println("sh1: " + sh1.toString());
		System.out.println("sh2: " + sh2.toString());
		System.out.println("sh3: " + sh3.toString());

		System.out.println("Total cost of sh2: $" + sh2.totalCost());
		System.out.println("Total cost of sh2: $" + sh2.totalCost(7));
		System.out.println("Total cost of sh2: $" + sh2.totalCost(7,3));
		
		System.out.println("Are objects sh2 and sh3 equal? " +sh2.equals(sh3));
	}

}

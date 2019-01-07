package Arithmetic;

public class petTester {

	public static void main(String[] args) {
		pet p1 = new pet();
		
		System.out.println(p1.toString());
		//pet p2 = new pet("George",5,"dog");
		pet p2 = new pet("George",5,"dog");
		System.out.println(p2.toString());
		
		p1.setName("Rupert");
		p1.setWeight(9);
		p1.setType("rhinoceros");
		System.out.println(p1.getName());
		System.out.println(p1.toString());
	}

}

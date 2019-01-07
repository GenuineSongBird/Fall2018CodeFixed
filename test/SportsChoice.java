package test;
import java.util.Random;
public class SportsChoice {

	public static final int MAX = 9;
	public static void main(String[] args) {
		//make  random case generator later
		Random r = new Random();
		int choice = r.nextInt(MAX);
		String sportName = "no sport selected";
		switch(choice) 
		{
			//choice value range of 0 to 8
		case 0:
			sportName = "Soccer";
			break;
		case 1:
			sportName = "CS:GO";
			break;
		case 2:
			sportName = "Basketball";
			break;
		case 3:
			sportName = "Squad";
			break;
		case 4:
			sportName = "Football";
			break;
		case 5:
			sportName = "Takistan Life";
			break;
		case 6:
			sportName = "sleep";
			break;
		case 7:
			sportName = "Hockey";
			break;
		case 8:
			sportName = "Ski Board";
			break;
		default:
			sportName = "Error";
			break;
		}	
		System.out.println(sportName);
		}

	}



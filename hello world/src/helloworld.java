import java.util.Random;
import java.util.Scanner;


public class helloworld {
	public static Random rand = new Random();
	public static int n = rand.nextInt(1000000);  
	public static void main(String[] args) {
	 
	
	
	
	System.out.println("Hi, my name's Bob. ");
	System.out.println("What's your name?");
	
	Scanner in = new Scanner(System.in);
	
	in.nextLine();
			
	
	System.out.println(n + " people in the world have that same name.");
	choice();
		
	 
	
}
	
	public static void choice() {
		Scanner in = new Scanner(System.in);
		System.out.println("Are you a doctor, cop, fisherman, busdriver, or student?");	
		switch(in.nextLine()) {
		
//		case "doctor":
//			System.out.println(x);

		 default:
			System.out.println("Okay, you didn't answer my question correctly, lets try again.");
			choice();
			break;
			
		
	}
	
}
}
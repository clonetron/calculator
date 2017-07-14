import java.util.Scanner;

public class helloworld {

	public static void main(String[] args) {
	
	Scanner in = new Scanner(System.in);
	
		int a;
		int b;
		

		System.out.println("You're bad at math");
		
		 a = in.nextInt();
		 b = in.nextInt();
		
		 System.out.println(a+b);
		 
		 int sum;
		 int diff1;
		 int diff2;
		 
		 sum  = (a+b);
		diff1 = ( b-a);
		 diff2 = (a-b);
		
		
		switch(in.nextLine()) {
		
		case "a+b":
			System.out.println (sum);
			break;
			
			
		case "a-b":
			System.out.println(diff2);
			break;
			
		case "b-a":
			System.out.println(diff1);
			break;
		
		default:
			System.out.println("stop trying");
			break;
		}
		
	}
		

}

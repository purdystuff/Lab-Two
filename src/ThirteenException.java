import java.util.Scanner;

public class ThirteenException {

	public static void main(String[] args) throws Exception {
		
		boolean quit = false;
		Scanner scan = new Scanner(System.in);
		
		while(!quit) {
			
			System.out.println("Input a String > "); 
			String input = scan.next();

			System.out.println("That string has " + input.length() + " characters.");
			
			if (input.length() == 13) {
				scan.close();
				throw new Exception("Use thirteen letter words and stainless steel"
						+ "to protect thyself!");				
			}
			
			if (input == "quit") {
				quit = true;
				scan.close();
				break;
				
			}
		}
		


	}

}

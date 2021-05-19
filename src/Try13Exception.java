import java.util.Scanner;

public class Try13Exception {

	public static void main(String[] args) {
		
		boolean quit = false;
		Scanner scan = new Scanner(System.in);
		
		try{ while(!quit) {
			
			System.out.println("Input a String > "); 
			String input = scan.next();
			System.out.println("That string has " + input.length() + " characters.");
			if (input.length() == 13) {
				scan.close();
				throw new Exception();
			}
		}
		} catch (Exception e) {
			System.out.println("Use thirteen letter words and stainless steel" + 
			" to protect thyself!");
		}
	}

}

import java.util.Scanner;

public class Bonus1 {

	public static void main(String[] args) {
		
		//not going to use switch case because can't do range of ints
		String wannaCont;
		do {
			System.out.println("Enter a numerical grade: ");
			Scanner scan = new Scanner(System.in);
			int userNum = scan.nextInt();
			System.out.print("Letter Grade: ");
			if (userNum > 100 || userNum < 0) {
				System.out.println("Out of range.");
			} else if (userNum >= 88) {
				System.out.println("A");
			} else if (userNum >= 80) {
				System.out.println("B");
			} else if (userNum >= 67) {
				System.out.println("C");
			} else if (userNum >= 60) {
				System.out.println("D");
			} else if (userNum >= 0) {
				System.out.println("E");
			}
			System.out.println("Want to enter another score? Enter Y/N: ");
			wannaCont = scan.next();
		} while (wannaCont.equalsIgnoreCase("Y"));
		
		System.out.println("Bye!");
		
	}

}

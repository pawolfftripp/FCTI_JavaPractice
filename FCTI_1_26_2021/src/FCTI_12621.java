import java.util.Scanner;

public class FCTI_12621 {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("This is likely a test");
		int myNum = 20;
		System.out.println(myNum);
		float myFloat = 5.73f;
		char aLetter = 'F';
		boolean aBunchOfBool = true;
		String someText = "This is some text ";
		String conTheCat = someText + myFloat;
		System.out.println(conTheCat);
		int x = 5;
		int y = 6; 
		System.out.println(x + y);
		if (20 > 18) {
			System.out.println("Hey 20 is indeed greater than 18");
		} else if (x < y) {
			System.out.println("X is less than y");
		} else {
			System.out.println("Java is a bit different than what I am used to.");
		}
		userInput.close();
	}

}

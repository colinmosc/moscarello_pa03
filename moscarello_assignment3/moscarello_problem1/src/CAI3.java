import java.security.SecureRandom;
import java.util.Scanner;
public class CAI3 {
	private static Scanner in = new Scanner(System.in);
	private static SecureRandom random = new SecureRandom();
	private static int num1, num2;
	private static int numRight = 0;
	
	public static void main(String[] args) {
		quiz();
	}
	
	public static void quiz() {
		int i = 0;
		String yesNo;
		while (i < 10) {
		num1 = random.nextInt(10);
		num2 = random.nextInt(10);
		i++;
		askQuestion(num1, num2);
		int answer = readResponse();
		isAnswerCorrect(answer, num1, num2);
		}
		displayCompletionMessage();
		System.out.println("Would you like to solve a new problem set? (yes or no)");
		yesNo = in.nextLine();
		yesNo = in.nextLine();
		if (yesNo.equals("yes")) {
			quiz();
		}
	}
	
	static void askQuestion(int num1, int num2) {
		System.out.println("How much is " + num1 + " times " + num2 + " ?");
	}
	
	static int readResponse() {
		int response = in.nextInt();
		return response;
	}
	
	static void isAnswerCorrect(int answer, int num1, int num2) {
		if (answer == num1 * num2) {
			displayCorrectResponse();
		}
		else {
			displayIncorrectResponse();
		}
	}
	
	static void displayCorrectResponse() {
		int num;
		num = random.nextInt(4);
		switch (num) {
			case 0 : System.out.println("Very good!");
			break;
			case 1 : System.out.println("Excellent!");
			break;
			case 2 : System.out.println("Nice work!");
			break;
			case 3 : System.out.println("Keep up the good work!");
			break;
		}
		numRight++;
	}
	
	static void displayIncorrectResponse() {
		int num;
		num = random.nextInt(4);
		switch (num) {
			case 0 : System.out.println("Incorrect.");
			break;
			case 1 : System.out.println("Wrong, but nice try!");
			break;
			case 2 : System.out.println("Don't give up!");
			break;
			case 3 : System.out.println("Better luck next time!");
			break;
		}
	}
	
	static void displayCompletionMessage() {
		double score = ((double)numRight / 10) * 100;
		System.out.println("Your score is " + score + ".");
		if (numRight < 8) {
			System.out.println("Please ask your teacher for extra help.");
		}
		else {
			System.out.println("Congratulations! You are ready to go to the next level.");
		}
	}
}
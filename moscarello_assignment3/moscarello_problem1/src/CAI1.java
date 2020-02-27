import java.security.SecureRandom;
import java.util.Scanner;
public class CAI1 {
	private static Scanner in = new Scanner(System.in);
	private static int num1, num2;
	
	public static void main(String[] args) {
		SecureRandom random = new SecureRandom();
		num1 = random.nextInt(10);
		num2 = random.nextInt(10);
		quiz();
	}
	
	public static void quiz() {
		askQuestion(num1, num2);
		int answer = readResponse();
		isAnswerCorrect(answer, num1, num2);
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
		System.out.println("Very good!");
	}
	
	static void displayIncorrectResponse() {
		System.out.println("No. Please try again.");
		quiz();
		
	}
}

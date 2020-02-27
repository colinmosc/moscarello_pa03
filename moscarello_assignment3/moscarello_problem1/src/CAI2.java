import java.security.SecureRandom;
import java.util.Scanner;
public class CAI2 {
	private static Scanner in = new Scanner(System.in);
	private static SecureRandom random = new SecureRandom();
	private static int num1, num2;
	
	public static void main(String[] args) {
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
	}
	
	static void displayIncorrectResponse() {
		int num;
		num = random.nextInt(4);
		switch (num) {
			case 0 : System.out.println("No. Please try again.");
			break;
			case 1 : System.out.println("Wrong. Try once more.");
			break;
			case 2 : System.out.println("Don't give up!");
			break;
			case 3 : System.out.println("No. Keep trying.");
			break;
		}
		quiz();
	}
}
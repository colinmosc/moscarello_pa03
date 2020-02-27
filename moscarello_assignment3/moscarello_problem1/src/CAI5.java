import java.security.SecureRandom;
import java.util.Scanner;
public class CAI5 {
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
		int difficulty = readDifficulty();
		int pType = readProblemType();
		if (pType == 5) {
			pType = random.nextInt(4);
		}
		while (i < 10) {
		generateQuestionArgument(difficulty);
		i++;
		askQuestion(num1, num2, pType);
		double answer = readResponse();
		isAnswerCorrect(answer, num1, num2, pType);
		}
		displayCompletionMessage();
		System.out.println("Would you like to solve a new problem set? (yes or no)");
		yesNo = in.nextLine();
		yesNo = in.nextLine();
		if (yesNo.equals("yes")) {
			quiz();
		}
	}
	
	static void askQuestion(int num1, int num2, int pType) {
		switch (pType) {
			case 1: System.out.println("How much is " + num1 + " plus " + num2 + " ?");
				break;
			case 2: System.out.println("How much is " + num1 + " times " + num2 + " ?");
				break;
			case 3: System.out.println("How much is " + num1 + " minus " + num2 + " ?");
				break;
			case 4: System.out.println("How much is " + num1 + " divided by " + num2 + " rounded to the nearest whole number?");
				break;
		}
	}
	
	static double readResponse() {
		double response = in.nextDouble();
		return response;
	}
	
	static void isAnswerCorrect(double answer, int num1, int num2, int pType) {
		switch (pType) {
			case 1: if (answer == num1 + num2) {
						displayCorrectResponse();
					}
				break;
			case 2: if (answer == num1 * num2) {
						displayCorrectResponse();
					}
				break;
			case 3: if (answer == num1 - num2) {
						displayCorrectResponse();
					}
				break;
			case 4: if (answer == Math.round((double)num1 / (double)num2)) {
						displayCorrectResponse();
					}
				break;
			default: displayIncorrectResponse();
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
	
	static int readDifficulty() {
		int difficulty;
		System.out.println("Please enter a difficulty level. (1-4)");
		difficulty = in.nextInt();
		return difficulty;
	}
	
	static void generateQuestionArgument(int difficulty) {
		switch (difficulty) {
		case 1: num1 = random.nextInt(10);
				num2 = random.nextInt(10);
			break;
		case 2: num1 = random.nextInt(100);
				num2 = random.nextInt(100);
			break;
		case 3: num1 = random.nextInt(1000);
				num2 = random.nextInt(1000);
			break;
		case 4: num1 = random.nextInt(10000);
				num2 = random.nextInt(10000);
			break;
	}
	}
	
	static int readProblemType() {
		int pType;
		System.out.println("Please enter the type of problem you want.");
		System.out.println("1 = +, 2 = *, 3 = -, 4 = /, 5 = random");
		pType = in.nextInt();
		return pType;
	}
}
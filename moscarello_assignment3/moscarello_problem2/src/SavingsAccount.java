
public class SavingsAccount {

	private static float annualInterestRate;
	private float savingsBalance;

	public SavingsAccount(float balance) {
		savingsBalance = balance;
	}
	
	public float getSB() {
		return savingsBalance;
	}
	
	public float calculateMonthlyInterest() {
		return ((savingsBalance * annualInterestRate) / 12);
	}
	
	public static void modifyInterestRate(float newRate) {
		annualInterestRate = newRate / 100;
	}
}

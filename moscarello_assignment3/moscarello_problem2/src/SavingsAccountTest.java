
public class SavingsAccountTest {
	
	public static void main(String[] args) {
		int[] months = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
		int i = 0;
		float saveTemp = 0, saveTemp2 = 0;
		SavingsAccount saver1 = new SavingsAccount(2000);
		SavingsAccount saver2 = new SavingsAccount(3000);
		SavingsAccount.modifyInterestRate(4);
		for (i = 0; i < 12; i++) {
		System.out.printf("Saver 1's month %d balance with 4%% interest rate: %.2f\n", months[i], saver1.getSB() + (saver1.calculateMonthlyInterest() * months[i]));
		saveTemp = saver1.calculateMonthlyInterest() * months[i];
		}
		System.out.println();
		for (i = 0; i < 12; i++) {
		System.out.printf("Saver 2's month %d balance with 4%% interest rate: %.2f\n", months[i], saver2.getSB() + (saver2.calculateMonthlyInterest() * months[i]));
		saveTemp2 = saver2.calculateMonthlyInterest() * months[i];
		}
		System.out.println();
		SavingsAccount.modifyInterestRate(5);
		for (i = 0; i < 12; i++) {
		System.out.printf("Saver 1's month %d balance with 5%% interest rate: %.2f\n", months[i], (saver1.getSB() + saveTemp) + (saver1.calculateMonthlyInterest() * months[i]));
		}
		System.out.println();
		for (i = 0; i < 12; i++) {
		System.out.printf("Saver 2's month %d balance with 5%% interest rate: %.2f\n", months[i], (saver2.getSB() + saveTemp2) + (saver2.calculateMonthlyInterest() * months[i]));
		}
	}
}
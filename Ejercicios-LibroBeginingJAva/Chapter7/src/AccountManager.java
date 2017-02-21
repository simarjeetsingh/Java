import java.math.BigDecimal;

public class AccountManager {

	public static void main(String[] args) {
		Account myAccount = new Account("FirstAccount", "10.00");
		System.out.println("Account Created: " + myAccount.getName());
		System.out.println("Balance: " + myAccount.getAmount());

		try {
			myAccount.withdraw("20.00");
		} catch (IllegalArgumentException e) {
			System.out.println("Invalid Withdrawal");
		} finally {
			System.out.println("New Balance: " + myAccount.getAmount());
		}
	}

}

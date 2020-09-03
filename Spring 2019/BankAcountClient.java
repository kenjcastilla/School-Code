/*Kendall Castilla
 * 8 February 2019
 * BankAccount main method that executes methods and constructors from BankAccount class.
 */
package lab4;

public class BankAcountClient {
	public static void main(String[] args) {
		BankAccount B1 = new BankAccount("B1", 900);
		
		B1.deposit(500);
		System.out.println(B1.toString());
		B1.withdraw(300);
		System.out.println(B1.toString());
		
		BankAccount B2 = new BankAccount();
		System.out.println(B2.toString());
		B2.setName("B2");
		B2.setBalance(40);
		System.out.println(B2.toString());
	}

}

/*Kendall Castilla
 * 8 February 2019
 * BankAccount class w/ constructors and methods which implement name and balance fields.
 */
package lab4;

public class BankAccount {
	private String name;
	private double balance;
	
	public BankAccount () {
		this.name = "No Name";
		this.balance = 0;
		
	}
	public BankAccount (String n, double b) {
		this.name = n;
		this.balance = b;
		
	}
	public void setName(String n) {
		this.name = n;
		
	}
	public String getName() {
		return this.name;
		
	}
	public void setBalance(double b) {
		this.balance = b;
		
	}
	public double getBalance() {
		return this.balance;
		
	}
	public void deposit(double amount) {
		this.balance += amount;
		
	}
	public void withdraw(double amount) {
		this.balance -= amount;
		
	}
	public String toString() {
		return getName() + ", $" + getBalance();
	}
}

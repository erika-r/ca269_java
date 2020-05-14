
public class BankAccount
{
	double balance;

	public BankAccount(double money)
	{
		balance += money;
	}

	public BankAccount()
	{
		balance = 100;
	}

	public void withdraw(double n)
	{
		this.balance -= n;
	}

	public void deposit(double amount)
	{
		this.balance += amount;
	}

	public void setBalance(double amount)
	{
		this.balance = amount;
	}

	public double getBalance()
	{
		return this.balance;
	}

	public String toString()
	{
		return "The balance is " + this.balance;
	}
}
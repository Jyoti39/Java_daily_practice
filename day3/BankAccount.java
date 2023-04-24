package WileyProject;

public class BankAccount {
	private int accountNumber;
	private double balance;
	private String customerName;
	public int getAccountNumber() {
		return accountNumber;
	}


	public double getBalance() {
		return balance;
	}


	public String getCustomerName() {
		return customerName;
	}

	
 public void deposite(double amount) {
	 balance+=amount;
 }
  public void withdraw(double amount) {
	  if(amount<=balance)
	  {
		  balance-=amount;
	  }
	  else {
		  System.out.println("Insufficient funds");
	  }
  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

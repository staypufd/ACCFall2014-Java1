package edu.austincc.bank;

public class BankAccount  {
	String bankName;
	long accountBalance;
	long accountNumber;
	
	
	
	/**
	 * @param bankName
	 * @param accountBalance
	 * @param accountNumber
	 */
	public BankAccount(String bankName, long accountBalance, long accountNumber) {
		super();
		this.bankName = bankName;
		this.accountBalance = accountBalance;
		this.accountNumber = accountNumber;
	}
	
	/**
	 * @return the bankName
	 */
	public String getBankName() {
		return bankName;
	}
	/**
	 * @param bankName the bankName to set
	 */
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	/**
	 * @return the accountBalance
	 */
	public long getAccountBalance() {
		return accountBalance;
	}
	/**
	 * @param accountBalance the accountBalance to set
	 */
	public void setAccountBalance(long accountBalance) {
		this.accountBalance = accountBalance;
	}
	/**
	 * @return the accountNumber
	 */
	public long getAccountNumber() {
		return accountNumber;
	}
	/**
	 * @param accountNumber the accountNumber to set
	 */
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "BankAccount [bankName=" + bankName + ", accountBalance="
				+ accountBalance + ", accountNumber=" + accountNumber + "]";
	}


	public String describe() {
		StringBuilder sb =  new StringBuilder();
		sb.append(this.getBankName()).append(" ")
		.append(this.getAccountNumber()).append(" ")
		.append(this.getAccountBalance());
		
		return sb.toString();
	}
	
	
}

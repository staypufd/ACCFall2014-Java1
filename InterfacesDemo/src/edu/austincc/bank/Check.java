package edu.austincc.bank;

public class Check implements Describale, Comparable<IOU> {
	private String name;
	private long accountNumber;
	private String bankName;
	private int amount;
	
	
	
	/**
	 * @param name
	 * @param accountNumber
	 * @param bankName
	 * @param amount
	 */
	public Check(String name, long accountNumber, String bankName, int amount) {
		super();
		this.name = name;
		this.accountNumber = accountNumber;
		this.bankName = bankName;
		this.amount = amount;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
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
	 * @return the amount
	 */
	public int getAmount() {
		return amount;
	}
	/**
	 * @param amount the amount to set
	 */
	public void setAmount(int amount) {
		this.amount = amount;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Check [name=" + name + ", accountNumber=" + accountNumber
				+ ", bankName=" + bankName + "]";
	}


	public String describe() {
		
		StringBuilder sb = new StringBuilder(this.getName()).append(" ").append(this.getAmount());
		
		return sb.toString();
	}
	
	@Override
	public int compareTo(IOU arg0) {
		
		int returnValue = 0;
		
		if (this.amount == arg0.getAmount()) {
			returnValue = 0;
		} 
		if (this.amount < arg0.getAmount()) {
			returnValue = -1;
		} 
		if (this.amount > arg0.getAmount()) {
			returnValue =  1;
		} 
		
		return returnValue;
	}
	
}

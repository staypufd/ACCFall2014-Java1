package edu.austincc.bank;

public class IOU implements Describale, Comparable<Check> {
	String whoOwed;
	long amount;
	/**
	 * @param whoOwed
	 * @param amount
	 */
	public IOU(String whoOwed, long amount) {
		super();
		this.whoOwed = whoOwed;
		this.amount = amount;
	}
	/**
	 * @return the whoOwed
	 */
	public String getWhoOwed() {
		return whoOwed;
	}
	/**
	 * @param whoOwed the whoOwed to set
	 */
	public void setWhoOwed(String whoOwed) {
		this.whoOwed = whoOwed;
	}
	/**
	 * @return the amount
	 */
	public long getAmount() {
		return amount;
	}
	/**
	 * @param amount the amount to set
	 */
	public void setAmount(long amount) {
		this.amount = amount;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "IOU [whoOwed=" + whoOwed + ", amount=" + amount + "]";
	}
	@Override
	public String describe() {
		return "Yeah right! Like your getting it back!";
	}
	@Override
	public int compareTo(Check arg0) {
		
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

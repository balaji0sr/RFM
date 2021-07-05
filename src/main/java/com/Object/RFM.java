//$Id$
package com.Object;

import java.util.Date;

public class RFM {

	private Date lastdate;
	private int totalDeals;
	private double totalAmount;
	
	public void fixLastdate(Date lastdate) {
		this.lastdate = lastdate;
	}
	
	public void increaseDealCount() {
		int oldDeals = this.totalDeals;
		this.totalDeals = oldDeals + 1;
	}
	
	public void addAmount(double currentAmount) {
		double oldAmount = this.totalAmount;
		this.totalAmount = oldAmount + currentAmount;
	}
	
	
	
	public Date getLastdate() {
		return lastdate;
	}
	public void setLastdate(Date lastdate) {
		this.lastdate = lastdate;
	}
	public int getTotalDeals() {
		return totalDeals;
	}
	public void setTotalDeals(int totalDeals) {
		this.totalDeals = totalDeals;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}		
}

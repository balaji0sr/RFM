//$Id$
package com.Object;

import java.util.Date;

public class Deals {
	private long ID;
	private String Name;
	private String AccountName;
	private Date Date;
	private Double Amount;

	public long getID() {
		return ID;
	}

	public void setID(long iD) {
		ID = iD;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getAccountName() {
		return AccountName;
	}

	public void setAccountName(String accountName) {
		AccountName = accountName;
	}

	// public long getDate() {
	// return Date;
	// }
	//
	// public void setDate(long date) {
	// Date = date;
	// }

	public Date getDate() {
		return Date;
	}

	public void setDate(Date date) {
		Date = date;
	}

	public Double getAmount() {
		return Amount;
	}

	public void setAmount(Double amount) {
		Amount = amount;
	}

}

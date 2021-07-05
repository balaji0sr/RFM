//$Id$
package com.Object;

public class RMFScores {
	
	private long  ID;
	private String Name;
	private int RecencyScore;
	private int FrequencyScore;
	private int MonetaryScore;
	
	
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
	public int getRecencyScore() {
		return RecencyScore;
	}
	public void setRecencyScore(int recencyScore) {
		RecencyScore = recencyScore;
	}
	public int getFrequencyScore() {
		return FrequencyScore;
	}
	public void setFrequencyScore(int frequencyScore) {
		FrequencyScore = frequencyScore;
	}
	public int getMonetaryScore() {
		return MonetaryScore;
	}
	public void setMonetaryScore(int monetaryScore) {
		MonetaryScore = monetaryScore;
	}
}

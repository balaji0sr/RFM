package com.RFM;

public class App {
	public static void main(String[] args) {
		try {
			CalculateRFMScores.calculateRMFScores();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

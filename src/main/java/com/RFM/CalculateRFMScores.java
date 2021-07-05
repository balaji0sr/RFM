//$Id$
package com.RFM;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.parser.ParseException;

import com.Object.Accounts;
import com.Object.Deals;
import com.Object.RFM;

import com.Service.JsonArray;
import com.Service.JsonArrayToArrayList;
import com.opencsv.CSVWriter;

public class CalculateRFMScores {
	static ArrayList<Accounts> accountslist;
	static ArrayList<Deals> dealslist;

	public static void calculateRMFScores() throws IOException, ParseException, java.text.ParseException {

		JSONArray accountsJSONArr = JsonArray.getJsonArray("Accounts");
		accountslist = JsonArrayToArrayList.getAccountsList(accountsJSONArr);

		JSONArray dealsJSONArr = JsonArray.getJsonArray("Deals");
		dealslist = JsonArrayToArrayList.getDealsList(dealsJSONArr);

		createRMFScoreList();
	}

	public static int getRecencyScore() {
		int recencyScore = 0;

		return recencyScore;
	}

	public static int getMonetaryScore() {
		int monetaryScore = 0;

		return monetaryScore;
	}

	public static int getFrequencyScore() {
		int frequencyScore = 0;

		return frequencyScore;
	}

	public static void createRMFScoreList() {

		// int accountListSize = accountslist.size();
		// int Accountstarting =
		//
		// Date[] lastDate = new Date[accountListSize];
		// double[] totalDeals = new double[accountListSize];
		// double[] totalAmount = new double[accountListSize];

		HashMap<String, RFM> map = new HashMap<>();

		for (Deals d : dealslist) {

			String accountName = d.getAccountName();
			RFM rfm = map.get(accountName);

			if (map.containsKey(accountName)) {
				rfm.fixLastdate(d.getDate());
				rfm.increaseDealCount();
				rfm.addAmount(d.getAmount());
			} else {
				rfm.setLastdate(d.getDate());
				rfm.setTotalDeals(1);
				rfm.setTotalAmount(d.getAmount());
			}

			// RMFScores RMFScore = new RMFScores();
			// RMFScore.setID(accountslist.get(i).getID());
			// RMFScore.setName(accountslist.get(i).getName());
			// RMFScore.setRecencyScore(i);
			// RMFScore.setMonetaryScore(i);
			// RMFScore.setFrequencyScore(i);
			createCSVFile(map);
		}
	}

	public static void createCSVFile(HashMap<String, RFM> map) throws IOException {
		String fileName = "";
		String filePath = "" + fileName + ".csv";

		CSVWriter writer = new CSVWriter(new FileWriter(filePath));

		for (Accounts var : accountslist) {

		}

		String line1[] = { "id", "name", "salary", "start_date", "dept" };
		String line2[] = { "1", "Krishna", "2548", "2012-01-01", "IT" };
		String line3[] = { "2", "Vishnu", "4522", "2013-02-26", "Operations" };
		String line4[] = { "3", "Raja", "3021", "2016-10-10", "HR" };
		String line5[] = { "4", "Raghav", "6988", "2012-01-01", "IT" };
		// Instantiating the List Object
		List list = new ArrayList();
		list.add(line1);
		list.add(line2);
		list.add(line3);
		list.add(line4);
		list.add(line5);
		// Writing data to the csv file
		writer.writeAll(list);
		writer.flush();
		System.out.println("Data entered");

	}
}

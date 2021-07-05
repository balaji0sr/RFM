//$Id$
package com.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.Object.Accounts;
import com.Object.Deals;

public class JsonArrayToArrayList {

	public static ArrayList<Accounts> getAccountsList(JSONArray accountsJSONArr) {
		ArrayList<Accounts> accountslist = new ArrayList<Accounts>();

		for (int i = 0; i < accountsJSONArr.size(); i++) {
			JSONObject jsonObject = (JSONObject) accountsJSONArr.get(i);

			Accounts account = new Accounts();
			account.setName((String) jsonObject.get("name"));
			account.setID((long) jsonObject.get("id"));
			
			accountslist.add(account);
		}
		return accountslist;
	}

	public static ArrayList<Deals> getDealsList(JSONArray DealsJSONArr) throws ParseException {
		ArrayList<Deals> dealslist = new ArrayList<Deals>();

		for (int i = 0; i < DealsJSONArr.size(); i++) {
			JSONObject jsonObject = (JSONObject) DealsJSONArr.get(i);

			Deals deal = new Deals();
			deal.setAccountName((String) jsonObject.get("AccntName"));
			deal.setAmount((Double) jsonObject.get("amt"));

			String datestr = (String) jsonObject.get("date");
			Date date = new SimpleDateFormat("dd/MM/yyyy").parse(datestr);
			deal.setDate(date);

			deal.setID((long) jsonObject.get("id"));
			deal.setName((String) jsonObject.get("name"));
			
			dealslist.add(deal);
		}
		return dealslist;
	}
}

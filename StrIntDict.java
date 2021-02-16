package online.javalearn.calculator.ivanlapshov;

import java.util.HashMap;
import java.util.Map;

public class StrIntDict {
	
	 String number;

	public StrIntDict(String number) {
		super();
		this.number = number;
	}
	
	public int strToNumber() {
		
		
		String upCaseStr = number.toUpperCase();

		Map<String, Integer> strArab = new HashMap<String, Integer>();

		
		strArab.put("I", 1); 
		strArab.put("II", 2);
		strArab.put("III", 3);
		strArab.put("IV", 4);
		strArab.put("V", 5);
		strArab.put("VI", 6);
		strArab.put("VII", 7);
		strArab.put("VIII", 8);
		strArab.put("IX", 9);
		strArab.put("X", 10);
		strArab.put("0", 0);
		strArab.put("1", 1);
		strArab.put("2", 2);
		strArab.put("3", 3);
		strArab.put("4", 4);
		strArab.put("5", 5);
		strArab.put("6", 6);
		strArab.put("7", 7);
		strArab.put("8", 8);
		strArab.put("9", 9);
		strArab.put("10", 10);

		return  strArab.get(upCaseStr); // полученине элемента по ключу
				
	}

}
package online.javalearn.calculator.ivanlapshov;

import java.util.ArrayList;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scaner = new Scanner(System.in);
		System.out.print("Enter a number (arab 0 - 10, or roman I - X) separated by a space,\n an arithmetic sign and a number: ");
		String str = scaner.nextLine();

		ArrayList<String> intCollection = new ArrayList<String>();

		for (String retval : str.split(" ")) {
			intCollection.add(retval);
		}

		StrIntDict xxx = new StrIntDict(intCollection.get(0));
		// xxx.strToNumber();

		StrIntDict yyy = new StrIntDict(intCollection.get(2));
		// yyy.strToNumber();
		
		
		char[] strToArrayX = intCollection.get(0).toCharArray(); // Преобразуем строку 1 в массив символов (char)
		char[] strToArrayY = intCollection.get(2).toCharArray(); // Преобразуем строку 2 в массив символов (char)
		
		if (Character.isDigit(strToArrayX[0]) && Character.isDigit(strToArrayY[0])) {
			
			Estimation outcome = new Estimation(xxx.strToNumber(), yyy.strToNumber(), intCollection.get(1));
			System.out.println(outcome.computation());
		
		} else if (Character.isLetter(strToArrayX[0]) && Character.isLetter(strToArrayY[0])) {
			
			Estimation outcome = new Estimation(xxx.strToNumber(), yyy.strToNumber(), intCollection.get(1));
			System.out.println(ArabToRomNumeral.RomanNumerals(outcome.computation()));
			//System.out.println(outcome.computation());
			
		}
		
		
		//System.out.println(strToArrayX[0]); 
		//System.out.println(strToArrayY[0]); 
		
		//System.out.println(Character.isDigit(strToArrayX[0]));

		
	}

}
package ScannerClass;

import java.util.Scanner;

public class LongestWord {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the sentence you want to check for the longest word!!");
		String inputString = scanner.nextLine();
		
		
		
		int longestWordLength = 0;
		String longestWord="";
		String[] wordsArray = inputString.split(" ");
		
		for(String word : wordsArray) {
			if(word.length() > longestWordLength) {
				    longestWordLength = word.length();
					longestWord = word;
			} 
		}
		System.out.println("The longest word in the sentence was "+longestWord+", and its length is "+longestWordLength);
	    scanner.close();
	    }
}

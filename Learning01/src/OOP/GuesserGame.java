package OOP;

import java.util.Scanner;

class Guesser {
	
	int guessNum;
	
	int guessedNumber() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Guess the Number between 0 to 9");
		guessNum = scan.nextInt();
		return guessNum;
	}
	
}


class Umpire {
	
}

class Player {
	
}





public class GuesserGame {

	public static void main(String[] args) {
		
    int []ar = new int[4];
    System.out.println(ar.length);
    ar[4] = 3;
    System.out.println(ar[4]);
	}

}

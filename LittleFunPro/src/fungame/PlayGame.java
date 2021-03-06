package fungame;

import java.util.ArrayList;
import java.util.Scanner;

public class PlayGame {

	public static ArrayList<String> gestures = new ArrayList<String>();

	// initial all the gestures
	public PlayGame() {
		gestures.add("Scissors");
		gestures.add("Paper");
		gestures.add("Rock");
		gestures.add("Lizard");
		gestures.add("Spock");

	}

	// return the gesture input by the user
	public String getUGest() {

		String input = null;
		System.out
				.println("Welcome to the Rock-paper-scissors-lizard-Spock Game!");
		System.out
				.println("You can choose the following five gestures: Scissors,Paper,Rock,Lizard,Spock");
		System.out.println("please enter your gestures");

		Scanner scan = new Scanner(System.in);
		input = scan.next();
		while (!gestures.contains(input)) {

			System.out.println("Opps! Please input the right gesture");
			System.out.println();
			Scanner scan_ = new Scanner(System.in);
			input = scan_.next();
		}
		System.out.println("user chooses " + input);
		return input;

	}

	// return the gesture generated by program
	public String getPGest() {
		String pGest = null;
		int num = (int) (Math.random() * 5);
		pGest = gestures.get(num);
		System.out.println("program chooses " + pGest);
		return pGest;

	}

	// compare the gestures from user and program and output result based on
	// game regulations
	public void compete(String UGest, String PGest) {

		int indexOfUGest = gestures.indexOf(UGest);
		int indexOfPGest = gestures.indexOf(PGest);
		int diff = indexOfUGest - indexOfPGest;

		if (diff > 0) {
			if (diff % 2 == 0)
				System.out.println("you win!");
			else
				System.out.println("program wins!");
		} else if (diff < 0) {

			if (diff % 2 == 0)
				System.out.println("program wins!");
			else
				System.out.println("you win!");
		}

		else
			System.out.println("there is an even");

	}

	// Trigger the game and ask the user whether to continue playing or not.
	public void go() {
		boolean flag = true;
		while (flag) {
			compete(getUGest(), getPGest());
			System.out.println("Play Again? Yes/No");
			Scanner scan = new Scanner(System.in);
			String yesOrNo = scan.next();
			if (yesOrNo.equals("Yes")) {
				flag = true;
			} else if (yesOrNo.equals("No")) {
				flag = false;
				System.out.println("Thanks for playing the game!");
			}
		}
	}

	public static void main(String[] args) {

		PlayGame play = new PlayGame();
		play.go();
	}

}

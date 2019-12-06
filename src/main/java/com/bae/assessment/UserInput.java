package com.bae.assessment;

import java.util.Scanner;

public class UserInput {

	@SuppressWarnings("resource")
	public static void start() {

		boolean notFinished = true;

		do {

			Scanner sc = new Scanner(System.in);
			String ans;
			System.out.println("Which way do wish to go: ");
			ans = sc.next();

			// if (ans.equals("north")) {
			// Direction.north();
			notFinished = checkIfWon(sc.nextLine());

			if (sc.equals("north")) {
				move(Compass.NORTH);
			} else if (sc.equals("east")) {
				move(Compass.EAST);
			} else if (sc.equals("south")) {
				move(Compass.SOUTH);
			} else if (sc.equals("west")) {
				move(Compass.WEST);
			}
			return;
			
		} while (notFinished);
	}

	private static void move(Compass direction) {
		// depending on direction find the closest poi
	}

	private static boolean checkIfWon(String nextLine) {
		// if user pos = winning pos break out loop
		return false;
	}
}

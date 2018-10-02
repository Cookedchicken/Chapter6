package practice;

import java.util.Scanner; 

public class TestScoreStatistics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int high = 0;
		int low = 100;
		int avg = 0;
		int count = 0;
		int userChoice;
		int count = 0;
		int total = 0;
		int userExit = 0;
		
		do {
		
		System.out.print("You are about to take a test , please have matrials , read and answer your question carefully");
		System.out.print("Enter a number to exit enter 999 >>>");
		userChoice = input.nextInt();
		if(userChoice > high) {
			high = userChoice;
					count = count + 1;
		
		}
		else if(userChoice < low) {
			
		}
			low = userChoice;
			count = count + 1;
			{
		else if (userChoice > 100 || userChoice < 0) {
			
		}
		System.out.print("Out of range");
		total = total + userChoice;
		avg = total/ count;
		
		System.out.print("Enter a number to exit 999 or another number to continue >>>");
		userExit = input.nextInt();
		while(userExit != 999);
	
		
		
		
		
		
		}

		}

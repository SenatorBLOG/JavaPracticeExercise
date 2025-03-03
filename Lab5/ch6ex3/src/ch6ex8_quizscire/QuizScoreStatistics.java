package ch6ex8_quizscire;

import java.util.Scanner;

public class QuizScoreStatistics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int count =0;
			int sum =0;
			int maxValue =0;
			int minValue =10;
		
		while(true) {
			System.out.println("Enter student quiz score.");
			int score = scanner.nextInt();
			
			if(score == 99) {
				System.out.println("You exit program.");
				break;
			}
			if(score < 0 || score >10) {
				System.out.println("Score is too low.");
				
			}else {
			count++;
			sum +=score;
			
			if (score < minValue) {
				minValue = score;
			}
			if(score> maxValue) {
				maxValue=score;
			}}
			
		}
		if (count == 0) {
            System.out.println("No valid scores were entered.");
        } else {
            double average = (double) sum / count;
            System.out.println("\nStatistics:");
            System.out.println("Number of scores entered: " + count);
            System.out.println("Highest score: " + maxValue);
            System.out.println("Lowest score: " + minValue);
            System.out.printf("Arithmetic average: %.2f\n", average);
		
		
	}

	}}

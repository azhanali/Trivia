package project1;

import java.util.Scanner;

public class MenuClass {
	public void front(int option){
	
	int i=0,k=0;
	Scanner amn = new Scanner(System.in);
	int score = 0;
	
	//do {
		switch(option) {
		case 1 : 
			
			score = 0;
			for (int l = 0; l < Artcategory.artQuestionPointer; l++) {
				System.out.println(Artcategory.artQuestions[l][0]);
				System.out.println(Artcategory.artQuestions[l][1]);
				System.out.println(Artcategory.artQuestions[l][2]);
				System.out.println(Artcategory.artQuestions[l][3]);
				System.out.println(Artcategory.artQuestions[l][4]);
				System.out.println("Please enter your choice");
				String selection = amn.nextLine();
				if (selection.trim().equals(Artcategory.artQuestions[l][5])) {
					score++;
					System.out.println("Correct");
				} else {
					System.out.println("Incorrect! Correct option is " + Artcategory.artQuestions[l][5]);
				}
			}
			int val = score * 100;
			MainClass.result[MainClass.resultPointer][0] = "Art";
			MainClass.result[MainClass.resultPointer][1] = "" + (val/10);
			MainClass.resultPointer++;
			break;
				                  

		case 2 : 
			
			score = 0;
			for (int l = 0; l < FoodCategory.foodQuestionPointer; l++) {
				System.out.println(FoodCategory.foodQuestions[l][0]);
				System.out.println(FoodCategory.foodQuestions[l][1]);
				System.out.println(FoodCategory.foodQuestions[l][2]);
				System.out.println(FoodCategory.foodQuestions[l][3]);
				System.out.println(FoodCategory.foodQuestions[l][4]);
				System.out.println("Please enter your choice");
				String selection = amn.nextLine();
				if (selection.trim().equals(FoodCategory.foodQuestions[l][5])) {
					score++;
					System.out.println("Correct");
				} else {
					System.out.println("Incorrect! Correct option is " + FoodCategory.foodQuestions[l][5]);
				}
			}
			int val1 = score * 100;
			MainClass.result[MainClass.resultPointer][0] = "Food";
			MainClass.result[MainClass.resultPointer][1] = "" + (val1/10);
			MainClass.resultPointer++;
			System.out.println("Your correct answers are "+ score);
			break;
			
		case 3 : 
			
			score = 0;
			for (int l = 0; l < HistoryCategory.historyQuestionPointer; l++) {
				System.out.println(HistoryCategory.historyQuestions[l][0]);
				System.out.println(HistoryCategory.historyQuestions[l][1]);
				System.out.println(HistoryCategory.historyQuestions[l][2]);
				System.out.println(HistoryCategory.historyQuestions[l][3]);
				System.out.println(HistoryCategory.historyQuestions[l][4]);
				System.out.println("Please enter your choice");
				String selection = amn.nextLine();
				if (selection.trim().equals(HistoryCategory.historyQuestions[l][5])) {
					score++;
					System.out.println("Correct");
				} else {
					System.out.println("Incorrect! Correct option is " + HistoryCategory.historyQuestions[l][5]);
				}
			}
			int val2 = score * 100;
			MainClass.result[MainClass.resultPointer][0] = "History";
			MainClass.result[MainClass.resultPointer][1] = "" + (val2/10);
			MainClass.resultPointer++;
			break;
		
		case 4 : 
			
			score = 0;
			for (int l = 0; l < Javacategory.javaQuestionPointer; l++) {
				System.out.println(Javacategory.javaQuestions[l][0]);
				System.out.println(Javacategory.javaQuestions[l][1]);
				System.out.println(Javacategory.javaQuestions[l][2]);
				System.out.println(Javacategory.javaQuestions[l][3]);
				System.out.println(Javacategory.javaQuestions[l][4]);
				System.out.println("Please enter your choice");
				String selection = amn.nextLine();
				if (selection.trim().equals(Javacategory.javaQuestions[l][5])) {
					score++;
					System.out.println("Correct");
				} else {
					System.out.println("Incorrect! Correct option is " + Javacategory.javaQuestions[l][5]);
				}
			}
			int val3 = score * 100;
			MainClass.result[MainClass.resultPointer][0] = "Java";
			MainClass.result[MainClass.resultPointer][1] = "" + (val3/10);
			MainClass.resultPointer++;
			break;
		 
		case 5 : 
			
			score = 0;
			for (int l = 0; l < SportsCategory.sportsQuestionPointer; l++) {
				System.out.println(l+1+" . "+SportsCategory.sportsQuestions[l][0]);
				System.out.println(SportsCategory.sportsQuestions[l][1]);
				System.out.println(SportsCategory.sportsQuestions[l][2]);
				System.out.println(SportsCategory.sportsQuestions[l][3]);
				System.out.println(SportsCategory.sportsQuestions[l][4]);
				System.out.println("Please enter your choice");
				String selection = amn.nextLine();
				if (selection.trim().equals(SportsCategory.sportsQuestions[l][5])) {
					score++;
					System.out.println("Correct");
				} else {
					System.out.println("Incorrect! Correct option is " + SportsCategory.sportsQuestions[l][5]);
				}
			}
			int val4 = score * 100;
			MainClass.result[MainClass.resultPointer][0] = "Sports";
			MainClass.result[MainClass.resultPointer][1] = "" + (val4/10);
			MainClass.resultPointer++;
			break;
			
			
		
		case 6 :
			
			score = 0;
			for (int l = 0; l < MovieCategory.movieQuestionPointer ; l++) {
				System.out.println( MovieCategory.movieQuestions[l][0]);
				System.out.println( MovieCategory.movieQuestions[l][1]);
				System.out.println( MovieCategory.movieQuestions[l][2]);
				System.out.println( MovieCategory.movieQuestions[l][3]);
				System.out.println( MovieCategory.movieQuestions[l][4]);
				System.out.println("Please enter your choice");
				String selection = amn.nextLine();
				if (selection.trim().equals(MovieCategory.movieQuestions[l][5])) {
					score++;
					System.out.println("Correct");
				} else {
					System.out.println("Incorrect! Correct option is " + MovieCategory.movieQuestions[l][5]);
				}
			}
			int val5 = score * 100;
			MainClass.result[MainClass.resultPointer][0] = "Movie";
			MainClass.result[MainClass.resultPointer][1] = "" + (val5/10);
			MainClass.resultPointer++;
			break;
			
		}	
	}
	
}

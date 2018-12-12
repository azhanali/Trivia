package project1;

import java.util.Scanner;

public class AdminFUnctions {
	
	public static void add(int optionAdmin) {
		Scanner amn = new Scanner(System.in);
		
		System.out.println("Please enter the question you want to add");
		String Q = amn.nextLine();
		System.out.println("Please enter option 1 ");
		String op1 = amn.nextLine();
		System.out.println("Please enter option 2 ");
		String op2 = amn.nextLine();
		System.out.println("Please enter option 3 ");
		String op3 = amn.nextLine();
		System.out.println("Please enter option 4 ");
		String op4 = amn.nextLine();
		System.out.println("Please enter the correct option ");
		String correctop = amn.nextLine();
		
		switch(optionAdmin){
		
		case 1 : 
			Artcategory.artQuestions[Artcategory.artQuestionPointer][0] = Q;
			Artcategory.artQuestions[Artcategory.artQuestionPointer][1] = op1;
			Artcategory.artQuestions[Artcategory.artQuestionPointer][2] = op2;
			Artcategory.artQuestions[Artcategory.artQuestionPointer][3] = op3;
			Artcategory.artQuestions[Artcategory.artQuestionPointer][4] = op4;
			Artcategory.artQuestions[Artcategory.artQuestionPointer][5] = correctop;
			Artcategory.artQuestionPointer ++;
		break;
		
		case 2:
			FoodCategory.foodQuestions[FoodCategory.foodQuestionPointer][0]=Q;
			FoodCategory.foodQuestions[FoodCategory.foodQuestionPointer][1]=op1;
			FoodCategory.foodQuestions[FoodCategory.foodQuestionPointer][2]=op2;
			FoodCategory.foodQuestions[FoodCategory.foodQuestionPointer][3]=op3;
			FoodCategory.foodQuestions[FoodCategory.foodQuestionPointer][4]=op4;
			FoodCategory.foodQuestions[FoodCategory.foodQuestionPointer][5]=correctop;
			FoodCategory.foodQuestionPointer ++;	
		break;
		
		case 3:
			HistoryCategory.historyQuestions[HistoryCategory.historyQuestionPointer][0]=Q;
			HistoryCategory.historyQuestions[HistoryCategory.historyQuestionPointer][1]=op1;
			HistoryCategory.historyQuestions[HistoryCategory.historyQuestionPointer][2]=op2;
			HistoryCategory.historyQuestions[HistoryCategory.historyQuestionPointer][3]=op3;
			HistoryCategory.historyQuestions[HistoryCategory.historyQuestionPointer][4]=op4;
			HistoryCategory.historyQuestions[HistoryCategory.historyQuestionPointer][5]=correctop;
			HistoryCategory.historyQuestionPointer ++;
		break;
		
		case 4:
			Javacategory.javaQuestions[Javacategory.javaQuestionPointer][0]=Q;
			Javacategory.javaQuestions[Javacategory.javaQuestionPointer][1]=op1;
			Javacategory.javaQuestions[Javacategory.javaQuestionPointer][2]=op2;
			Javacategory.javaQuestions[Javacategory.javaQuestionPointer][3]=op3;
			Javacategory.javaQuestions[Javacategory.javaQuestionPointer][4]=op4;
			Javacategory.javaQuestions[Javacategory.javaQuestionPointer][5]=correctop;
			Javacategory.javaQuestionPointer ++;
		break;
			
		case 5:
			SportsCategory.sportsQuestions[SportsCategory.sportsQuestionPointer][0]=Q;
			SportsCategory.sportsQuestions[SportsCategory.sportsQuestionPointer][1]=op1;
			SportsCategory.sportsQuestions[SportsCategory.sportsQuestionPointer][2]=op2;
			SportsCategory.sportsQuestions[SportsCategory.sportsQuestionPointer][3]=op3;
			SportsCategory.sportsQuestions[SportsCategory.sportsQuestionPointer][4]=op4;
			SportsCategory.sportsQuestions[SportsCategory.sportsQuestionPointer][5]=correctop;
			SportsCategory.sportsQuestionPointer ++;
		break;
		
		case 6:
			MovieCategory.movieQuestions[MovieCategory.movieQuestionPointer][0]=Q;
			MovieCategory.movieQuestions[MovieCategory.movieQuestionPointer][1]=op1;
			MovieCategory.movieQuestions[MovieCategory.movieQuestionPointer][2]=op2;
			MovieCategory.movieQuestions[MovieCategory.movieQuestionPointer][3]=op3;
			MovieCategory.movieQuestions[MovieCategory.movieQuestionPointer][4]=op4;
			MovieCategory.movieQuestions[MovieCategory.movieQuestionPointer][5]=correctop;
			MovieCategory.movieQuestionPointer ++;
		break;
		}
		
	}

	public static void edit(int optionAdmin) {
		Scanner amn = new Scanner(System.in);
		
		System.out.println("Please enter question number you want to edit");
		int number = amn.nextInt();
		amn.nextLine();
		System.out.println("Please enter new the question you want to add");
		String Q = amn.nextLine();
		System.out.println("Please enter option 1 ");
		String op1 = amn.nextLine();
		System.out.println("Please enter option 2 ");
		String op2 = amn.nextLine();
		System.out.println("Please enter option 3 ");
		String op3 = amn.nextLine();
		System.out.println("Please enter option 4 ");
		String op4 = amn.nextLine();
		System.out.println("Please enter the correct option ");
		String correctop = amn.nextLine();
		
		switch(optionAdmin){
		
		case 1 : 
			Artcategory.artQuestions[number-1][0] = Q;
			Artcategory.artQuestions[number-1][1] = op1;
			Artcategory.artQuestions[number-1][2] = op2;
			Artcategory.artQuestions[number-1][3] = op3;
			Artcategory.artQuestions[number-1][4] = op4;
			Artcategory.artQuestions[number-1][5] = correctop;
		break;
		
		case 2:
			FoodCategory.foodQuestions[number-1][0]=Q;
			FoodCategory.foodQuestions[number-1][1]=op1;
			FoodCategory.foodQuestions[number-1][2]=op2;
			FoodCategory.foodQuestions[number-1][3]=op3;
			FoodCategory.foodQuestions[number-1][4]=op4;
			FoodCategory.foodQuestions[number-1][5]=correctop;
			FoodCategory.foodQuestionPointer ++;	
		break;
		
		case 3:
			HistoryCategory.historyQuestions[HistoryCategory.historyQuestionPointer][0]=Q;
			HistoryCategory.historyQuestions[HistoryCategory.historyQuestionPointer][1]=op1;
			HistoryCategory.historyQuestions[HistoryCategory.historyQuestionPointer][2]=op2;
			HistoryCategory.historyQuestions[HistoryCategory.historyQuestionPointer][3]=op3;
			HistoryCategory.historyQuestions[HistoryCategory.historyQuestionPointer][4]=op4;
			HistoryCategory.historyQuestions[HistoryCategory.historyQuestionPointer][5]=correctop;
			HistoryCategory.historyQuestionPointer ++;
		break;
		
		case 4:
			Javacategory.javaQuestions[Javacategory.javaQuestionPointer][0]=Q;
			Javacategory.javaQuestions[Javacategory.javaQuestionPointer][1]=op1;
			Javacategory.javaQuestions[Javacategory.javaQuestionPointer][2]=op2;
			Javacategory.javaQuestions[Javacategory.javaQuestionPointer][3]=op3;
			Javacategory.javaQuestions[Javacategory.javaQuestionPointer][4]=op4;
			Javacategory.javaQuestions[Javacategory.javaQuestionPointer][5]=correctop;
			Javacategory.javaQuestionPointer ++;
		break;
			
		case 5:
			SportsCategory.sportsQuestions[SportsCategory.sportsQuestionPointer][0]=Q;
			SportsCategory.sportsQuestions[SportsCategory.sportsQuestionPointer][1]=op1;
			SportsCategory.sportsQuestions[SportsCategory.sportsQuestionPointer][2]=op2;
			SportsCategory.sportsQuestions[SportsCategory.sportsQuestionPointer][3]=op3;
			SportsCategory.sportsQuestions[SportsCategory.sportsQuestionPointer][4]=op4;
			SportsCategory.sportsQuestions[SportsCategory.sportsQuestionPointer][5]=correctop;
			SportsCategory.sportsQuestionPointer ++;
		break;
		
		case 6:
			MovieCategory.movieQuestions[MovieCategory.movieQuestionPointer][0]=Q;
			MovieCategory.movieQuestions[MovieCategory.movieQuestionPointer][1]=op1;
			MovieCategory.movieQuestions[MovieCategory.movieQuestionPointer][2]=op2;
			MovieCategory.movieQuestions[MovieCategory.movieQuestionPointer][3]=op3;
			MovieCategory.movieQuestions[MovieCategory.movieQuestionPointer][4]=op4;
			MovieCategory.movieQuestions[MovieCategory.movieQuestionPointer][5]=correctop;
			MovieCategory.movieQuestionPointer ++;
		break;
		}
		
	}

	public static void delete(int optionAdmin) {
        Scanner amn = new Scanner(System.in);
		
		System.out.println("Please enter the question number you want to delete");
		int number = amn.nextInt();
		switch(optionAdmin){
		
		case 1 : 
			for(int i = number-1; i< Artcategory.artQuestionPointer ; i++) {
				Artcategory.artQuestions[i][0] = Artcategory.artQuestions[i+1][0];
				Artcategory.artQuestions[i][1] = Artcategory.artQuestions[i+1][1];
				Artcategory.artQuestions[i][2] = Artcategory.artQuestions[i+1][2];
				Artcategory.artQuestions[i][3] = Artcategory.artQuestions[i+1][3];
				Artcategory.artQuestions[i][4] = Artcategory.artQuestions[i+1][4];
				Artcategory.artQuestions[i][5] = Artcategory.artQuestions[i+1][5];
				
			}
			Artcategory.artQuestionPointer --;
			
		break;
		
//		case 2:
//			FoodCategory.foodQuestions[number-1][0]=Q;
//			FoodCategory.foodQuestions[number-1][1]=op1;
//			FoodCategory.foodQuestions[number-1][2]=op2;
//			FoodCategory.foodQuestions[number-1][3]=op3;
//			FoodCategory.foodQuestions[number-1][4]=op4;
//			FoodCategory.foodQuestions[number-1][5]=correctop;
//			FoodCategory.foodQuestionPointer ++;	
//		break;
//		
//		case 3:
//			HistoryCategory.historyQuestions[HistoryCategory.historyQuestionPointer][0]=Q;
//			HistoryCategory.historyQuestions[HistoryCategory.historyQuestionPointer][1]=op1;
//			HistoryCategory.historyQuestions[HistoryCategory.historyQuestionPointer][2]=op2;
//			HistoryCategory.historyQuestions[HistoryCategory.historyQuestionPointer][3]=op3;
//			HistoryCategory.historyQuestions[HistoryCategory.historyQuestionPointer][4]=op4;
//			HistoryCategory.historyQuestions[HistoryCategory.historyQuestionPointer][5]=correctop;
//			HistoryCategory.historyQuestionPointer ++;
//		break;
//		
//		case 4:
//			Javacategory.javaQuestions[Javacategory.javaQuestionPointer][0]=Q;
//			Javacategory.javaQuestions[Javacategory.javaQuestionPointer][1]=op1;
//			Javacategory.javaQuestions[Javacategory.javaQuestionPointer][2]=op2;
//			Javacategory.javaQuestions[Javacategory.javaQuestionPointer][3]=op3;
//			Javacategory.javaQuestions[Javacategory.javaQuestionPointer][4]=op4;
//			Javacategory.javaQuestions[Javacategory.javaQuestionPointer][5]=correctop;
//			Javacategory.javaQuestionPointer ++;
//		break;
//			
//		case 5:
//			SportsCategory.sportsQuestions[SportsCategory.sportsQuestionPointer][0]=Q;
//			SportsCategory.sportsQuestions[SportsCategory.sportsQuestionPointer][1]=op1;
//			SportsCategory.sportsQuestions[SportsCategory.sportsQuestionPointer][2]=op2;
//			SportsCategory.sportsQuestions[SportsCategory.sportsQuestionPointer][3]=op3;
//			SportsCategory.sportsQuestions[SportsCategory.sportsQuestionPointer][4]=op4;
//			SportsCategory.sportsQuestions[SportsCategory.sportsQuestionPointer][5]=correctop;
//			SportsCategory.sportsQuestionPointer ++;
//		break;
//		
//		case 6:
//			MovieCategory.movieQuestions[MovieCategory.movieQuestionPointer][0]=Q;
//			MovieCategory.movieQuestions[MovieCategory.movieQuestionPointer][1]=op1;
//			MovieCategory.movieQuestions[MovieCategory.movieQuestionPointer][2]=op2;
//			MovieCategory.movieQuestions[MovieCategory.movieQuestionPointer][3]=op3;
//			MovieCategory.movieQuestions[MovieCategory.movieQuestionPointer][4]=op4;
//			MovieCategory.movieQuestions[MovieCategory.movieQuestionPointer][5]=correctop;
//			MovieCategory.movieQuestionPointer ++;
//		break;
		}
		
	}
}

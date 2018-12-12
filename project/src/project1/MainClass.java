package project1;

import java.util.Scanner;


public class MainClass {

	public static String result[][] = new String[15][2];
	public static int resultPointer = 0;
	
	public static void main(String[] args) {
		GameDatabase.initializeData();
		Scanner amn = new Scanner(System.in);
		System.out.println("WELCOME TO QUIZ");
		int option;
		do {
			printCategory();
			option = amn.nextInt(); 
			amn.nextLine();
			if(option == 123) {
				printCategory();
				int optionAdmin = amn.nextInt(); 
				amn.nextLine();
				System.out.println("Please enter \n1 to add\n2 to edit\n3 to delete");
				int operation = amn.nextInt();
				switch(operation) {
				case 1:
				AdminFUnctions.add(optionAdmin);
				case 2: 
				AdminFUnctions.edit(optionAdmin);
				case 3:
				AdminFUnctions.delete(optionAdmin);	
				}
				
				
			}else {
				MenuClass s = new MenuClass();
				s.front(option);
			}
		}while(option !=0);
	
		for(int i = 0 ; i<resultPointer ; i++) {
				System.out.println("");
				System.out.println("Category "+result[i][0] + " percentage " + result[i][1] + " %");
			}
		
		}
	
	public static void printCategory() {
		System.out.println("select any of the following category :\n ");
		System.out.println("1 for "+ GameDatabase.category[0]);
		System.out.println("2 for "+ GameDatabase.category[1]);
		System.out.println("3 for "+ GameDatabase.category[2]);
		System.out.println("4 for "+ GameDatabase.category[3]);
		System.out.println("5 for "+ GameDatabase.category[4]);
		System.out.println("6 for "+ GameDatabase.category[5]);
		System.out.println("0 for Exit the application with confirmation ");
		}//end menu

}

package project1;

public class GameDatabase {

	private static int noOfCat=6;
	
	public static String category[]=new String[6];
	
	
	public static void initializeData() {
		
		category[0]="Art";
		category[1]="Food";
		category[2]="History";
		category[3]="Java";
		category[4]="Sports";
		category[5]="Movie";
		
		Artcategory.fillArtArray();
		
		FoodCategory.fillFoodArray();
		
		HistoryCategory.fillHistoryArray();
		
		Javacategory.fillJavaArray();
		
		SportsCategory.fillSportsArray();
		
		MovieCategory.fillMovieArray();
		
		
	}
	
	
}

import java.util.Scanner;

public class MovieDriver {

	public static void main(String[] args) 
	{
		
		Scanner keyboard = new Scanner(System.in);
		Movie movie = new Movie();
		
		
		System.out.println("Enter the name of a movie");
		String title = keyboard.nextLine();
		movie.setTitle(title); 
		
		System.out.println("Enter the rating of the movie");
		String rating = keyboard.nextLine();
		movie.setRating(rating);
		
		System.out.println("Enter the number of tickets sold for this movie");
		int soldTickets = keyboard.nextInt();
	    movie.setSoldTickets(soldTickets);
		
		System.out.println(movie.toString());
			
		System.out.println("");
		
		System.out.println("Goodbye");

	}

}


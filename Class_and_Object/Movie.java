package Class_and_Object;

public class Movie {
//	8. Create a class Movie with variables movieName, rating, and duration. 
//	Add a method showMovieInfo(). In main(), create 3 movie objects 
//	and print their information.
	
	String movieName;
	double rating;
	double duration;
	
	void showMovieInfo() {
		System.out.println("MovieName : "+movieName+", Rating : "+rating+", Duration : "+duration+" Hrs");
	}
	
	public static void main(String args[]) {
		Movie m1 = new Movie();
		
		m1.movieName="Real Steel";
		m1.rating=4.5;
		m1.duration=2.5;
		m1.showMovieInfo();

		m1.movieName="Mafia";
		m1.rating=5;
		m1.duration=3.0;
		m1.showMovieInfo();
	}
}
package Constructor;

public class Movie {
//	8. Create a class Movie with variables movieName, rating, and duration. 
//	Add a method showMovieInfo(). In main(), create 3 movie objects 
//	and print their information.

	String movieName;
	int rating;
	double duration;
	
	void showMovieInfo(){
		System.out.println("Movie Name : "+movieName);
		System.out.println("Movie Rating : "+rating);
		System.out.println("Movie Duration : "+duration);
		System.out.println("----------------------------");
	}
	
	Movie(String movieName,int rating,double duration){
		this.movieName=movieName;
		this.rating=rating;
		this.duration=duration;
	}
	
	public static void main(String args[]) {
		
		Movie m1 = new Movie("Taj Story",8,2.30);
		Movie m2 = new Movie("Bhagg Milkha bhagg",9,2.45);
		Movie m3 = new Movie("Dangal",9,3.40);
			
		m1.showMovieInfo();
		m2.showMovieInfo();
		m3.showMovieInfo();
		
		
		
	}
	
}

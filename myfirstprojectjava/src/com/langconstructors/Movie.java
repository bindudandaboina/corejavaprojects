package com.langconstructors;

public class Movie {
	String director;
	String producer;
	String hero;
	String heroien;
	double budget;
	public Movie() {
		System.out.println("no arg constructor called");
	}
	Movie(String director){
		this.director = director;
	}
	public Movie(Movie m,String producer){
		this.director=m.director;
		this.producer=producer;
	}
	public Movie(Movie m,String hero,String heroien){
		this.director=m.director;
		this.producer=m.producer;
		this.hero=hero;
		this.heroien=heroien;
	}
	public Movie(Movie m,double budget) {
		this.director=m.director;
		this.producer=m.producer;
		this.hero=m.hero;
		this.heroien=m.heroien;
		this.budget=budget;

	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Movie m=new Movie();
		m.movieInfo();
		Movie m1=new Movie("sukumar");
		m1.movieInfo();
		Movie m2=new Movie(m1,"aravindh");
		m2.movieInfo();
		Movie m3=new Movie(m2,"maheshbabu","rakul");
		m3.movieInfo();
		Movie m4=new Movie(m3,3049454.00);
		m4.movieInfo();

	}
	void movieInfo() {
		System.out.println("movie director:"+director);
		System.out.println("movie producer:"+producer);
		System.out.println("movie hero:"+hero);
		System.out.println("movie heroien:"+heroien);
		System.out.println("budget of movie:"+budget);
		System.out.println("***********************");
		
	}

}

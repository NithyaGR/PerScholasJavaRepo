package com.mod3week2hw2.entity;

public class movie {

	//{"movie_id":1,"title":"Crazy Mama","director":"Ophelia Bonny","year":2006,"genre":"Action|Comedy"}
	
	private Long id;
	private String title;
	private String director;
	private Long year;
	private String genre;
	
	public movie() {
		
	}
	@Override
	public String toString() {
		return "movie [id=" + id + ", title=" + title + ", director=" + director + ", year=" + year + ", genre=" + genre
				+ "]";
	}
	public movie(Long id, String title, String director, Long year, String genre) {
		super();
		this.id = id;
		this.title = title;
		this.director = director;
		this.year = year;
		this.genre = genre;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public Long getYear() {
		return year;
	}
	public void setYear(Long year) {
		this.year = year;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	

}

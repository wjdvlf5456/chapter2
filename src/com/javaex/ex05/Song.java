package com.javaex.ex05;

public class Song {
	
	private String artist;
	private String title;
	private String album;
	private int year;
	private int track;
	private String composer;
	
	//set
	public void setArtist(String art) {
		artist=art;
		
	}
	
	public void setTitle(String tit) {
		title = tit;
		
	}
	
	public void setAlbum(String alb) {
		album = alb;
		
	}
	
	public void setYear(int yea) {
		year=yea;
		
	}
	
	public void setTrack(int tra) {
		track = tra;
		
	}
	
	public void setComposer(String comp) {
		composer=comp;
		
	}
	
	//get
	/*
	public getArtist(String art) {
		return artist;
		
	}
	
	public getTitle(String tit) {
		return title;
		
	}
	
	public getAlbum(String alb) {
		return album;
		
	}
	
	public getYear(int yea) {
		return year;
	}
	
	public getTrack(int tra) {
		return track;
		
	}
	
	public getComposer(String comp) {
		return composer;
		
	}
	*/
	public void showInfo() {
		System.out.print(artist+", ");
		System.out.print(title+" (");
		System.out.print(album+", ");
		System.out.print(year+", ");
		System.out.print(track+"번 track, ");
		System.out.print(composer+" 작곡 )");
		
	}
	
	
	
	
	

}

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
	
	//get	showInfo 사용 시 적용 안 됨
	
	public String getArtist() {
		return artist;
		
	}
	
	public String getTitle() {
		return title;
		
	}
	
	public String getAlbum() {
		return album;
		
	}
	
	public int getYear() {
		return year;
	}
	
	public int getTrack() {
		return track;
		
	}
	
	public String getComposer() {
		return composer;
		
	}
	
	public void showInfo() {
		System.out.print(artist+", ");
		System.out.print(title+" (");
		System.out.print(album+", ");
		System.out.print(year+", ");
		System.out.print(track+"번 track, ");
		System.out.print(composer+" 작곡 )");
		System.out.println("");
	}
	
	
	
	
	

}

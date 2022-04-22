package com.javaex.ex05;

public class Song {
	
	private String artist;
	private String title;
	private String album;
	private int year;
	private int track;
	private String composer;
	
	//artist
	public String getArtist() {
		return artist;
	}
	
	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAlbum() {
		return album;
	}
	
	public void setAlbum(String album) {
		this.album = album;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public int getTrack() {
		return track;
	}
	
	public void setTrack(int track) {
		this.track = track;
	}
	
	public String getComposer() {
		return composer;
	}
	
	public void setComposer(String composer) {
		this.composer = composer;
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

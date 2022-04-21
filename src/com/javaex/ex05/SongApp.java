package com.javaex.ex05;

public class SongApp {
	
	public static void main(String[] args) {
		
		Song iu = new Song();
		iu.setArtist("아이유");
		iu.setTitle("좋은날");
		iu.setAlbum("Real");
		iu.setYear(2010);
		iu.setTrack(3);
		iu.setComposer("이민수");
		
		Song bigbang = new Song();
		bigbang.setArtist("BIGBNAG");
		bigbang.setTitle("거짓말");
		bigbang.setAlbum("Always");
		bigbang.setYear(2007);
		bigbang.setTrack(2);
		bigbang.setComposer("G-DRAGON");
		
		Song buskerbusker = new Song();
		buskerbusker.setArtist("버스커버스커");
		buskerbusker.setTitle("벚꽃엔딩");
		buskerbusker.setAlbum("버스커버스커");
		buskerbusker.setYear(2012);
		buskerbusker.setTrack(4);
		buskerbusker.setComposer("장범준");
		
		iu.showInfo();
		bigbang.showInfo();
		buskerbusker.showInfo();		
	}

}

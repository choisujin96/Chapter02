package com.javaex.ex07;

public class Song {
	
	
	//필드
	private String artist;
	private String title;
	private String album;
	private int year;
	private String track;
	private String composer;
	
	
	//생성자
	public Song() {
		//메모리에 올린다.
		//우리가 따로 코드 짤 필요는 없음.
		//따로 자료형도 안붙음
	}
	
	
	
	
	
	
	//메소드 gs
	
	//=============아티스트=============
	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	public String getArtist() {
		return artist;
	}
	
	
	//=============타이틀=============
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	
	
	//=============앨범=============
	public void setAlbum(String album) {
		this.album = album;
	}
	
	public String getAlbum() {
		return album;
	}
	
	
	//=============연도=============
	public void setYear(int year) {
		this.year = year;
	}
	
	public int getYear() {
		return year;
	}
	
	
	//=============트랙=============
	public void setTrack(String track) {
		this.track = track;
	}
	
	public String getTrack() {
		return track;
	}
	
	
	//=============작곡가=============
	public void setComposer(String composer) {
		this.composer = composer;
	}
	
	public String getComposer() {
		return composer;
	}
	
	
	//메소드
	
	public void showInfo() {
		System.out.println( artist + ","+  title + "(" + album + "," + year + "," + track + "," + composer + ")" );
	}

}

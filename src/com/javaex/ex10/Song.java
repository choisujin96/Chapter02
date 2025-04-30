package com.javaex.ex10;

public class Song {

	//필드
	private String artist;
	private String title;
	private String album;
	private int year;
	private int track;
	private String composer;	
	
	
	
	
	
	//기본생성자
	public Song() {
		System.out.println();
		
	}
	
	
	
	//트랙뺀 생성자5개
	public Song (String artist,String title,String album,int year,String composer) {
		this.artist = artist;
		this.title = title;
		this.album = album;
		this.year = year;
		this.composer = composer;	
		System.out.println("Song(5)");
	}

	
	
	
	//생성자2-6개받는애
	public Song (String artist,String title,String album,int year,int track,String composer) {
		//this(다른생성자를 호출)사용하는 입장(넘겨주는거)
		//this(5)--->song(5)를 호출
		//얘 먼저 사용해야함.
		this(artist, title, album, year, composer);
		//(5)꺼 먼저 실행하고 그다음 (6) 실행
		
		this.track = track;
		System.out.println("Song(6)");
	}
	
	
	
	
	
	
	//메소드 gs

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

	
	
	//메소드 일반
	public void showInfo() {
		System.out.println(artist + ", " + title + 
						   " (" + album + ", " + year + ", " + track + 
						   ", " + composer + ")");
		
	}
}

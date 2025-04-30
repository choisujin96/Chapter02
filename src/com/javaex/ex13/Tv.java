package com.javaex.ex13;

public class Tv {
	
	//필드
	private int channel;
	private int volume;
	private boolean power;
	
	
	
	
	//생성자
	public Tv() {
		
	}
	
	
	
	//생성자2
	public Tv(int channel, int volume, boolean power) {
		this.channel=channel;
		this.volume=volume;
		this.power=power;
	}

	
	
	//메소드gs


	
	public int getChannel() {
		return channel;
	}
	
	
	public int getVolume() {
		return volume;
	}
		
	public boolean getPower() {
		return power;
	}	
	
	
	
	public void setPower(boolean on) {
		if(on==true) {
			power=true;
			
		}else {
			power=false;
		}
	}	
	
	
	public void setChannel(int channel) {
			
		if(power==true) {
			if(channel>=255) {
				channel=255;
			}else if(channel<=1){
				channel=1;
			}else {
				this.channel=channel;
			}
			
		}
	}
	
	
	public void setChannel(boolean up) {
		
		if(power==true) {
			if(up==true) {
				if(channel>=255) {
					channel=255;
				}else {
					channel = channel+1;
				}
			}else {
				if(channel<=1) {
					channel=1;
			    }else{
			    	channel = channel-1;
			    }
			
			}
			
		}
		
	}
	
	

	
	
	public void setVolume(int volume) {

		if(power==true) {
			if(volume<=100) {
				volume=100;
			}else if(volume>=0) {
				volume=0;
			}else {
				this.volume=volume;
			}
		}
	}
	
	
	
	public void setVolume(boolean up) {
		
		
		if(power==true) {
			if(up==true) {
				if(volume>=100) {
					volume=100;
				}else {
					volume=volume+1;
				}
			} else {
				if(volume<=0) {
					volume=0;
				}else {
					volume=volume-1;
				}
			}		
		}
	}

	
	
	

	
	

	
	
	
	//메소드일반
	public void status() {
		System.out.println("파워:" + power + " 채널:" + channel + " 볼륨:" + volume);
		
	}
	

}

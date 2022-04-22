package com.javaex.ex08;

public class TV {

	// 필드
	private int channel;
	private int volume;
	private boolean power;

	// 생성자
	public TV() {

	}
	
	public TV(int channel) {
		if (channel<1) {
			this.channel = 255;
		} else if (channel>255){
			this.channel = 1;
		} else {
			this.channel=channel;
		}
		
	}

	public TV(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}

	// 메소드 - gs
	public void setChannel(int channel) {
		this.channel = channel;
	}
	
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	public void setPower(boolean power) {
		this.power = power;
	}

	public int getChannel() {
		return channel;
	}

	public int getVolume() {
		return volume;
	}

	public boolean getPower() {
		return power;
	}



	// 메소드 - 일반
	/*
 	
	public void power(boolean power) {
		
	}
	
	public void channel(int channel) {
	
	}
	
	public void channel(boolean up) {
		
	
	}
	
	public void volume(int volume) {
	
	}
	
	public void volume(boolean up) {
	
	}
	*/
	//정보출력
	@Override
	public String toString() {
		return "TV [channel=" + channel + ", volume=" + volume + ", power=" + power + "]";
	}
	
	public void status() {
		System.out.println("채널: "+channel+"\t볼륨: "+volume+" 입니다.");
	
	}

}

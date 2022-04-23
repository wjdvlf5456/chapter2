package com.javaex.ex08;

public class TV {

	// 필드
	private int channel;
	private int volume;
	private boolean power;

	// 생성자
	public TV() {
			
	}
	 
	
	public TV(int channel, int volume, boolean power) {
		this.channel=channel;
		this.volume=volume;
		this.power=power;

	}
	

	// 메소드 - gs

	public int getChannel() {
		return channel;
	}

	public int getVolume() {
		return volume;
	}


	// 메소드 - 일반]
	public void channel(int channel) {
		//1에서 255유지
		if (channel<1) {
			this.channel = 255;
		} else if (channel>255){
			this.channel = 1;
		} else {
			this.channel=channel;
		}

	}
	
	public void volume(int volume) {
		//0에서 100유지
		if (volume<1) {
			this.volume=0;
		} else if(volume>100){
			this.volume=100;
		} else {
			this.volume=volume;
		}
	}
	
 	
	public void power(boolean on) {
		
		if (on=true) {
			this.power=true;
		} else {
			this.power=false;
		}
	}
	
	public void channel(boolean up) {
		//1~255유지, 1씩 증감
		if (up=true) {
			this.channel = channel+1;
		} else {
			this.channel = channel-1;
		}
	}
	
	public void volume(boolean up) {
		//1~100유지 1씩 증감
		if (up=true) {
			this.volume = volume+1;
		} else {
			this.volume = volume-1;
		}
	
	}
	
	//정보출력
	@Override
	public String toString() {
		return "TV [channel=" + channel + ", volume=" + volume + ", power=" + power + "]";
	}
	
	public void status() {
		System.out.println("채널: "+channel+"번"+"\t볼륨: "+volume+" 입니다.");
	
	}

}

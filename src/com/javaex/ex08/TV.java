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
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}

	// 메소드 - gs

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
	public void channel(int channel) {

	}

	public void channel(boolean up) {

	}

	public void volume(int volume) {

	}

	public void volume(boolean up) {

	}

	//정보출력
	public void status() {

	}

}

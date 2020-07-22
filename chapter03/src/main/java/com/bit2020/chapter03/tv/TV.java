package com.bit2020.chapter03.tv;

public class TV {
	private int channel;
	private int volume;
	private boolean power;
	
	public TV(int channel, int volume, boolean power) {
		this.channel=channel;
		this.volume=volume;
		this.power=power;
	}
	
	public int getChannel() {
		return channel;
	}

	public int getVolume() {
		return volume;
	}

	public boolean isPower() {
		return power;
	}
	
	public void status() {
		System.out.println("TV[power= "+power+
				", channel= "+channel+". volume= "+volume);
	}
	
	public void power(boolean power) {
		this.power=power;
	}
	
	public void channel(int channel) {
		this.channel=channel;
	}
	
	public void channel(boolean up) {
		if(up) channel++;
		else channel--;
	}
	
	public void volume(int volume) {
		this.volume=volume;
	}
	
	public void volume(boolean up) {
		if(up) volume++;
		else volume--;
	}

}

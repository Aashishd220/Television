package com.cg.television;

//Television Class with different television functions

public class Television {
	private boolean state;
	private int volume;
	private int channel;

//Television Constructor
	public Television() {
		state = true;
		volume = 34;
		channel = 12;

	}

//returning state of television
	public String itsState() {
		if (state == true)
			return "Current state:ON";
		else
			return "Current state:Off";
	}

//function to increase the volume
	public int increaseVolume() {
		volume += 1;
		return volume;
	}

//function to decrease the volume
	public int decreaseVolume() {
		volume -= 1;
		return volume;
	}

//returning current volume
	public int currentVolume() {

		return volume;
	}

//changing channel
	public int changeChannel(int channel) {
		this.channel = channel;
		return channel;
	}

//returning current channel
	public int currentChannel() {

		return channel;
	}

//toggle the power
	public String power() {
		state = !state;
		if (state == false) {
			return "Power off";
		} else
			return "Power on";
	}

}

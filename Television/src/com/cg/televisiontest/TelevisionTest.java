package com.cg.televisiontest;

import com.cg.television.Television;

//Class with main function and performing some functions of television

public class TelevisionTest {
	public static void main(String args[]) {
		Television television = new Television(); // object creation

		System.out.println(television.itsState()); // printing state of television

		System.out.println("Volume increased to:" + television.increaseVolume()); // increasing volume
		System.out.println("Volume increased to:" + television.increaseVolume());
		System.out.println("Volume increased to:" + television.increaseVolume());
		System.out.println("Volume increased to:" + television.increaseVolume());

		System.out.println("Volume decreased to:" + television.decreaseVolume()); // decreasing volume
		System.out.println("Volume decreased to:" + television.decreaseVolume());
		System.out.println("Volume decreased to:" + television.decreaseVolume());
		System.out.println("Volume decreased to:" + television.decreaseVolume());
		System.out.println("Volume decreased to:" + television.decreaseVolume());

		System.out.println("Channel changed to:" + television.changeChannel(45)); // changing channel

		System.out.println(television.itsState()); // printing its state

		System.out.println("Current volume is:" + television.currentVolume()); // printing current volume
		System.out.println("Current channel is:" + television.currentChannel()); //// printing current channel

		System.out.println(television.power());
	}
}

package com.home.design.pattern.command;

public class Application {

	public static void main(String[] args){
		RemoteControl remote = new RemoteControl();
		Light light = new Light();
		Command lightsOn = new LightOnCommand(light);
		Command lightsOff = new LightOffCommand(light);
		
		//switch on		
		remote.setCommand(lightsOn);
		remote.pressButton();
		
		//switch off
		remote.setCommand(lightsOff);
		remote.pressButton();
		
	}
}

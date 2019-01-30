package com.home.design.pattern.command;

//Receiver
public class Light {
	
	private boolean on;
	
	public void switchOn(){
		this.on = true;
		System.out.println("On");
	}
	
	public void switchOff(){
		this.on = false;
		System.out.println("Off");
	}

	public boolean isOn() {
		return on;
	}

	public void setOn(boolean on) {
		this.on = on;
	}	
	
}

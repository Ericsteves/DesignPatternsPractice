package com.cn.designPatterns.behavior.twoclasses.CommandPattern;

public class MyCommand implements Command{
	private Receiver receiver;
	
	MyCommand(Receiver receiver) {
		this.receiver = receiver;
	}
	
	@Override
	public void exe() {
		receiver.action();
	}
}

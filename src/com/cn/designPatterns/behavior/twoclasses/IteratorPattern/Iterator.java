package com.cn.designPatterns.behavior.twoclasses.IteratorPattern;

public interface Iterator {
	
	public Object previous();
	
	public Object next();
	
	public boolean hasNext();
	
	public Object first();
}

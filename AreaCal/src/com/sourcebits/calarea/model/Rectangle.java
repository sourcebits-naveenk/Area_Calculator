package com.sourcebits.calarea.model;

public class Rectangle implements Shape{
	private int length;
	 private int width;
	 public Rectangle (int length, int width)
	 {
		 this.length = length;
		 this.width = width;
	 }
	 public double getArea(){
		 return length*width;
	 }
}

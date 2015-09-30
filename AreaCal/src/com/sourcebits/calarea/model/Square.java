package com.sourcebits.calarea.model;

public class Square implements Shape{
	final int length;
	 public Square (int length)
	 {
		 this.length = length;
	 }
	 public double getArea(){
		 return length*length;
	 }
}

package com.sourcebits.calarea.model;

public class Cube implements Shape {
	 final int length;
	 public Cube (int length)
	 {
		 this.length = length;
	 }
	public double getArea() {
		return length*length*length;
	}

}

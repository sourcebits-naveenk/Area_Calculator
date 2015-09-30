package com.sourcebits.calarea.model;

public class Triangle implements Shape {
	final double height, base;
	 public Triangle (double height, double base)
	 {
		 this.height = height;
		 this.base = base;
	 }
	 public double getArea(){
		 return 0.5*height*base;
	 }
}

package com.sourcebits.calarea.model;

public class Circle implements Shape{
	 final int radius;
	 public Circle (int radius)
	 {
		 this.radius = radius;
	 }
	 public double getArea(){
		 return 3.14*radius*radius;
	 }
}

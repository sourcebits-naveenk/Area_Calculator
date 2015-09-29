package com.sourcebits.calarea.model;

public class Triangle implements Shape {
	 private int a, b, c;
	 public int s;
	 public Triangle (int a, int b, int c)
	 {
		 this.a = a;
		 this.b = b;
		 this.c = c;
		 s = (a+b+c)/2;
	 }
	 public double getArea(){
		 return s*(s-a)*(s-b)*(s-c);
	 }
}

package com.sourcebits.areacal;


import com.sourcebits.calarea.model.Square;
import com.sourcebits.calarea.model.Circle;
import com.sourcebits.calarea.model.Rectangle;
import com.sourcebits.calarea.model.Cube;
import com.sourcebits.calarea.model.Triangle;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class FirstActivity extends Activity {
boolean isShow = true;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Square s= new Square(5);
		Rectangle r = new Rectangle(6,5);
		Circle c = new Circle (4);
		Triangle t = new Triangle(4,5,6);
		Cube cu = new Cube(7);
		Log.i("Area of Square", "Area of Square is" +s.getArea());
		Log.i("Area of Rectangle", "Area of Square is" +r.getArea());
		Log.i("Area of Circle", "Area of Circle is" +c.getArea());
		Log.i("Area of Triangle", "Area of Triangle is" +t.getArea());
		Log.i("Area of Cube", "Area of Cube is" +cu.getArea());	
	}

	@Override
	protected void onDestroy() {
		Log.i("First Activity", " First Activity is destroyed");
		super.onDestroy();
	}

	@Override
	protected void onPause() {
		Log.i("First Activity", "First Activity is paused");
		super.onPause();
	}

	@Override
	protected void onResume() {
		Log.i("First Activity", "First Activity is Resumed");
		if(!isShow) {
			Intent in= new Intent(this, SecondActivity.class);
			startActivity(in);
		super.onResume();
		}
	}

	@Override
	protected void onStart() {
		Log.i("First Activity", "First Activity is started");
		super.onStart();
	}

	@Override
	protected void onStop() {
		Log.i("First Activity", "First Activity is stopped");
		super.onStop();
	}

	
}

package com.sourcebits.areacal;
import com.sourcebits.calarea.model.Circle;
import com.sourcebits.calarea.model.Cube;
import com.sourcebits.calarea.model.Rectangle;
import com.sourcebits.calarea.model.Square;
import com.sourcebits.calarea.model.Triangle;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
public class SecondActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		final Square square= new Square(5);
		final Rectangle rectangle = new Rectangle(6,5);
		final Circle circle = new Circle (4);
		final Triangle triangle = new Triangle(4,5);
		final Cube cube = new Cube(7);
		Log.i("Area of Square", "Area of Square is" +square.getArea());
		Log.i("Area of Rectangle", "Area of Square is" +rectangle.getArea());
		Log.i("Area of Circle", "Area of Circle is" +circle.getArea());
		Log.i("Area of Triangle", "Area of Triangle is" +triangle.getArea());
		Log.i("Area of Cube", "Area of Cube is" +cube.getArea());	
}
	@Override
	protected void onDestroy() {
		Log.i("SecondActivity", "SecondActivity is destroyed");
		super.onDestroy();
	}

	@Override
	protected void onPause() {
		Log.i("SecondActivity", "SecondActivity is paused");
		super.onPause();
	}

	@Override
	protected void onResume() {
		Log.i("SecondActivity", "SecondActivity is Resumed");
		super.onResume();
	}

	@Override
	protected void onStart() {
		Log.i("SecondActivity", "SecondActivity is started");
		super.onStart();
	}

	@Override
	protected void onStop() {
		Log.i("SecondActivity", "SecondActivity is stopped");
		super.onStop();
	}

	
}

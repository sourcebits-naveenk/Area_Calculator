package com.sourcebits.areacal;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
public class SecondActivity extends Activity {
	boolean isShow = true;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
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

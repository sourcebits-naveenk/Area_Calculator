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
		Log.i("Activity A", "Activity A is destroyed");
		super.onDestroy();
	}

	@Override
	protected void onPause() {
		Log.i("Activity A", "Activity A is paused");
		super.onPause();
	}

	@Override
	protected void onResume() {
		Log.i("Activity A", "Activity A is Resumed");
		super.onResume();
	}

	@Override
	protected void onStart() {
		Log.i("Activity A", "Activity A is started");
		super.onStart();
	}

	@Override
	protected void onStop() {
		Log.i("Activity A", "Activity A is stopped");
		super.onStop();
	}

	
}

package com.parse.starter;

import android.app.Activity;
import android.os.Bundle;

import com.parse.Parse;
import com.parse.ParseAnalytics;
import com.parse.ParseInstallation;
import com.parse.PushService;

public class ParseStarterProjectActivity extends Activity {
	/** Called when the activity is first created. */
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

        Parse.initialize(this, "mV2Phn6Ua1rosE4UhCt980Tcf8nbzcVexRgfccCe", "yn8zCwfNvjrzAfwf7c71YpWFdVNo9UMlAlvkK0VD");
        ParseInstallation.getCurrentInstallation().saveInBackground();

		setContentView(R.layout.main);

		ParseAnalytics.trackAppOpened(getIntent());
	}
}

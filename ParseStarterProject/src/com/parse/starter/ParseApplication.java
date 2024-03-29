package com.parse.starter;

import com.parse.Parse;
import com.parse.ParseACL;
import com.parse.ParseInstallation;
import com.parse.ParseUser;
import com.parse.PushService;

import android.app.Application;

public class ParseApplication extends Application {

	@Override
	public void onCreate() {
		super.onCreate();

		// Add your initialization code here
		Parse.initialize(this, "mV2Phn6Ua1rosE4UhCt980Tcf8nbzcVexRgfccCe", "yn8zCwfNvjrzAfwf7c71YpWFdVNo9UMlAlvkK0VD");

        PushService.setDefaultPushCallback(this,ParseStarterProjectActivity.class);
		ParseUser.enableAutomaticUser();
		ParseACL defaultACL = new ParseACL();



		// If you would like all objects to be private by default, remove this line.
		defaultACL.setPublicReadAccess(true);
		
		ParseACL.setDefaultACL(defaultACL, true);
	}

}

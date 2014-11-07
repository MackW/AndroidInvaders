package com.jerseycoders.androidinvaders.Game;

import android.app.Application;

public class CoderBlastApplication extends Application {
	private static CoderBlastApplication instance = null;
	public static final String PREFS = "AndInvPrefs";
	
	public void onCreate() {
		super.onCreate();
		instance = this;
	}
	
	public static CoderBlastApplication getInstance() {
		return instance;
	}
}

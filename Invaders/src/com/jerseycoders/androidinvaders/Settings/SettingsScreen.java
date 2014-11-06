package com.jerseycoders.androidinvaders.Settings;


import com.jerseycoders.androidinvaders.R;
import android.os.Bundle;
import android.preference.PreferenceActivity;

public class SettingsScreen extends PreferenceActivity {
	@SuppressWarnings("deprecation")
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);	
		addPreferencesFromResource(R.xml.settings);
		
        setTitle("Settings");
	}

}

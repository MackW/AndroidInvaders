package com.jerseycoders.androidinvaders.Planet0;

import com.jerseycoders.androidinvaders.Game.GameEngine;
import com.jerseycoders.androidinvaders.Game.GameSprite;
import com.jerseycoders.androidinvaders.Game.Level;
import com.jerseycoders.androidinvaders.Game.Planet;
import com.jerseycoders.androidinvaders.Planet1.Planet1;

import com.jerseycoders.androidinvaders.R;

public class Planet0 extends Planet {
	public Level getLevel(int levelNum, GameEngine ge) {
		Level level = null;
		switch (levelNum) {
		case 0:
			level = new Level0(ge);
			break;
		case 1:
			level = new Level1(ge);
			break;
		case 2:
			level = new Level2(ge);
			break;
		case 3:
			level = new Level3(ge);
			break;
		case 4:
			level = new Level4(ge);
			break;
		case 5:
			level = new Level5(ge);
			break;
		case 6:
			level = new Level6(ge);
			break;
		case 7:
			level = new Level7(ge);
			break;
		case 8:
			level = new Level8(ge);
			break;
		case 9:
			level = new Level9(ge);
			break;	
		}
		MIN_SHOTS += level.getTotalHits();
		return level;
	}
	
	public GameSprite getBoss(GameEngine ge) {
		return new Boss0(ge);
	}
	
	public Planet getNextPlanet() {
		return new Planet1();
	}

	@Override
	public int getBackgroundRes() {
		return R.drawable.pluto;
	}
}

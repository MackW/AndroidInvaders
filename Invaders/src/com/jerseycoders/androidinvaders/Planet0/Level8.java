package com.jerseycoders.androidinvaders.Planet0;

import com.jerseycoders.androidinvaders.Game.GameEngine;
import com.jerseycoders.androidinvaders.Game.Level;

public class Level8 extends Level {
	public Level8(GameEngine ge) {
		super(ge);
	}

	@Override
	public void init() {
		addBaddie(0, 0, 1);
		addBaddie(2, 0, 1);
		addBaddie(4, 0, 1);
		addBaddie(6, 0, 1);
		addBaddie(1, 1, 2);
		addBaddie(3, 1, 2);
		addBaddie(5, 1, 2);
		addBaddie(7, 1, 2);
		addBaddie(0, 2, 3);
		addBaddie(2, 2, 3);
		addBaddie(4, 2, 3);
		addBaddie(6, 2, 3);
		addBaddie(1, 3, 4);
		addBaddie(3, 3, 4);
		addBaddie(5, 3, 4);
		addBaddie(7, 3, 4);

		addBox(2);
		addBox(7);
	}
}

package com.jerseycoders.androidinvaders.Planet1;

import com.jerseycoders.androidinvaders.Game.GameEngine;
import com.jerseycoders.androidinvaders.Game.Level;

public class Level4 extends Level {
	public Level4(GameEngine ge) {
		super(ge);
	}

	@Override
	public void init() {
		addBaddie(0, 0, 2);
		addBaddie(1, 0, 2);
		addBaddie(2, 0, 2);
		addBaddie(3, 0, 2);
		addBaddie(4, 0, 2);
//		addBaddie(5, 0, 1);
//		addBaddie(6, 0, 1);
//		addBaddie(7, 0, 3);
//		addBaddie(0, 1, 2);
//		addBaddie(1, 1, 2);
//		addBaddie(2, 1, 2);
		addBaddie(3, 1, 3);
		addBaddie(4, 1, 3);
		addBaddie(5, 1, 3);
		addBaddie(6, 1, 3);
		addBaddie(7, 1, 3);
		addBaddie(0, 2, 5);
		addBaddie(1, 2, 5);
		addBaddie(2, 2, 5);
		addBaddie(3, 2, 3);
		addBaddie(4, 2, 2);
//		addBaddie(5, 2, 1);
//		addBaddie(6, 2, 5);
//		addBaddie(7, 2, 3);
		addBaddie(0, 3, 2);
		addBaddie(1, 3, 2);
		addBaddie(2, 3, 2);
		addBaddie(3, 3, 2);
		addBaddie(4, 3, 2);
		addBaddie(5, 3, 5);
		addBaddie(6, 3, 5);
		addBaddie(7, 3, 5);
	}
}

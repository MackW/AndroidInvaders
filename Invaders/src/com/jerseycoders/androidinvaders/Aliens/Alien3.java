package com.jerseycoders.androidinvaders.Aliens;

import java.util.Random;

import com.jerseycoders.androidinvaders.Game.GameEngine;


import android.graphics.Canvas;
import com.jerseycoders.androidinvaders.R;

public class Alien3 extends Alien {

	public Alien3(GameEngine ge, double x, double y) {
		super(ge, x, y);
		hp = MAX_HP = 1;
		points = 10;
		type = 2;
		this.setImage(R.drawable.alien2);
		frames = 11;
		Random r = new Random();
		curFrame = r.nextInt(frames);
		width = width/frames;
		this.set((float) x, (float) y, (float) (width + x),
				(float) (height + y));
	}
	
	@Override
	public void draw(Canvas c) {
		super.draw(c);
		if (curFrame == 0)
			frameDir = 1;
		else if (curFrame == frames-1)
			frameDir = -1;
		curFrame+=frameDir;
	}
}

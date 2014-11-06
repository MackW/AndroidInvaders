package com.jerseycoders.androidinvaders.Aliens;

import java.util.Random;

import com.jerseycoders.androidinvaders.Game.GameEngine;


import android.graphics.Canvas;
import com.jerseycoders.androidinvaders.R;

public class Alien4 extends Alien {

	public Alien4(GameEngine ge, double x, double y) {
		super(ge, x, y);
		hp = MAX_HP = 1;
		points = 10;
		type = 4;
		this.setImage(R.drawable.alien4);
		frames = 10;
		Random r = new Random();
		curFrame = r.nextInt(frames);
		width = width/frames;
		this.set((float) x, (float) y, (float) (width + x),
				(float) (height + y));
	}
	
	@Override
	public void draw(Canvas c) {
		super.draw(c);
		curFrame++;
		if(curFrame == frames)
			curFrame = 0;
	}
}

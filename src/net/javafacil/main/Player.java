package net.javafacil.main;

import java.awt.Color;
import java.awt.Graphics;

public class Player extends GameObject {
	
	private int width = 30;
	private int height = 30;

	public Player(int x, int y, ID id) {
		super(x, y, id);
		
		velX = 2;
	}

	@Override
	public void tick() {
		
		if(x >= 770 - 10) {
			velX = -2;
			System.out.println(x);
			System.out.println(Game.WIDTH);
		}
		
		if(x < 0) {
			velX = 2;
		}
		
		x += velX;
	}

	@Override
	public void render(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(x, y, width, height);
	}
	
	
}

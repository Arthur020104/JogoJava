package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.fase.MainMenu;

public class Bomberman extends Game
{
	public static int WIDTH = 1000;
	public static int HEIGHT = 1000;
	
	public SpriteBatch batch;
	
	
	@Override
	public void create () 
	{
		batch = new SpriteBatch();
		//this.setScreen(new MainGameScreen(this));
		this.setScreen(new MainMenu(this));
	}

	@Override
	public void render () 
	{/* Chama o render uma vez a cada frame */
		super.render();//chama render da classe pai
		
		
	}
}

package com.wolfinexile.games.dungeoncrawlers.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.wolfinexile.games.dungeoncrawlers.Game;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = Game.TITLE;
		config.width = Game.V_WIDTH * Game.SCALE;
		config.height = Game.V_HEIGHT * Game.SCALE;
		new LwjglApplication(new Game(), config);
	}
}

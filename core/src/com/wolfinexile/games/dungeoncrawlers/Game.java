package com.wolfinexile.games.dungeoncrawlers;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.wolfinexile.games.dungeoncrawlers.handlers.MyInput;
import com.wolfinexile.games.dungeoncrawlers.handlers.MyInputProcessor;
import com.wolfinexile.games.dungeoncrawlers.states.DungeonScreen;

import static com.badlogic.gdx.Gdx.graphics;

public class Game implements ApplicationListener {

	public static String TITLE = "Dungeon Crawlers";
	public static int V_WIDTH = 360;
	public static int V_HEIGHT = 240;
	public static int SCALE = 2;
    public static String DESKTOP_ASSETS_PATH = "core/assets/";

	public static final float STEP = 1/60f;
	private float accum;

	private SpriteBatch spriteBatch;
	private static OrthographicCamera camera;
	private static OrthographicCamera hud;
	private DungeonScreen dungeonScreen;

	public SpriteBatch getSpriteBatch() {
		return spriteBatch;
	}

	public static OrthographicCamera getCamera() {
		return camera;
	}

	public static OrthographicCamera getHud() {
		return hud;
	}

	@Override
	public void create() {

		Gdx.input.setInputProcessor(new MyInputProcessor());
		graphics.setVSync(true);

		spriteBatch = new SpriteBatch();
		camera = new OrthographicCamera();
		camera.setToOrtho(false, V_WIDTH, V_HEIGHT);
		hud = new OrthographicCamera();
		hud.setToOrtho(false, V_WIDTH, V_HEIGHT);
		dungeonScreen = new DungeonScreen();
        dungeonScreen.show();
	}

	@Override
	public void resize(int width, int height) {

	}

	@Override
	public void render() {
		accum += graphics.getDeltaTime();
		while(accum >= STEP) {

			accum -= STEP;
			MyInput.update();
		}
        dungeonScreen.render(accum);
	}

	@Override
	public void pause() {

	}

	@Override
	public void resume() {

	}

	@Override
	public void dispose() {

	}
}

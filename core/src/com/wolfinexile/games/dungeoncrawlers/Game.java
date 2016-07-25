package com.wolfinexile.games.dungeoncrawlers;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.wolfinexile.games.dungeoncrawlers.handlers.GameStateManager;
import com.wolfinexile.games.dungeoncrawlers.handlers.MyInput;
import com.wolfinexile.games.dungeoncrawlers.handlers.MyInputProcessor;

import static com.badlogic.gdx.Gdx.graphics;

public class Game implements ApplicationListener {

	public static String TITLE = "Dungeon Crawlers";
	public static int V_WIDTH = 360;
	public static int V_HEIGHT = 240;
	public static int SCALE = 2;

	public static final float STEP = 1/60f;
	private float accum;

	private SpriteBatch spriteBatch;
	private OrthographicCamera camera;
	private OrthographicCamera hud;

	private GameStateManager gameStateManager;

	public SpriteBatch getSpriteBatch() {
		return spriteBatch;
	}

	public OrthographicCamera getCamera() {
		return camera;
	}

	public OrthographicCamera getHud() {
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
		gameStateManager = new GameStateManager(this);
	}

	@Override
	public void resize(int width, int height) {

	}

	@Override
	public void render() {
		accum += graphics.getDeltaTime();
		while(accum >= STEP) {

			accum -= STEP;
			gameStateManager.update(STEP);
			gameStateManager.render();
			MyInput.update();
		}
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

package com.wolfinexile.games.dungeoncrawlers.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.World;
import com.wolfinexile.games.dungeoncrawlers.Game;
import com.wolfinexile.games.dungeoncrawlers.content.maps.Map;
import com.wolfinexile.games.dungeoncrawlers.entities.Player;
import com.wolfinexile.games.dungeoncrawlers.entities.objects.Chest;
import com.wolfinexile.games.dungeoncrawlers.logic.generation.Prefixer;
import com.wolfinexile.games.dungeoncrawlers.logic.generation.Weapon;
import com.wolfinexile.games.dungeoncrawlers.logic.generation.WeaponNamer;

import java.util.UUID;

/**
 * Created by WaddlesMcSqueezy on 7/18/2016.
 */
public class DungeonScreen implements Screen {

    private SpriteBatch batch;
    float unitScale = 1 / 16f;
    Vector2 noGravity = new Vector2();
    Map map1 = new Map(Game.DESKTOP_ASSETS_PATH + "map1");
    OrthographicCamera topDownCam = Game.getCamera();
    OrthographicCamera hud = Game.getHud();
    World world;
    OrthogonalTiledMapRenderer renderer;

    @Override
    public void show() {
        world = new World(noGravity, false);
        renderer = new OrthogonalTiledMapRenderer(map1.getMap());
        batch = new SpriteBatch();
        noGravity.set(0,0);
        world.setGravity(noGravity);
        Player player = new Player(world, 64, 64, Game.DESKTOP_ASSETS_PATH + "player_idle.png");
        //dungeon loop
        while(true) {
            topDownCam.setToOrtho(false, Game.V_WIDTH, Game.V_HEIGHT);
            hud.setToOrtho(false, Game.V_WIDTH, Game.V_HEIGHT);
            //player turn
            player.turn();
            //enemy turn
            //reset player moves
            player.resetPlayerMoves();
            //reset enemy moves
            Prefixer prefixer = new Prefixer();
            prefixer.addPrefixToSet(UUID.fromString("f617621d-cea8-4e50-a331-0f52780b38ce"), "generic prefix");
            WeaponNamer weaponnamer = new WeaponNamer();
            weaponnamer.addWeaponToMap(UUID.fromString("c7207ef8-6643-4ad3-8a8a-59ac9fa9dc16"), "not so generic weapon");
            String name = weaponnamer.createWeaponName(prefixer.getPrefix(UUID.fromString("f617621d-cea8-4e50-a331-0f52780b38ce")), weaponnamer.getWeapon(UUID.fromString("c7207ef8-6643-4ad3-8a8a-59ac9fa9dc16")));
            Weapon weapon = new Weapon(name);
            System.out.println(weapon.getName());
            Chest chest1 = new Chest("chest1");
            map1.addObject(chest1);
        }
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(100f / 255f, 100f / 255f, 250f / 255f, 1f);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        topDownCam.update();
        renderer.setView(topDownCam);
        renderer.render();
        batch.begin();
        batch.end();
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}

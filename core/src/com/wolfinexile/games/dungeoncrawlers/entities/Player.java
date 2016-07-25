package com.wolfinexile.games.dungeoncrawlers.entities;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.*;
import com.wolfinexile.games.dungeoncrawlers.handlers.B2DVars;

import static com.wolfinexile.games.dungeoncrawlers.handlers.B2DVars.PPM;

/**
 * Created by WaddlesMcSqueezy on 7/20/2016.
 */
public class Player extends Sprite implements Entity {

    public Player(World world) {

        Body characBody;
        BodyDef bodyDef = new BodyDef();
        bodyDef.type = BodyDef.BodyType.StaticBody;
        bodyDef.fixedRotation = true;
        bodyDef.position.set(160 / PPM, 200 / PPM);
        characBody = world.createBody(bodyDef);

        PolygonShape box = new PolygonShape();
        box.setAsBox(5/PPM, 5/PPM);

        FixtureDef fixtureDef = new FixtureDef();
        fixtureDef.shape = box;
        fixtureDef.density = 2.0f;
        fixtureDef.friction = 0.3f;
        fixtureDef.filter.categoryBits = B2DVars.BIT_CREATURE;
        fixtureDef.filter.maskBits = B2DVars.BIT_WALLS;
        characBody.createFixture(fixtureDef);
        characBody.setUserData("chracbody");
    }

    @Override
    public void move() {

    }
}

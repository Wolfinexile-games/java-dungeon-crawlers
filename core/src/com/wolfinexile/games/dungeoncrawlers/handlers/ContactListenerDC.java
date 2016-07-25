package com.wolfinexile.games.dungeoncrawlers.handlers;

import com.badlogic.gdx.physics.box2d.*;

/**
 * Created by WaddlesMcSqueezy on 7/19/2016.
 */
public class ContactListenerDC implements ContactListener {


    @Override
    public void beginContact(Contact contact) {
        Fixture fa = contact.getFixtureA();
        Fixture fb = contact.getFixtureB();

        fa.getUserData();
    }
    @Override

    public void endContact(Contact contact) {

    }




    @Override
    public void preSolve(Contact contact, Manifold oldManifold) {

    }
    @Override
    public void postSolve(Contact contact, ContactImpulse impulse) {

    }
}

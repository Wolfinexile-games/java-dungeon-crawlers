package com.wolfinexile.games.dungeoncrawlers.entities;

import com.badlogic.gdx.physics.box2d.World;
import com.wolfinexile.games.dungeoncrawlers.handlers.MyInput;
import com.wolfinexile.games.dungeoncrawlers.handlers.MyInputProcessor;
import com.wolfinexile.games.dungeoncrawlers.logic.turns.Turn;

/**
 * Created by WaddlesMcSqueezy on 7/20/2016.
 */
public class Player extends Entity implements Turn {

    private int playerTotalMoves = 1;
    private int movesLeft = 1;
    MyInputProcessor input = new MyInputProcessor();

    public Player(World world, int x, int y, String textureFilePath) {

        super(x, y, textureFilePath);
    }

    public void turn() {
        while(movesLeft > 0) {
            if (input.keyDown(27)) {
                //display menu
            }
            if (input.keyDown(87)) {
                //move up
                this.moveUp();
            }
            if (input.keyDown(83)) {
                //move down
                this.moveDown();
            }
            if (input.keyDown(65)) {
                //move left
                this.moveLeft();
            }
            if (input.keyDown(68)) {
                //move right
                this.moveRight();
            }
            if (input.keyDown(69)) {
                //check if there is interactable object adjacent to player, if yes, interact with it.
                this.interact();
            }
        }
        //Begin AI turn
        //End AI turn
        //Reset player moves, start player turn again externally
    }

    @Override
    public int useMove() {
        movesLeft -= 1;
        return movesLeft;
    }

    public void walk() {

        //walk in given direction
        movesLeft = useMove();
    }

    @Override
    public void useAbility() {
        useMove();
    }

    @Override
    public void useItem() {
        useMove();
    }

    @Override
    public void interact() {
        useMove();
    }

    public void resetPlayerMoves() { movesLeft = playerTotalMoves;}
}

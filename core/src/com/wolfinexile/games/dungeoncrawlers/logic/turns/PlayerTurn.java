package com.wolfinexile.games.dungeoncrawlers.logic.turns;

import com.wolfinexile.games.dungeoncrawlers.handlers.MyInput;

import java.awt.event.KeyEvent;

/**
 * Created by WaddlesMcSqueezy on 7/22/2016.
 */
public class PlayerTurn implements Turn {

    private int playerTotalMoves = 1;
    private int movesLeft = 1;

    public void turn() {
        while(movesLeft > 0) {
            if (MyInput.isDown(KeyEvent.VK_ESCAPE)) {
                //display menu
            }
            if (MyInput.isDown(KeyEvent.VK_W)) {
                //move up
            }
            if (MyInput.isDown(KeyEvent.VK_S)) {
                //move down
            }
            if (MyInput.isDown(KeyEvent.VK_A)) {
                //move left
            }
            if (MyInput.isDown(KeyEvent.VK_D)) {
                //move right
            }
            if (MyInput.isDown(KeyEvent.VK_E)) {
                //check if there is interactable object adjacent to player, if yes, interact with it.
            }
        }
        //Begin AI turn
        //End AI turn
        //Reset player moves, start player turn again externally
        movesLeft = playerTotalMoves;
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
}

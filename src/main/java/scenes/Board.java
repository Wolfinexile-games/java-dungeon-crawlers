package main.java.scenes;

import javax.swing.*;
import java.awt.*;

/**
 * Created by WaddlesMcSqueezy on 7/13/2016.
 */
public class Board extends JFrame {

    boolean fullscreenenabled = false;
    int fullscreenmode = 0;
    GraphicsDevice device = GraphicsEnvironment.getLocalGraphicsEnvironment().getScreenDevices()[0];

    public Board(String title, int width, int height) {
        setTitle(title);
        setSize(width, height);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
    }

    private void setfullscreen() {
        switch(fullscreenmode) {
            case 0:
                System.out.println("Now in windowed mode");
                setUndecorated(false);
                break;
            case 1:
                setUndecorated(true);
                setExtendedState(JFrame.MAXIMIZED_BOTH);
                System.out.println("Now in Fullscreen mode");
                break;
            case 2:
                setUndecorated(true);
                device.setFullScreenWindow(this);
                System.out.println("Now in Windowed Fullscreen mode");
                break;
        }
    }

    public void setFullScreen(int fullscreennewmode) {
        fullscreenenabled = true;
        if (fullscreenmode <= 2) {
            this.fullscreenmode = fullscreennewmode;
            setfullscreen();
        }else{
            System.err.println("Error "+fullscreennewmode+" is not supported on this device!");
        }
    }
}

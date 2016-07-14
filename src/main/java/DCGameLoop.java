package main.java;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * Created by WaddlesMcSqueezy on 7/14/2016.
 */
public class DCGameLoop extends JPanel implements Runnable {

    private Thread thread;
    private boolean running;

    private int fps;
    private int tps;

    private int width;
    private int height;

    public Graphics2D graphics2D;
    private BufferedImage img;

    public static double currentFPS = 120D;

    public DCGameLoop(int width, int height) {
        this.width = width;
        this.height = height;

        setPreferredSize(new Dimension(width, height));
        setFocusable(false);
        requestFocus();
    }

    @Override
    public void addNotify() {
        super.addNotify();

        if (thread == null) {
            thread = new Thread(this);
            thread.start();
        }
    }

    public void run() {

        init();

        long lastTime = System.nanoTime();
        double nsPerTick = 1000000000 / currentFPS;
        int frames = 0;
        int ticks = 0;
        long lastTimer = System.currentTimeMillis();
        double deltaTime = 0;

        while (running) {
            long now = System.nanoTime();
            deltaTime += (now - lastTime) / nsPerTick;
            lastTime = now;
            boolean shouldRender = false;
            while (deltaTime >= 1) {
                ticks++;
                tick(deltaTime);
                deltaTime -= 1;
                shouldRender = true;
            }

            if (shouldRender == true) {
                render();
                frames++;

            }

            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if(System.currentTimeMillis() - lastTimer >= 1000) {
                lastTimer += 1000;
                tps = frames;
                fps = ticks;
                frames = 0;
                ticks = 0;
            }
        }
    }

    public void init() {
        img = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        graphics2D = (Graphics2D) img.getGraphics();
        running = true;
    }

    public void tick(double deltaTime) {
    }

    public void render() {
        graphics2D.clearRect(0,0,width,height);
    }

    public void clear() {
        Graphics g2 = getGraphics();
        if(img != null) {
            g2.drawImage(img,0,0,null);
            g2.dispose();
        }
    }
}

package main.java;

import java.util.Random;

/**
 * Created by WaddlesMcSqueezy on 7/13/2016.
 */
public class App implements Runnable {
    String name;
    int time;
    Random r = new Random();

    public App(String s) {
        name = s;
        time = r.nextInt(999);
    }

    public void run() {
        try {
            System.out.printf("%s is sleeping for %d\n", name, time);
            Thread.sleep(time);
            System.out.printf("%s is done\n", name);
        } catch (Exception e) {}
    }
}

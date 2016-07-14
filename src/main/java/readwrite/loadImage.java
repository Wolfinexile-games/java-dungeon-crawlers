package main.java.readwrite;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

/**
 * Created by WaddlesMcSqueezy on 7/14/2016.
 */
public class loadImage {

    public static BufferedImage LoadImage(Class<?> classfile, String path) {
        URL url = classfile.getResource(path);
        BufferedImage img = null;

        try {
            img = ImageIO.read(url);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return img;
    }
}

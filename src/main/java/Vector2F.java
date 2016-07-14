package main.java;

/**
 * Created by WaddlesMcSqueezy on 7/14/2016.
 */
public class Vector2F {

    public float xpos;
    public float ypos;

    public static float worldxPos;
    public static float worldyPos;

    public Vector2F() {this.xpos = 0.0f; this.ypos = 0.0f;}

    public Vector2F(float xPos, float yPos) {
        this.xpos = xPos;
        this.ypos = yPos;
    }

    public static Vector2F zero() {
        return new Vector2F(0,0);
    }

    public void Normalize() {
        double length = Math.sqrt(xpos * xpos + ypos * ypos);

        if (length != 0.0) {
            float s = 1.0f / (float) length;
            xpos = xpos*s;
            ypos = ypos*s;
        }
    }

    public boolean equals(Vector2F vector) {
        return (this.xpos == vector.xpos && this.ypos == vector.ypos);
    }

    public Vector2F copy(Vector2F vector) {
        xpos = vector.xpos;
        ypos = vector.ypos;
        return new Vector2F(xpos, ypos);
    }

    public Vector2F add(Vector2F vector) {
        xpos = xpos+vector.xpos;
        ypos = ypos+vector.ypos;
        return new Vector2F(xpos, ypos);
    }

    public static void setWorldPos(float worldx, float worldy) {
        worldxPos = worldx;
        worldyPos = worldy;
    }

    public static double getDistanceOnScreen(Vector2F vec1, Vector2F vec2) {
        float v1 = vec1.xpos - vec2.xpos;
        float v2 = vec1.ypos - vec2.ypos;
        return Math.sqrt(v1*v1 + v2*v2);
    }

    public Vector2F getScreenLocation() {
        return new Vector2F(xpos, ypos);
    }

    public Vector2F getWorldLocation() {
        return new Vector2F(xpos - worldxPos, ypos - worldyPos);
    }

    public double getDistanceBetweenWorldVectors(Vector2F vector) {

        float dx = Math.abs(getWorldLocation().xpos - vector.getWorldLocation().xpos);
        float dy = Math.abs(getWorldLocation().ypos - vector.getWorldLocation().ypos);
        return Math.abs(dx*dx - dy*dy);
    }
}

package ru.mirea.lab5;

public class MovablePoint implements Movable {
    int x;
    int y;
    int xSpeed;
    int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public void moveUp() {
        this.y++;
    }

    public void moveDown() {
        this.y--;
    }

    public void moveRight() {
        this.x++;
    }

    public void moveLeft() {
        this.x--;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }

}

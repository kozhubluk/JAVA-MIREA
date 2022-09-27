package Practice6.Ex1;

public class MovableCircle implements Movable{
    MovablePoint center;
    int radius;
    public MovableCircle(int x, int y, int radius, int xSpeed, int ySpeed) {
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    @Override
    public void moveRight() {
        this.center.moveRight();
    }

    @Override
    public void moveLeft() {
        this.center.moveLeft();
    }

    @Override
    public void moveUp() {
        this.center.moveUp();
    }

    @Override
    public void moveDown() {
        this.center.moveDown();
    }
}

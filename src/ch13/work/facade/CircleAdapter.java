package ch13.work.facade;

public class CircleAdapter implements Shape{


    private Circle adaptee;

    public CircleAdapter(Circle circle) {
        this.adaptee = circle;
    }

    @Override
    public void draw(int x, int y, int j, int k) {

        int centerX = x + (j/2);
        int centerY = y + (k/2);
        int radius = Math.min(j,k);

        adaptee.draw(centerX, centerY, radius);
    }
}

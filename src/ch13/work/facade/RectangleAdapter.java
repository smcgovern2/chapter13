package ch13.work.facade;

public class RectangleAdapter implements Shape {

    private Rectangle adaptee;

    public RectangleAdapter(Rectangle rectangle){
        this.adaptee = rectangle;
    }


    @Override
    public void draw(int x, int y, int j, int k) {

        this.adaptee.draw(x,y,j,k);

    }
}

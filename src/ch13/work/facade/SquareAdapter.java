package ch13.work.facade;

public class SquareAdapter implements Shape {

    private Square adaptee;

    public SquareAdapter(Square square){
        this.adaptee = square;
    }


    @Override
    public void draw(int x, int y, int j, int k) {
        int width = Math.min(j,k);

        this.adaptee.draw(x,y,width);

    }
}

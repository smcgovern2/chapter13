package ch13.work.facade;

public class Main {

    public static void main(String[] args) {


        Shape[] shapes = { new RectangleAdapter(new Rectangle()),
                new LineAdapter(new Line()),
                new SquareAdapter(new Square()),
                new CircleAdapter(new Circle())
        };

        int x = 10, y = 20, j= 30, k = 60;
        for(Shape shape : shapes){
            shape.draw(x,y,j,k);
        }
    }
}


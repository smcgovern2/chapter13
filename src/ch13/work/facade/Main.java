package ch13.work.facade;

public class Main {

    public static void main(String[] args) {
        Shape[] shapes = { new RectangleAdapter(new Rectangle()),
                new LineAdapter(new Line()),
                new SquareAdapter(new Square()),
                new CircleAdapter(new Circle())
        };

        AdaptiveShapeMaker adaptiveShapeMaker = new AdaptiveShapeMaker(shapes, 10, 20, 30, 60);

        adaptiveShapeMaker.drawShapes();
    }
}


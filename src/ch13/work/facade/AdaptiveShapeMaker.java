package ch13.work.facade;

public class AdaptiveShapeMaker {


    private Shape[] shapes;
    private int x;
    private int y;
    private int j;
    private int k;


    public AdaptiveShapeMaker(Shape[] shapes, int x, int y, int j, int k) {
        this.shapes = shapes;
        this.x = x;
        this.y = y;
        this.j = j;
        this.k = k;
    }

    public void drawShapes(){
        for(Shape shape : shapes){
            shape.draw(x,y,j,k);
        }
    }


}

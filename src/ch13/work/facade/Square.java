package ch13.work.facade;

public class Square {

    public void draw(int x, int y, int width) {

        int leftSide = x;
        int rightSide = x + width;
        int botSide = y;
        int topSide = y + width;
        System.out.println("Corners of square fall at: " +
                leftSide + "," + botSide +
                " : " + rightSide  + "," + botSide +
                " : " + leftSide + "," + topSide +
                " : "  + rightSide + "," + topSide);
    }
}

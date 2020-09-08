package pract_3.upr1_3;

public class Square extends Rectangle {
    public Square() {
    }

    public Square(double side) {
        super(side,side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }



    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setLength(width);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
        super.setWidth(length);
    }

    public double getSide() {

        return super.getLength();
    }
    public  void setSide(double side) {
       this.length=side;
       this.width=side;
    }

    @Override
    public String toString() {
        return "Shape: square, side: "+getSide()+" , color:"+super.color+" , filled: "+super.filled;
    }
}

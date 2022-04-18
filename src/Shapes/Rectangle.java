package Shapes;

public class Rectangle extends Quadrilateral{
          public Rectangle(int length, int width){
              super(length, width);
          }

          public int getArea(){
              return length * width;
          }

          public int getPerimeter(){
              return 2 * (length + width);
          }
      }









               //Old code
//public class Rectangle {
//      protected int width;
//      protected int height;
//
//
//    public static void main(String[] args) {
//        this.length = lengthToSet;
//        this.width = widthToSet;
//
//
//    }
//    public int getArea() {
//        return width * height;
//    }
//
//}
//
//
//////call fields not properties
               //save code above
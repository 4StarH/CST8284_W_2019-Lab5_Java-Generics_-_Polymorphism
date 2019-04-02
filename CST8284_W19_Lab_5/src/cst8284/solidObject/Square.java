/* Course Name: CST8284 - Object Oriented Programming (Java)
 Student Name: Forrester Hinds
*/

package cst8284.solidObject;

public class Square extends GeometricShape {
	
	   public Square(){this(1.0);}   // default constructor
	   public Square(double width){setWidth(width);}   // base constructor
	   public Square(Square square){square.getWidth();}  //copy constructor
	   
	   public double getPerimeter() {
		   
		   return 4 * this.getWidth();
		   
	   }
	   
	   public double getArea() {
		   
		   return Math.pow(this.getWidth(), 2);
		   		   
	   }
	   
	   @Override
	   public String toString(){return ("Square Overrides " + super.toString());}
	   
	   @Override
	   public boolean equals(Object obj){
		   return ((obj instanceof Square) && ((Square)obj).getWidth() == this.getWidth());
	   }
	   
	   //Perimeter of a square is 4*width
	   //Area of a square width*width
}

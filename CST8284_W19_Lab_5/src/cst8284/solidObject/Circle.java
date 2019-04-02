/* Course Name: CST8284 - Object Oriented Programming (Java)
 Student Name: Forrester Hinds
*/

package cst8284.solidObject;

public class Circle extends GeometricShape {
	
   public Circle(){this(1.0);}   // default constructor
   public Circle(double diameter){setWidth(diameter);}   // base constructor
   public Circle(Circle circle){circle.getWidth();}   // copy constructor
   
   public double getPerimeter() {
	   
	   return (2*Math.PI*(this.getWidth()/2));
	   
   }

   public double getArea() {
	   
	   return (Math.PI*(this.getWidth()/2)*(this.getWidth()/2));
	   
   }
   
   
   
   @Override
   public String toString(){return ("Circle Overrides " + super.toString());}
   
   @Override
   public boolean equals(Object obj){
	   return ((obj instanceof Circle) && ((Circle)obj).getWidth() ==this.getWidth());
   }
   
   // Perimeter of a circle is 2*Math.PI*radius (where radius is width/2)
   // Area of a circle is Math.PI*radius*radius
   
   
   
}

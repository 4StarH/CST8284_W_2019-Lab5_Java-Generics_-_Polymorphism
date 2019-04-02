package cst8284.solidObject;

public class Rectangle extends GeometricShape {
	
	   private double height;

	   public Rectangle(){this(1.0, 1.0);}   // default constructor
	   public Rectangle(double width, double height){setWidth(width); setHeight(height);}   // base constructor
	   public Rectangle(Rectangle rectangle){rectangle.getWidth(); rectangle.getHeight();}  //copy constructor
	   
	   public double getPerimeter() {
		   
		   return (2 * (this.getWidth() + this.getHeight()));
		   
	   }
	   
	   public double getArea() {
		   
		   return (this.getHeight() * this.getWidth());
		   		   
	   }
	   
		public void setHeight(double height) {
			this.height = height;
		}

		public double getHeight() {
			return height;
		}
	   
	   @Override
	   public String toString(){return ("Rectangle Overrides " + super.toString());}
	   
	   @Override
	   public boolean equals(Object obj){
		   return ((obj instanceof Rectangle) && ((Rectangle)obj).getWidth() == this.getWidth());
	   }
	   
	   //Perimeter of a square is 4*width
	   //Area of a square width*width
}

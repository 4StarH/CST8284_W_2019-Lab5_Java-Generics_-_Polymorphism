/* Course Name: CST8284 - Object Oriented Programming (Java)
 Student Name: Forrester Hinds
*/

package cst8284.solidObject;

import java.util.ArrayList;

public class SolidObjectsLauncher {
	
   // TODO: define a new static ArrayList of type SolidObject called solidObjects.
	
	static ArrayList<SolidObject<GeometricShape>> solidObjects = new ArrayList<SolidObject<GeometricShape>>();
	
   public static void main(String[] args){

		/* TODO
		 * Load the ArrayList declared above with the following four SolidObjects,
		 * which must be instantiated with the values shown below
		 * 
	     *          shape                   depth
	     *  
	     *        Circle(3.0)               5.0
	     *        Rectangle(10.0, 9.0)      2.0
	     *        Rectangle(3.0, 6.0)       10.0
	     *        Square(6.0)    
	     *        
	     * Note that the last SolidObject is a cube constructed using the Square
	     * GeometricShape.  For this, use the one-arg SolidObject constructor.  For 
	     * the other three, use the two-arg constructor.
	    */
	   
	   Circle c1 = new Circle(3.0);
	   SolidObject<GeometricShape> circle = new SolidObject<GeometricShape>(c1, 5.0);
	   solidObjects.add(circle);
	   
	   Rectangle r1 = new Rectangle(10.0, 9.0);
	   SolidObject<GeometricShape> rectangle1 = new SolidObject<GeometricShape>(r1, 2.0);
	   solidObjects.add(rectangle1);
	   
	   Rectangle r2 = new Rectangle(3.0, 6.0);
	   SolidObject<GeometricShape> rectangle2 = new SolidObject<GeometricShape>(c1, 10.0);
	   solidObjects.add(rectangle2);
	   
	   Square s1 = new Square(6.0);
	   SolidObject<GeometricShape> square = new SolidObject<GeometricShape>(s1);
	   solidObjects.add(square);
	   
	  displayVolumeComparison(solidObjects);   // method already declared below
      displaySurfaceAreaComparison(solidObjects);  // method already declared below

   }
	
   // TODO: Create a public static method isVolumeEqual() that takes two SolidObjects as 
   // parameters, and if they have the same volume, returns true, otherwise false.  This
   // method is called by the displayVolumeComparison method, whose code is provided below.

   public static boolean isVolumeEqual(SolidObject<GeometricShape> object1, SolidObject<GeometricShape> object2) {
	   
	   if (object1.getVolume() == object2.getVolume()) {
		   
		   return true;
		   
	   } else {
		   
		   return false;
		   
	   }
	   
   }
   
   // TODO: Create a public static method isSurfaceAreaEqual() that takes two SolidObjects 
   // as parameters and if they have the same surface area, returns true, otherwise false.  
   // This method is called by the displayVolumeComparison method, whose code is provided below.
   
   public static boolean isSurfaceAreaEqual(SolidObject<GeometricShape> object1, SolidObject<GeometricShape> object2) {
	   
	   if (object1.getSurfaceArea() == object2.getSurfaceArea()) {
		   
		   return true;
		   
	   } else {
		   
		   return false;
		   
	   }
	   
   }

	
   public static void displayVolumeComparison(ArrayList<SolidObject<GeometricShape>> arList){
		
      // Print out column header
      System.out.println("\n\nCompare the two object's volumes.  Are they equal?\n");
	  System.out.print("\t\t");
      for (SolidObject<GeometricShape> columnHeader: arList)
         System.out.print("\t" + columnHeader);
		
	 // Print out each row,starting with the name of the object
	 for (SolidObject<GeometricShape> solidObjRow: arList){
	    System.out.println();	// Next line
	    System.out.print(solidObjRow);
            for (SolidObject<GeometricShape> solidObjColumn: arList)
               System.out.print("\t\t" + isVolumeEqual(solidObjColumn, solidObjRow));
         }    
      }
	
   public static void displaySurfaceAreaComparison(ArrayList<SolidObject<GeometricShape>> arList){
      
	   System.out.println("\n\nCompare the two object's surface areas.  Are they equal?\n");  
	   // Print out the header
	   System.out.print("\t\t");
       for (SolidObject<GeometricShape> columnHeader: arList)
         System.out.print("\t" + columnHeader);
		
      // Print out each row,starting with the name of the object
      for (SolidObject<GeometricShape> solidObjRow: arList){
         System.out.println();	// Next line
         System.out.print(solidObjRow);
         for (SolidObject<GeometricShape> solidObjColumn: arList)
            System.out.print("\t\t" + isSurfaceAreaEqual(solidObjColumn, solidObjRow));  
      }
   }
}


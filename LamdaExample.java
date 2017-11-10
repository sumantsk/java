package com.foo;

@FunctionalInterface
interface Draw{
	/**
	 * @param redius
	 * @return 
	 */
	public Double area(int redius);
}
interface DrawableRectangle{
	public Double area(double len,double breadth);
}
/**
 * @author sumantsk22@gmail.com
 *
 */
public class LambdaExapmle {
	
		public static void main(String[] args) {
			/* 
			 * example 1
			 */
			Draw x = (redius)->{
				return 3.14*redius*redius;
			};
			System.out.println("area needed to draw "+x.area(5));
			/* 
			 * example 2
			 */			
			DrawableRectangle y = (len,breadth)->len*breadth;
			System.out.println("rectangle of area needed to draw "+y.area(5,6));
		}
}

package project_1;
/**
 * 
 * @author tyler spring
 * this is the TwoDemShape interface. Here is where the shape class extends itself to allow this interface to create the getArea method. Which would be used in other classes
 * where the shape would call for it.
 * This is a child of shape.
 */
public interface TwoDemShape extends Shape {
	public double getArea();
}

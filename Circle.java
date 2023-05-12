package project_1;
/**
 * 
 * @author tyler spring
 *This is the circle class. It extends the TwoDemShape interface in order to override the getArea and numOfDimens
 *methods.
 */
public class Circle implements TwoDemShape {

	int cRad;

	public Circle(int cRad) {
		this.cRad = cRad;
	}
//Overridden method from twoDemShape interface.
	@Override
	public double getArea() {
		return 3.14 * cRad * cRad;
	}

	public int getRad() {
		return cRad;
	}

	public void setRad(int cRad) {
		this.cRad = cRad;
	}
//Overridden method from twoDemShape interface.
	@Override
	public int numOfDimens() {
		return 2;
	}
}

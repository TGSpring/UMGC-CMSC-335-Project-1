package project_1;
/**
 * 
 * @author tyler spring
 *This is the square class. It extends the TwoDemShape interface in order to override the getArea and numOfDimens
 *methods.
 */
public class Square implements TwoDemShape {
	int sidesq;

	public Square(int sidesq) {
		this.sidesq = sidesq;
	}

	public int getsidesq() {
		return sidesq;
	}

	public void setsidesq(int sidesq) {
		this.sidesq = sidesq;
	}
	//Overridden method from twoDemShape interface.
	@Override
	public double getArea() {
		return sidesq * sidesq;
	}
	//Overridden method from twoDemShape interface.
	@Override
	public int numOfDimens() {
		return 2;
	}
}

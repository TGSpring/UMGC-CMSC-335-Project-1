package project_1;
/**
 * 
 * @author tyler spring
 *This is the rectangle class. It extends the TwoDemShape interface in order to override the getArea and numOfDimens
 *methods.
 */
public class Rectangle implements TwoDemShape {

	int recW, recL;

	public Rectangle(int recW, int recL) {
		this.recL = recL;
		this.recW = recW;
	}

	public int getrecW() {
		return recW;
	}

	public void setrecW(int recW) {
		this.recW = recW;
	}

	public int getrecL() {
		return recL;
	}

	public void setrecL(int recL) {
		this.recL = recL;
	}
	//Overridden method from twoDemShape interface.
	@Override
	public double getArea() {
		return recW * recL;
	}
	//Overridden method from twoDemShape interface.
	@Override
	public int numOfDimens() {
		return 2;
	}

}

package project_1;
/**
 * 
 * @author tyler spring
 *This is the triangle class. It extends the TwoDemShape interface in order to override the getArea and numOfDimens
 *methods.
 */
public class Triangle implements TwoDemShape {

	int triH, triB;

	public Triangle(int triH, int triB) {
		this.triB = triB;
		this.triH = triH;
	}

	public int gettriH() {
		return triH;
	}

	public void settriH(int triH) {
		this.triH = triH;
	}

	public int gettriB() {
		return triB;
	}

	public void settriB(int triB) {
		this.triB = triB;
	}
	//Overridden method from twoDemShape interface.
	@Override
	public double getArea() {
		return (triH * triB);
	}
	//Overridden method from twoDemShape interface.
	@Override
	public int numOfDimens() {
		return 2;
	}

}

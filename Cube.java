package project_1;
/**
 * 
 * @author tyler spring
 *This is the cube class. It extends the ThreeDemShape interface in order to override the getArea and numOfDimens
 *methods.
 */
public class Cube implements ThreeDemShape {

	int cArea;

	public Cube(int cArea) {
		this.cArea = cArea;
	}

	public int getArea() {
		return cArea;
	}

	public void setcArea(int cArea) {
		this.cArea = cArea;

	}
	//Overridden method from threeDemShape interface.
	@Override
	public double getVol() {
		return cArea * cArea * cArea;
	}
	//Overridden method from threeDemShape interface.
	@Override
	public int numOfDimens() {
		return 3;
	}
}

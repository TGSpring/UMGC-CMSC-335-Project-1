package project_1;
/**
 * 
 * @author tyler spring
 *This is the sphere class. It extends the ThreeDemShape interface in order to override the getArea and numOfDimens
 *methods.
 */
public class Sphere implements ThreeDemShape {
	int spRadi;

	public Sphere(int spRadi) {
		this.spRadi = spRadi;
	}

	public int getsphRadi() {
		return spRadi;
	}

	public void setspRadi(int spRadi) {
		this.spRadi = spRadi;
	}
	//Overridden method from threeDemShape interface.
	@Override
	public double getVol() {
		return (4 / 3) * 3.14 * spRadi * spRadi * spRadi;
	}
	//Overridden method from threeDemShape interface.
	@Override
	public int numOfDimens() {
		return 3;
	}

}

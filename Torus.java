package project_1;
/**
 * 
 * @author tyler spring
 *This is the torus class. It extends the ThreeDemShape interface in order to override the getArea and numOfDimens
 *methods.
 */
public class Torus implements ThreeDemShape {

	int miRadi, maRadi;

	public Torus(int miRadi, int maRadi) {
		this.maRadi = maRadi;
		this.miRadi = miRadi;
	}

	public int getmaRadi() {
		return maRadi;
	}

	public void setmaRadi(int maRadi) {
		this.maRadi = maRadi;
	}

	public int getmiRadi() {
		return miRadi;
	}

	public void setmiRadi(int miRadi) {
		this.miRadi = miRadi;
	}
	//Overridden method from threeDemShape interface.
	@Override
	public double getVol() {
		return (3.14 * maRadi * miRadi) * (2 * 3.14 * maRadi);
	}
	//Overridden method from threeDemShape interface.
	@Override
	public int numOfDimens() {
		return 3;
	}

}

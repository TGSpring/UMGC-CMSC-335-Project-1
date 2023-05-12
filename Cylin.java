package project_1;
/**
 * 
 * @author tyler spring
 *This is the cylinder class. It extends the ThreeDemShape interface in order to override the getArea and numOfDimens
 *methods.
 */
public class Cylin implements ThreeDemShape {

	int cyRadi, cyHei;

	public Cylin(int cyRadi, int cyHei) {
		this.cyRadi = cyRadi;
		this.cyHei = cyHei;
	}

	public int getcyRadi() {
		return cyRadi;
	}

	public void setcyRadi(int cyRadi) {
		this.cyRadi = cyRadi;
	}

	public int getcyHei() {
		return cyHei;
	}

	public void setcyHei(int cyHei) {
		this.cyHei = cyHei;
	}
	//Overridden method from threeDemShape interface.
	@Override
	public double getVol() {
		return 3.14 * cyRadi * cyRadi * cyHei;
	}
	//Overridden method from threeDemShape interface.
	@Override
	public int numOfDimens() {
		return 3;
	}

}

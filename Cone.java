package project_1;
/**
 * 
 * @author tyler spring
 *This is the cone class. It extends the ThreeDemShape interface in order to override the getArea and numOfDimens
 *methods.
 */
public class Cone implements ThreeDemShape{

	int cRadi, cHei;
	public Cone(int cRadi, int cHei) {
		this.cRadi = cRadi;
		this.cHei = cHei;
	}
	public int getRadi() {
		return cRadi;
	}
	public void setRadi(int cRadi) {
		this.cRadi = cRadi;
	}
	public int getHei() {
		return cHei;
	}
	public void setHei(int cHei) {
		this.cHei = cHei;
	}
	//Overridden method from threeDemShape interface.
	@Override
	public double getVol() {
		return(3.14 * cRadi * cRadi ) * (cHei / 3);
	}
	//Overridden method from threeDemShape interface.
	@Override
	public int numOfDimens() {
		return 3;
	}

}

package myclasspro.circleDemo;
/**
 * Բ����
 * @version 1.0
 * @author С����
 * @2018��10��31�� ����12:00:37
 */
public class Cylinder extends Circle{
	private double height;
	
	
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public Cylinder(double r,double height) {
		super(r);
		this.height = height;
	}

	@Override
	public double getArea() {
		return super.getArea() * 2 + Math.PI * 2 * getR() * height;
	}
	
	public double getVolun(){
		return super.getArea() * height;
	}
	
}

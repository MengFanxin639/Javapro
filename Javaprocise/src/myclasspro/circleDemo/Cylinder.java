package myclasspro.circleDemo;
/**
 * 圆柱类
 * @version 1.0
 * @author 小新新
 * @2018年10月31日 下午12:00:37
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

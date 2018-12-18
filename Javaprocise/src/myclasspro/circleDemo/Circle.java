package myclasspro.circleDemo;
/**
 * 圆类
 * @version 1.0
 * @author 小新新
 * @2018年10月31日 上午11:59:38
 */
public class Circle {
	private double r;
	
	public Circle(double r) {
		this.setR(r);
	}
	
	public double getArea(){
		return Math.PI * getR() * getR();
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}
	
	
}

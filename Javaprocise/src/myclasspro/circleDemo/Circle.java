package myclasspro.circleDemo;
/**
 * Բ��
 * @version 1.0
 * @author С����
 * @2018��10��31�� ����11:59:38
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

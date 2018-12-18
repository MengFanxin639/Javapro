package myclasspro.AbstractDemo;
/**
 * Բ��
 * @version 1.0
 * @author С����
 * @2018��11��14�� ����10:52:02
 */
public class Circle extends AbsShape{
	private double r;
	
	public Circle(double r){
		this.r=r;
	}
	
	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	
	@Override
	public double get4C() {
		return Math.PI * 2 * r;
	}

	@Override
	public double getArea() {
		return Math.PI * r * r;
	}
	
	@Override
	public String toString() {
		StringBuilder sBuilder = new StringBuilder();
		sBuilder.append("�԰뾶Ϊ" + getR() +"Բ���ܳ���:" + get4C() 
		+ "\t�����:" + getArea());
		return sBuilder.toString();
	}
}

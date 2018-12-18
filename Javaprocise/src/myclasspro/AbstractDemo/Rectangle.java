package myclasspro.AbstractDemo;
/**
 * ������
 * @version 1.0
 * @author С����
 * @2018��11��14�� ����11:00:51
 */
public class Rectangle extends AbsShape{
	private double height;
	private double width;
	
	public Rectangle(double height, double width) {
		this.height = height;
		this.width = width;
	}
	
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	public double get4C() {
		return height * 2 + width * 2;
	}

	@Override
	public double getArea() {
		return height * width;
	}
	
	@Override
	public String toString() {
		StringBuilder sBuilder = new StringBuilder();
		sBuilder.append("�Գ�Ϊ" + getHeight() + "��Ϊ" + getWidth() + "�ľ��ε��ܳ�Ϊ"
				+ get4C() + "\t" + "���Ϊ" + getArea());
		return sBuilder.toString();
	}
	
	
	
}

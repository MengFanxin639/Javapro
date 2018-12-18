package myclasspro.AbstractDemo;
/**
 * 矩形类
 * @version 1.0
 * @author 小新新
 * @2018年11月14日 上午11:00:51
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
		sBuilder.append("以长为" + getHeight() + "宽为" + getWidth() + "的矩形的周长为"
				+ get4C() + "\t" + "面积为" + getArea());
		return sBuilder.toString();
	}
	
	
	
}

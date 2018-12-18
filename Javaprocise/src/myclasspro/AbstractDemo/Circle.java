package myclasspro.AbstractDemo;
/**
 * 圆类
 * @version 1.0
 * @author 小新新
 * @2018年11月14日 上午10:52:02
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
		sBuilder.append("以半径为" + getR() +"圆的周长是:" + get4C() 
		+ "\t面积是:" + getArea());
		return sBuilder.toString();
	}
}

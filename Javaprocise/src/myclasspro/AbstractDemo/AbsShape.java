package myclasspro.AbstractDemo;
//矩形和圆形，要求求出这两种图形的周长和面积，同事要求实用抽象类构建继承结构，并在主方法里实现多态。
public abstract class AbsShape {

	/**
	 * 图形的周长
	 * @return周长
	 */
	public abstract double get4C();
	
	/**
	 * 图形的面积
	 * @return面积
	 */
	public abstract double getArea();
	
}

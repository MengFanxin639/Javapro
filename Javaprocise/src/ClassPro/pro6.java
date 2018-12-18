package ClassPro;
/**
 * 
 * @version 1.0
 * @author 小新新
 * @2018年9月2日 下午10:06:00
 */
		/*1.设计一个图形类作为父类，从图形派生出圆，再从圆派生圆柱，设计成员方法求出它们的面积和体积，
		 * 要求在主方法里应用父类和子类的对象转换来实现多态，通过键盘输入求面积图形类别，当输入园时，
		 * 求的是圆的面积和体积，当输入园柱时，求的是圆柱的面积和体积。*/
/**
 * 
 * @version 2.0
 * @author 小新新
 * @2018年9月12日 下午1:46:19
 */
abstract class picture{//图形类-抽象类
	public String getName(){
		return this.getClass().getSimpleName();
	}
	public abstract double getArea();
}	
	


class circle extends picture{//圆
	private double r;
	public circle(double r) {
		this.r=r;
	}
	public String getName(){
		return this.getClass().getSimpleName();
	}
	@Override
	public double getArea() {
		return (Math.PI )* r * r;
	}
	@Override
		public String toString() {
			StringBuilder sb=new StringBuilder();
			sb.append("面积："+"\t"+getName()+"\t"+getArea());
			return sb.toString();
		}
}

class circleq extends picture{//圆柱
	double r;
	double hight;
	public circleq(double r, double hight){
		this.r=r;
		this.hight=hight;
	}

@Override
public double getArea() {
	return (Math.PI )* r * r*hight;
}
@Override
public String toString() {
	StringBuilder sb=new StringBuilder();
	sb.append("面积："+"\t"+getName()+"\t"+getArea());
	return sb.toString();
}
	 

		
}
public class pro6 {
	public static void main(String[] args) {
		circle c1=new circle(3);
		System.out.println(c1);
		circleq c2=new circleq(3, 3);
		System.out.println(c2);
		
	}
}

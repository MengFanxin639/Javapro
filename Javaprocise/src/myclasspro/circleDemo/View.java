package myclasspro.circleDemo;

import java.util.Scanner;

/**
 * 界面类
 * @version 1.0
 * @author 小新新
 * @2018年10月31日 下午12:15:22
 */
public class View {
	private Scanner reader = null;
	private Circle circle = null;
	private Cylinder cylinder = null;
	public View() {
		getVolunView(getAreaView());
	}

	public double getAreaView() {
		reader = new Scanner(System.in);
		System.out.print("请输入圆半径:");
		double r = reader.nextDouble();
		circle = new Circle(r);
		System.out.print("以半径为 " + circle.getR()+" 的圆面积为: "+circle.getArea());
		return r;
	}
	
	public void getVolunView(double r){
		System.out.print("\n继续输入高:");
		double height = reader.nextDouble();
		cylinder = new Cylinder(r, height);
		System.out.println("以半径为 " + cylinder.getR() + " 高为: "+cylinder.getHeight()+" 的圆面积为:"
		+cylinder.getArea()+"\n体积为:"+cylinder.getVolun());
	}
	
}





package myclasspro.circleDemo;

import java.util.Scanner;

/**
 * ������
 * @version 1.0
 * @author С����
 * @2018��10��31�� ����12:15:22
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
		System.out.print("������Բ�뾶:");
		double r = reader.nextDouble();
		circle = new Circle(r);
		System.out.print("�԰뾶Ϊ " + circle.getR()+" ��Բ���Ϊ: "+circle.getArea());
		return r;
	}
	
	public void getVolunView(double r){
		System.out.print("\n���������:");
		double height = reader.nextDouble();
		cylinder = new Cylinder(r, height);
		System.out.println("�԰뾶Ϊ " + cylinder.getR() + " ��Ϊ: "+cylinder.getHeight()+" ��Բ���Ϊ:"
		+cylinder.getArea()+"\n���Ϊ:"+cylinder.getVolun());
	}
	
}





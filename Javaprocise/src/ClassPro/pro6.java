package ClassPro;
/**
 * 
 * @version 1.0
 * @author С����
 * @2018��9��2�� ����10:06:00
 */
		/*1.���һ��ͼ������Ϊ���࣬��ͼ��������Բ���ٴ�Բ����Բ������Ƴ�Ա����������ǵ�����������
		 * Ҫ������������Ӧ�ø��������Ķ���ת����ʵ�ֶ�̬��ͨ���������������ͼ����𣬵�����԰ʱ��
		 * �����Բ������������������԰��ʱ�������Բ��������������*/
/**
 * 
 * @version 2.0
 * @author С����
 * @2018��9��12�� ����1:46:19
 */
abstract class picture{//ͼ����-������
	public String getName(){
		return this.getClass().getSimpleName();
	}
	public abstract double getArea();
}	
	


class circle extends picture{//Բ
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
			sb.append("�����"+"\t"+getName()+"\t"+getArea());
			return sb.toString();
		}
}

class circleq extends picture{//Բ��
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
	sb.append("�����"+"\t"+getName()+"\t"+getArea());
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

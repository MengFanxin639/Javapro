package ClassPro;



/**
 * 
 * @version 1.0
 * @author С����
 * @param <bank>
 * @param <bank>
 * @2018��8��25�� ����6:37:03
 * 
 * ******����һ����ʵ�������ʻ��ĸ�������ı�����"�ʺ�"��"������"�������ķ�����"���"��"ȡ��"��
 * 		"��ѯ���"�͡���ʾ�ʺš������������࣬
 *		�����ʻ���Ķ��󣬲������Ӧ������
 */
class Bankcard{
	private int id;					//�˺�
	private double extramoney;		//������
	
	public Bankcard() {
	}
	public Bankcard(int id) {
		this.id = id;
	}
	public Bankcard(double extramoney) {
		this.extramoney = extramoney;
	}
	public Bankcard(int id,double extramoney) {
		this(id);
		this.extramoney = extramoney;
	}
	public Bankcard(int id,int extramoney) {
		this(id);
		this.extramoney = extramoney;
	}
	public Bankcard infomoney(int id, double extramoney) {		//��ʼ��
		this.id = id;
		this.extramoney = extramoney;
		return this;
	}
	public double setmoney(double a) {						//���
		extramoney += a;
		return extramoney;
	}
	public double savamoney(double a) {						//ȡ��
		extramoney -= a;
		return extramoney;
	}
	public double getExtramoney() {
		return extramoney;
	}
	public double getId() {
		return id;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("�˺ţ�"+id+",");
		sb.append("������:"+extramoney+".");
		return sb.toString();
	}
}
public class pro3{
	public static void main(String[] args) {
		Bankcard customer1 = new Bankcard(123456,1000);
		System.out.println(customer1);
	}
}
package ClassPro;


/**
 * 
 * @version 1.0
 * @author С����
 * @2018��8��27�� ����8:19:22
 * 
 * ************1����д���򣬶���һ��ְ���ࣨ���Ժ���Ϊ��������Ŀ���з��������ٶ���һ�������࣬
	 * ͨ����������Զ�ĳλְ�����м�н���н�������밴���������ṹ�ķ�ʽ���г�����ƣ������桢
	 * ���ܺͲ�������ֿ����壬����������������ְ����Ȼ�����ĳ��Ա���ļ�н���н������
 */
class worker{	//�������š����ʡ�
	String name;
	double money;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
}
class opworker extends worker{				
	/* ��ʼ���������ʣ����ü�н��н�ȳ�ʼ��  */
	public double  info(double m) {
		return this.money = m;
	}
	public double addMoney(Double m) {		//��н
		return this.money += m;
	}
	public double decreacemoney(double m) {					//�������ʼ�
		return this.money -= m;
	}
}

public class pro3_333 {
	public static void main(String[] args) {
		opworker С�� = new opworker();
		С��.info(3000);
		//����
		С��.addMoney(4000.0);
		System.out.println(С��.money);
	}
}

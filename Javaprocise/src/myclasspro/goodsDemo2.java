package myclasspro;

import java.util.Scanner;

/**
 * ������������
 * @version 1.0
 * @author С����
 * @2018��9��6�� ����10:14:59
 */
class Goods{
	private String name;
	private int id;
	private int amount;
	private float price;
	private static float realPrice;
	
	public Goods(){}
	public Goods(String name, int id, int amount, float price){//Ĭ�Ϲ���
		this.name = name;
		this.id = id;
		this.amount = amount;
		this.price = price;
		realPrice += amount * price;//�ϼƽ��
		float getShifuPrice;
	}
	public void inFo(){//��ʼ��
		System.out.println("**********************************");
		System.out.println("1.T-short    2.����Ь       3.������");
		System.out.println("**********************************"+"\n");
	}
	public float getRealPrice(){		//Ӧ�����
		return realPrice;
	}	
	public float toRealPrice(){			//ʵ�����
		int temp = -1;
		temp = (int) (this.getRealPrice() / 100);
		temp++;
		temp *=100; 
		return temp;
	}
	public float toExtraPrice(){		//����
		int temp = -1;
		temp = (int) (this.getRealPrice() / 100);
		temp++;
		temp *=100; 
		return temp-this.getRealPrice();
	}
	public void printOrder(Goods myGoods){
		System.out.println("Ӧ�����:"+myGoods.getRealPrice()+"��" );
		System.out.println("ʵ�����:"+myGoods.toRealPrice()+"��" );
		System.out.println("����:"+myGoods.toExtraPrice()+"��" );
	}
	public void whileAndSwitch(Goods myGoods){
		Scanner reader = new Scanner(System.in);
		while(true){
			System.out.printf("��������Ʒ���:");
			int id = reader.nextInt();
			System.out.printf("�����빺������:");
			int amount = reader.nextInt();
			int price = -1;
			if (id == 1) {
				price = 245;
				name = "T-short";
			}else if (id == 2) {
				price = 570;
				name = "����Ь";
			}else if (id == 3) {
				price = 250;
				name = "������";
			}else {
				System.out.println("û�и�ѡ�");
			}
			myGoods = new Goods(name, id, amount, price);
			System.out.println("�ϼƣ�"+myGoods.getRealPrice() +"��");
			System.out.printf("�Ƿ����(y/n)");
			char ch = reader.next().charAt(0);
			if (ch == 'n') {
				break;
			}
		}
	}
}
public class goodsDemo2 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String name = "��";
		Goods myGoods = new Goods();
		myGoods.inFo();
		myGoods.whileAndSwitch(myGoods);
		myGoods.printOrder(myGoods); 
}
}
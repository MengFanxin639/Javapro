package myclasspro;

import java.util.Scanner;

/**
 * ʵ����Ʒ����
 * @version 1.0
 * @author С����
 * @2018��9��6�� ����9:25:11
 */


public class GoodsDemo1 {
	public void printSwitch(){
		System.out.println("�Ƿ�μ��Żݻ������");
		System.out.println("1����50Ԫ����2Ԫ�������¿�������һƿ");
		System.out.println("2����100Ԫ����3Ԫ����500ml��������һƿ");
		System.out.println("3����100Ԫ����10Ԫ����5�������");
		System.out.println("4����100Ԫ����10Ԫ�ɻ���1���ղ������˹�");
		System.out.println("5����100Ԫ����20Ԫ����ŷ����ˬ��ˮһƿ");
		System.out.println("0��������");
	}
	
	public static void main(String[] args) {
		Scanner reader =new Scanner(System.in);
		String goodsName = "ɶҲû�У�";
		System.out.print("���������ѽ�");
		float payMoney = reader.nextFloat();
		GoodsDemo1 myGoods = new GoodsDemo1();
		myGoods.printSwitch();
		System.out.print("��ѡ��:");
		int chioce = reader.nextInt();
		switch (chioce) {
		case 1:if (payMoney < 50) {
			System.out.println("�����ѽ���50���޷��μӴ˻��");
		}else {
			payMoney += 2;
		}
			goodsName = "���¿���һƿ";
			break;
		case 2:if (payMoney < 100) {
			System.out.println("�����ѽ���100���޷��μӴ˻��");
		}else {
			payMoney += 3;
		}
			goodsName = "500ml��������һƿ";
			break;	
		case 3:if (payMoney < 100) {
			System.out.println("�����ѽ���100���޷��μӴ˻��");
		}else {
			payMoney += 10;
		}
			goodsName = "5�������";
			
			break;
		case 4:if (payMoney < 200) {
			System.out.println("�����ѽ���200���޷��μӴ˻��");
		}else {
			payMoney += 10;
		}
			goodsName = "1���ղ������˹�";
			break;
		case 5:if (payMoney < 200) {
			System.out.println("�����ѽ���200���޷��μӴ˻��");
		}else {
			payMoney += 20;
		}
			goodsName = "ŷ����ˬ��ˮһƿ";
			break;
		case 0:
			break;
		default:System.out.println("��������");
		}
		System.out.printf("���������ܽ��:" + "%.1f",payMoney);
		System.out.println();
		System.out.println("�ɹ�������  " + goodsName);
		
		
		
		
		
		
		
		
		
		
	}	
		
	}


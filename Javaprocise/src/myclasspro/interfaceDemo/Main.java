package myclasspro.interfaceDemo;

import java.util.Scanner;
/**
 * ������
 * @version 1.0
 * @author С����
 * @2018��11��14�� ����6:58:22
 */
public class Main {

	public static void main(String[] args) {

		User unKnowUser = null;
		Scanner reader = new Scanner(System.in);
		System.out.print("���������ѽ��:");
		double saveMoney = reader.nextDouble();
		System.out.println("��ͨ�û�1\tVIP2");
		int check = reader.nextInt();
		
		System.out.println("********��ӭ����********");
		if (1 == check ) {
			unKnowUser = new User("VIP�˲���", saveMoney);
		}else if (2 == check) {
			unKnowUser = new Vip("�����˲���", saveMoney);
		}else {
			System.out.println();
		}
		System.out.println(unKnowUser);
		System.out.println("********лл�ݹ�********");
	}

}

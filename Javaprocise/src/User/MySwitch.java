package User;

import java.util.Scanner;

public class MySwitch {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("������ɼ���");
		int score = input.nextInt();
		while(true){
			if (score>100) {
				System.out.println("���������ɣ�");
				break;}
		if (score>=90) {
			System.out.println("��ѧ���ɼ�Ϊ�ţ�");
			break;
		}if (score>=80) {
			System.out.println("��ѧ���ɼ�Ϊ����");
			break;
		}if (score>=70) {
			System.out.println("��ѧ���ɼ�Ϊ�У�");
			break;
		}if (score>=60) {
			System.out.println("��ѧ���ɼ��ϸ�");
			break;
		}if (score<60) {
			System.out.println("��ѧ���ɼ�������");
			break;
		}if (score<0) {
			System.out.println("���벻�Ϸ������������룡");
			continue;
		}
		}
	}}


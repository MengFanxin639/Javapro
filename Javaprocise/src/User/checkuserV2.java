package User;

import java.util.Scanner;

public class checkuserV2 {
	public static void main(String[] args) {
//		char[] ch={'A','B','C','D','E','F','G','H','I','J','K','L',
//				'M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};//0-25
//		char[] num={'0','1','2','3','4','5','6','7','8','9'};//0-8
//		
//		String check=Character.toString(ch[(int) (Math.random()*26)])
//				+Character.toString(num[(int)(Math.random()*9)])
//				+Character.toString(ch[(int) (Math.random()*26)])
//				+Character.toString(num[(int)(Math.random()*9)]);
		//���� �ַ�����λ�����
		char[] ch={'A','B','C','D','E','F','G','H','I','J','K','L',
				'M','N','O','P','Q','R','S','T','U','V','W','X','Y',
				'Z','0','1','2','3','4','5','6','7','8','9'};//0-35
		String check=Character.toString(ch[(int)(Math.random()*36)])
				+Character.toString(ch[(int)(Math.random()*36)])
				+Character.toString(ch[(int)(Math.random()*36)])
				+Character.toString(ch[(int)(Math.random()*36)]);
		System.out.println(check);
		Scanner reader=new Scanner(System.in);
		System.out.print("��������֤�룺");
		String str=reader.next();
		if (!str.equals(check)) System.err.println("��֤ʧ�ܣ�");
		else System.out.println("��֤�ɹ�!");
	}
}

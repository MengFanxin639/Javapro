package User;

import java.util.Scanner;

/**
 * ��֤������--��֤����
 * @version 1.0
 * @author С����
 * @2018��9��18�� ����1:30:45
 */
public class checkuserV1 {
	public static void main(String[] args) {
		char[] ch={'A','B','C','D','E','F','G','H','I','J','K','L',
				'M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};//0-25
		char[] num={'0','1','2','3','4','5','6','7','8','9'};//0-8
		
		String check=Character.toString(ch[(int) (Math.random()*26)])
				+Character.toString(num[(int)(Math.random()*9)])
				+Character.toString(ch[(int) (Math.random()*26)])
				+Character.toString(num[(int)(Math.random()*9)]);
		System.out.println(check);
		Scanner reader=new Scanner(System.in);
		System.out.print("��������֤�룺");
		String str=reader.next();
		if (!str.equals(check)) System.err.println("��֤ʧ�ܣ�");
		else System.out.println("��֤�ɹ�!");
			
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}

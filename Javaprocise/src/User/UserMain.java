package User;
/**
 * 
 */
import java.util.Scanner;

public class UserMain {
	public static void main(String[] args) {
		
	
	//���´���ʵ���û�ע��
	Scanner input = new Scanner(System.in);
//	System.out.println("�������û�����");
//	String userName = input.next();
	System.out.println("���������룺");
	String password = input.next();
	System.out.println(StringUtil.validatePassword(password));
	 
//	String password = input.next();
//	System.out.println("��������������ַ��");
//	String email = input.next();
			
	
	}
}
package studentManageSystemDemo;

import java.util.Scanner;

/**
 * ����ϵͳ����-�ܿ��ƽ���
 * @version 1.0
 * @author С����
 * @2018��10��8�� ����10:41:46
 */
public class ManageSystemViewConsole{
	private Scanner reader;

	
	public ManageSystemViewConsole() {
		while(true){
		String choice = startView();
		switch(choice){
		case "1"://�����
			new ManagerView();
			break;
		case "2"://ѧ����
			new UserView();
			break;
		case "3"://ע��
			new CreatStudentView();
			break;
		default:
			continue;
			}
		}
	}
	
	/**
	 * ��������
	 * @return ѡ����ݵ�¼
	 */
	public String startView(){
		reader = new Scanner(System.in);
		System.out.println("**********************************************************");
		System.out.println("��ӭʹ�á�"+Dates.systemName+"��ϵͳ");
		System.out.println("1.����Ա��¼\t\t2.ѧ����¼\t\t3.ѧ��ע��");
		System.out.println("**********************************************************");
		System.out.print("��ѡ��:");
		return reader.next();
	}
	
	 
	
	 
	
	 
	
	 
	
}

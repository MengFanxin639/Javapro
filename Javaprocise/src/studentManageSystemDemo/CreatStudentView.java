package studentManageSystemDemo;

import java.util.Scanner;

public class CreatStudentView {
	private StudentBiz sBiz;
	private Scanner reader;
	private Student student;
	
	
	
	/**
	 * ѧ��ע�����
	 */
	public CreatStudentView(){
		student = new Student();
		sBiz = new StudentBiz();
		reader = new Scanner(System.in);
		//����һ�µ�Ĭ���˺�
		System.out.println("����Ĭ���˺���:"+sBiz.addDefalutId());
		System.out.print("���Լ�ȡ������");
		String newName = reader.next();
		System.out.print("�������ʼ����:");
		String newPassword  =reader.next();
		student.setId(sBiz.addDefalutId());
		student.setPassword(newPassword);
		student.setName(newName);
		if (sBiz.addStudent(student)) {
			System.out.println("�ɹ�ע�ᣡ");
		}else{
			System.out.println("ע��ʧ�ܣ�");
		}
		new ManageSystemViewConsole();
	}

}

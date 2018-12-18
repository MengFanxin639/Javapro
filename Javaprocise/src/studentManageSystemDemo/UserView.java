package studentManageSystemDemo;

import java.util.Scanner;


/**
 * ѧ���˽���-����ѧ��ע�����
 * @version 1.0
 * @author С����
 * @2018��10��9�� ����1:17:40
 */
public class UserView extends AbstractStudentView{
	private StudentBiz sBiz ;
	private Scanner reader;
	private Student student;
	
	
	
	public UserView() {
		Student loginStudent = LoginView();
		if (loginStudent == null) {
			System.out.println("��¼ʧ�ܣ�");
			new ManageSystemViewConsole();
		}else {//��¼�ɹ�
			while(true){
			String choice = showMainView();
			if (choice.equals("#")) {
				new ManageSystemViewConsole();
			}else {
				doMainView(choice,loginStudent);
			}
			
			}
		}
	}
	
	/**
	 * �鿴�ɼ�
	 * @param loginStudent
	 */
	public void showMyScoreView(Student loginStudent){
		System.out.println("��ѧ�ɼ�:"+loginStudent.getMath());
	}
	 

	/**
	 * ��ʾid���������,�ɼ�
	 * @param loginStudent
	 */
	private void showMyInfomationView(Student loginStudent) {
		System.out.println("�˺�:"+loginStudent.getId()+"\t"+
				"����:"+loginStudent.getPassword()+"\t"+
				"�û���:"+loginStudent.getName()+"\t"+
				"��ѧ�ɼ�:"+loginStudent.getMath());
	}

	/**
	 * �޸��û�������
	 * @param loginStudent
	 */
	private void modifyMyIdView(Student loginStudent) {
		reader = new Scanner(System.in);
		sBiz = new StudentBiz();
		System.out.println("���������û���:");
		String newName = reader.next();
		if (sBiz.modifyName(newName, loginStudent)) {
			System.out.println("�޸ĳɹ���");
		}else {
			System.out.println("�޸�ʧ�ܣ�");
		}
	}

	 

	/**
	 * �޸��������
	 * @param loginStudent
	 */
	@Override
	public void modifyPasswordView(Student loginStudent) {
		reader = new Scanner(System.in);
		sBiz = new StudentBiz();
		System.out.println("������������:");
		String newPassword = reader.next();
		if (sBiz.modifyPassword(newPassword, loginStudent.getId())) {
			System.out.println("�޸ĳɹ���");
		}else {
			System.out.println("�޸�ʧ�ܣ�");
		}
		
	}

	/**
	 * ��ʾ���ܽ���
	 * @return ����ѡ��
	 */
	@Override
	public String showMainView() {
		reader = new Scanner(System.in);
		System.out.println();
		System.out.println(Dates.systemName+"����ϵͳ>> ���˵�(#�˳�)");
		System.out.println("1.�޸�����\t2.�鿴�ɼ�\t3.�ҵ���Ϣ\t4.�޸��û��� ");
		System.out.println("��ѡ��:");
		return reader.next();
	}

	/**
	 * ��½����
	 * @return ��½���û�
	 */
	@Override
	public Student LoginView() {
		reader = new Scanner(System.in);
		sBiz = new StudentBiz();
		System.out.print("�������˺�:");
		String id = reader.next();
		System.out.print("����������:");
		String password = reader.next();
		student = sBiz.findById(id);
		if (student == null) {
			System.out.println("û�и��û�����");
		}else {
			if (sBiz.checkPassword(password)) {
				System.out.println("��¼�ɹ���");
				return student;
			}else {
				return null;
			}
		}
		return student;
	}

	/**
	 * 
	 * @param choice ����ѡ��
	 * @param loginStudent ��¼���û�
	 */
	@Override
	public void doMainView(String choice, Student loginStudent) {
		switch (choice) {
		case "1":
			modifyPasswordView(loginStudent);
			break;
		case "2":
			showMyScoreView(loginStudent);
			break;
		case "3":
			showMyInfomationView(loginStudent);
			break;
		case "4":
			modifyMyIdView(loginStudent);
			break;
		default:
			System.out.println("��������~");
			showMainView();
		}
		
	}
	
	
	
	/*-*************************************************/
	 
	
	@Override
	public void modifyPasswordView() {}

	 
}

package studentManageSystemDemo;

import java.util.Scanner;

/**
 * ����˽���
 * @version 1.0
 * @author С����
 * @2018��10��9�� ����1:19:15
 */
public class ManagerView {
	private StudentBiz sBiz ;
	private Scanner reader;
	private Student student;
	private Manager manager;
	
	public ManagerView() {
		manager = LoginView();
		if (manager == null) {
			System.out.println("��֤ʧ�ܣ�");
			new ManageSystemViewConsole();
			}
		else 
			while(true){
				String choice = showMainView();
				if ("#".equals(choice)) {
					new ManageSystemViewConsole();
					
				}
				doMainView(choice);
			}
	}
	
	/**
	 * ��½-���صõ�����Ա
	 */
	public Manager LoginView() {
		reader = new Scanner(System.in);
		System.out.print("�������˺�:");
		String id = reader.next();
		System.out.print("����������:");
		String password = reader.next();
		if (Dates.IamManager.getId().equals(id) && Dates.IamManager.getPassword().equals(password)) {
			System.out.println("��֤ͨ����");
			return Dates.IamManager;
		}
		else
		return null;
	}
	
	/**
	 * ��ʾ����ѡ�����
	 * @return ѡ��Ĺ���
	 */
	public String showMainView() {
		reader = new Scanner(System.in);
		String choice = null;
		System.out.println();
		System.out.println(Dates.systemName+"����ϵͳ>> ���˵�(#�˳�)");
		System.out.println("1.ɾ��ѧ��\t2.���ѧ��\t3.�޸�����\t4.�޸���ѧ�ɼ�\t5.�鿴ѧ����Ϣ");
		System.out.print("��ѡ��:");
		choice = reader.next();
		return choice;
	}
	
	/**
	 * ��ʾ���е�ѧ����Ϣ����
	 * @param students
	 */
	public void showStudentsView(Student ...studentArray) {
		sBiz = new StudentBiz();
		System.out.println("ѧ��\t\t����\t\t����\t\t��ѧ�ɼ�");
		if (studentArray == null) {
			studentArray = Dates.studentStore;
		}
		int studentCount = sBiz.getStudentCount(studentArray);
		for(int i = 0;i < studentCount; i++){
			System.out.println(
					studentArray[i].getId()+"\t"+
					studentArray[i].getName()+"\t\t"+
					studentArray[i].getPassword()+"\t\t"+
					studentArray[i].getMath());
		}
	}
	
	/**
	 * ���ѧ�����ֿ����
	 */
	public void addStudentView() {
		sBiz = new StudentBiz();
		reader = new Scanner(System.in);
		System.out.print("������ѧ��ѧ��:");
		String id = reader.next();
		if (!sBiz.checkSameId(id)) {
			System.out.println("�Ѿ��и��û���");
			addStudentView();
		}else{
			System.out.print("������ѧ������:");
		String name = reader.next();
		System.out.print("������ѧ����ʼ����:");
		String password = reader.next();
		System.out.print("������ѧ����ѧ�ɼ�:");
		double math = reader.nextDouble();
		
		Student newStudent = new Student(id, name, password, math);
		if(sBiz.addStudent(newStudent)){
			System.out.println("��ӳɹ���");
		}else {
			System.out.println("���ʧ��!");
		}
		}
	}
	
	/**
	 * �Ӳֿ���ɾ��ѧ������
	 */
	public void delStudentView() {
		sBiz = new StudentBiz();
		reader = new Scanner(System.in);
		System.out.print("������ɾ��ѧ����ѧ��:");
		String id = reader.next();
		student = sBiz.findById(id);
		if (student == null) {
			System.out.println("û�и�ѧ����");
		}else {
			if (sBiz.delStudent(student)) {
				System.out.println("ɾ���ɹ���");
		}else {
			System.out.println("ɾ��ʧ�ܣ�");
			}
		}
	}
	
	/**
	 * �޸���ѧ����
	 */
	public void modifyMathView() {
		sBiz = new StudentBiz();
		reader = new Scanner(System.in);
		System.out.print("�������˺�:");
		String studentId = reader.next();
		if ((student = sBiz.findById(studentId)) == null) {
			System.out.println("û�и��˺ţ�");
		}else {
			System.out.print("��������ѧ�ɼ�:");
			double mathScore = reader.nextDouble();
			if (sBiz.modifyMath(mathScore, studentId)) {
				System.out.println("�޸ĳɹ���");
			}else {
				System.out.println("�޸�ʧ�ܣ�");
			}
			
		}
	}
	
	/**
	 * �޸��������
	 */
	public void modifyPasswordView() {
		sBiz = new StudentBiz();
		reader = new Scanner(System.in);
		System.out.print("�������˺�:");
		String studentId = reader.next();
		if ((student = sBiz.findById(studentId)) == null) {
			System.out.println("û�и��˺ţ�");
		}else {
			System.out.print("����������:");
			String newPassword = reader.next();
			if (sBiz.modifyPassword(newPassword, studentId)) {
				System.out.println("�޸ĳɹ���");
			}else{
				System.out.println("�޸�ʧ�ܣ�");
			}
			
		}
		
	}
	
	/**
	 * ����Ա���ܽ���
	 * @param choice
	 */
	public void doMainView(String choice) {
		switch (choice) {
		case "1":
			delStudentView();
			break;
		case "2":
			addStudentView();
			break;
		case "3":
			modifyPasswordView();
			break;
		case "4":
			modifyMathView();
			break;
		case "5":
			showStudentsView(Dates.studentStore);
			break;
		default:
			break;
		}
	}
	
	
	
	
	
	
}

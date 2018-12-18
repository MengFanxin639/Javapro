package studentManageSystemDemo;

import java.util.Scanner;

/**
 * 管理端界面
 * @version 1.0
 * @author 小新新
 * @2018年10月9日 下午1:19:15
 */
public class ManagerView {
	private StudentBiz sBiz ;
	private Scanner reader;
	private Student student;
	private Manager manager;
	
	public ManagerView() {
		manager = LoginView();
		if (manager == null) {
			System.out.println("验证失败！");
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
	 * 登陆-返回得到管理员
	 */
	public Manager LoginView() {
		reader = new Scanner(System.in);
		System.out.print("请输入账号:");
		String id = reader.next();
		System.out.print("请输入密码:");
		String password = reader.next();
		if (Dates.IamManager.getId().equals(id) && Dates.IamManager.getPassword().equals(password)) {
			System.out.println("验证通过！");
			return Dates.IamManager;
		}
		else
		return null;
	}
	
	/**
	 * 显示功能选择界面
	 * @return 选择的功能
	 */
	public String showMainView() {
		reader = new Scanner(System.in);
		String choice = null;
		System.out.println();
		System.out.println(Dates.systemName+"管理系统>> 主菜单(#退出)");
		System.out.println("1.删除学生\t2.添加学生\t3.修改密码\t4.修改数学成绩\t5.查看学生信息");
		System.out.print("请选择:");
		choice = reader.next();
		return choice;
	}
	
	/**
	 * 显示所有的学生信息界面
	 * @param students
	 */
	public void showStudentsView(Student ...studentArray) {
		sBiz = new StudentBiz();
		System.out.println("学号\t\t姓名\t\t密码\t\t数学成绩");
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
	 * 添加学生到仓库界面
	 */
	public void addStudentView() {
		sBiz = new StudentBiz();
		reader = new Scanner(System.in);
		System.out.print("请输入学生学号:");
		String id = reader.next();
		if (!sBiz.checkSameId(id)) {
			System.out.println("已经有该用户！");
			addStudentView();
		}else{
			System.out.print("请输入学生姓名:");
		String name = reader.next();
		System.out.print("请输入学生初始密码:");
		String password = reader.next();
		System.out.print("请输入学生数学成绩:");
		double math = reader.nextDouble();
		
		Student newStudent = new Student(id, name, password, math);
		if(sBiz.addStudent(newStudent)){
			System.out.println("添加成功！");
		}else {
			System.out.println("添加失败!");
		}
		}
	}
	
	/**
	 * 从仓库中删除学生界面
	 */
	public void delStudentView() {
		sBiz = new StudentBiz();
		reader = new Scanner(System.in);
		System.out.print("请输入删除学生的学号:");
		String id = reader.next();
		student = sBiz.findById(id);
		if (student == null) {
			System.out.println("没有该学生！");
		}else {
			if (sBiz.delStudent(student)) {
				System.out.println("删除成功！");
		}else {
			System.out.println("删除失败！");
			}
		}
	}
	
	/**
	 * 修改数学界面
	 */
	public void modifyMathView() {
		sBiz = new StudentBiz();
		reader = new Scanner(System.in);
		System.out.print("请输入账号:");
		String studentId = reader.next();
		if ((student = sBiz.findById(studentId)) == null) {
			System.out.println("没有该账号！");
		}else {
			System.out.print("请输入数学成绩:");
			double mathScore = reader.nextDouble();
			if (sBiz.modifyMath(mathScore, studentId)) {
				System.out.println("修改成功！");
			}else {
				System.out.println("修改失败！");
			}
			
		}
	}
	
	/**
	 * 修改密码界面
	 */
	public void modifyPasswordView() {
		sBiz = new StudentBiz();
		reader = new Scanner(System.in);
		System.out.print("请输入账号:");
		String studentId = reader.next();
		if ((student = sBiz.findById(studentId)) == null) {
			System.out.println("没有该账号！");
		}else {
			System.out.print("请输入密码:");
			String newPassword = reader.next();
			if (sBiz.modifyPassword(newPassword, studentId)) {
				System.out.println("修改成功！");
			}else{
				System.out.println("修改失败！");
			}
			
		}
		
	}
	
	/**
	 * 管理员功能界面
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

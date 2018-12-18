package studentManageSystemDemo;

import java.util.Scanner;


/**
 * 学生端界面-包含学生注册界面
 * @version 1.0
 * @author 小新新
 * @2018年10月9日 下午1:17:40
 */
public class UserView extends AbstractStudentView{
	private StudentBiz sBiz ;
	private Scanner reader;
	private Student student;
	
	
	
	public UserView() {
		Student loginStudent = LoginView();
		if (loginStudent == null) {
			System.out.println("登录失败！");
			new ManageSystemViewConsole();
		}else {//登录成功
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
	 * 查看成绩
	 * @param loginStudent
	 */
	public void showMyScoreView(Student loginStudent){
		System.out.println("数学成绩:"+loginStudent.getMath());
	}
	 

	/**
	 * 显示id，密码界面,成绩
	 * @param loginStudent
	 */
	private void showMyInfomationView(Student loginStudent) {
		System.out.println("账号:"+loginStudent.getId()+"\t"+
				"密码:"+loginStudent.getPassword()+"\t"+
				"用户名:"+loginStudent.getName()+"\t"+
				"数学成绩:"+loginStudent.getMath());
	}

	/**
	 * 修改用户名界面
	 * @param loginStudent
	 */
	private void modifyMyIdView(Student loginStudent) {
		reader = new Scanner(System.in);
		sBiz = new StudentBiz();
		System.out.println("请输入新用户名:");
		String newName = reader.next();
		if (sBiz.modifyName(newName, loginStudent)) {
			System.out.println("修改成功！");
		}else {
			System.out.println("修改失败！");
		}
	}

	 

	/**
	 * 修改密码界面
	 * @param loginStudent
	 */
	@Override
	public void modifyPasswordView(Student loginStudent) {
		reader = new Scanner(System.in);
		sBiz = new StudentBiz();
		System.out.println("请输入新密码:");
		String newPassword = reader.next();
		if (sBiz.modifyPassword(newPassword, loginStudent.getId())) {
			System.out.println("修改成功！");
		}else {
			System.out.println("修改失败！");
		}
		
	}

	/**
	 * 显示功能界面
	 * @return 功能选择
	 */
	@Override
	public String showMainView() {
		reader = new Scanner(System.in);
		System.out.println();
		System.out.println(Dates.systemName+"管理系统>> 主菜单(#退出)");
		System.out.println("1.修改密码\t2.查看成绩\t3.我的信息\t4.修改用户名 ");
		System.out.println("请选择:");
		return reader.next();
	}

	/**
	 * 登陆界面
	 * @return 登陆的用户
	 */
	@Override
	public Student LoginView() {
		reader = new Scanner(System.in);
		sBiz = new StudentBiz();
		System.out.print("请输入账号:");
		String id = reader.next();
		System.out.print("请输入密码:");
		String password = reader.next();
		student = sBiz.findById(id);
		if (student == null) {
			System.out.println("没有该用户名！");
		}else {
			if (sBiz.checkPassword(password)) {
				System.out.println("登录成功！");
				return student;
			}else {
				return null;
			}
		}
		return student;
	}

	/**
	 * 
	 * @param choice 功能选择
	 * @param loginStudent 登录的用户
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
			System.out.println("输入有误~");
			showMainView();
		}
		
	}
	
	
	
	/*-*************************************************/
	 
	
	@Override
	public void modifyPasswordView() {}

	 
}

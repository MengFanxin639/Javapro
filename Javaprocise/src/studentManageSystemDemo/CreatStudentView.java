package studentManageSystemDemo;

import java.util.Scanner;

public class CreatStudentView {
	private StudentBiz sBiz;
	private Scanner reader;
	private Student student;
	
	
	
	/**
	 * 学生注册界面
	 */
	public CreatStudentView(){
		student = new Student();
		sBiz = new StudentBiz();
		reader = new Scanner(System.in);
		//设置一致的默认账号
		System.out.println("您的默认账号是:"+sBiz.addDefalutId());
		System.out.print("给自己取个名吧");
		String newName = reader.next();
		System.out.print("请输入初始密码:");
		String newPassword  =reader.next();
		student.setId(sBiz.addDefalutId());
		student.setPassword(newPassword);
		student.setName(newName);
		if (sBiz.addStudent(student)) {
			System.out.println("成功注册！");
		}else{
			System.out.println("注册失败！");
		}
		new ManageSystemViewConsole();
	}

}

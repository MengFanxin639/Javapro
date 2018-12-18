package studentManageSystemDemo;

import java.util.Scanner;

/**
 * 管理系统界面-总控制界面
 * @version 1.0
 * @author 小新新
 * @2018年10月8日 下午10:41:46
 */
public class ManageSystemViewConsole{
	private Scanner reader;

	
	public ManageSystemViewConsole() {
		while(true){
		String choice = startView();
		switch(choice){
		case "1"://管理端
			new ManagerView();
			break;
		case "2"://学生端
			new UserView();
			break;
		case "3"://注册
			new CreatStudentView();
			break;
		default:
			continue;
			}
		}
	}
	
	/**
	 * 启动界面
	 * @return 选择身份登录
	 */
	public String startView(){
		reader = new Scanner(System.in);
		System.out.println("**********************************************************");
		System.out.println("欢迎使用《"+Dates.systemName+"》系统");
		System.out.println("1.管理员登录\t\t2.学生登录\t\t3.学生注册");
		System.out.println("**********************************************************");
		System.out.print("请选择:");
		return reader.next();
	}
	
	 
	
	 
	
	 
	
	 
	
}

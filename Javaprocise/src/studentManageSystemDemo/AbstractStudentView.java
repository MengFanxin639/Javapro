package studentManageSystemDemo;

/**
 * 抽象类，定义了一些管理界面的方法
 * @version 1.0
 * @author 小新新
 * @2018年10月8日 下午3:07:38
 */
public abstract class AbstractStudentView {

	
	
	/**
	 * 学生端改密码界面
	 */
	public abstract void modifyPasswordView(Student student);
	/**
	 * 管理端修改任意对象密码界面
	 */
	public abstract void modifyPasswordView();
	
	/**
	 * 显示菜单
	 * @return 返回选择
	 */
	public abstract String showMainView();
	
	/**
	 * 学生端登录界面
	 * @return 
	 * @return成功登录返回true
	 */
	public abstract Student LoginView();
	
	
	public abstract void doMainView(String choice, Student loginStudent);
	
	
	
}
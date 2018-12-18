package studentManageSystemDemo;
/**
 * 学生实体类-唯一学号（账号）、姓名、登录密码、数学成绩、英语成绩、计算机成绩
 * @version 1.0
 * @author 小新新
 * @2018年10月8日 下午12:26:44
 */
public class Student {
	private String id;	//唯一学号（账号）
	private String name;
	private String password;
	private double math;
	
	
	public Student() {
		// TODO 自动生成的构造函数存根
	}
	
	public Student(String id, String name, String password, double math) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.math = math;
		
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public double getMath() {
		return math;
	}
	public void setMath(double math) {
		this.math = math;
	}
	
	
}

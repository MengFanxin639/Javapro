package studentManageSystemDemo;
/**
 * ѧ��ʵ����-Ψһѧ�ţ��˺ţ�����������¼���롢��ѧ�ɼ���Ӣ��ɼ���������ɼ�
 * @version 1.0
 * @author С����
 * @2018��10��8�� ����12:26:44
 */
public class Student {
	private String id;	//Ψһѧ�ţ��˺ţ�
	private String name;
	private String password;
	private double math;
	
	
	public Student() {
		// TODO �Զ����ɵĹ��캯�����
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

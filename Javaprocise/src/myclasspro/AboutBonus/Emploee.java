package myclasspro.AboutBonus;
/**
 * Ա����Ա������3�����ԣ������������Լ����ʡ�
 * @version 1.0
 * @author С����
 * @2018��10��31�� ����11:54:02
 */
public class Emploee {
	private String name;
	private String id;
	private double salary;
	
	
	
	public Emploee(String name, String id, double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("����ְ��"+getName()+"\t");
		sb.append("�ҵĹ�����"+getId()+"\t");
		sb.append("����нΪ "+getSalary()+"��"+"\t");
		return sb.toString();
	}
	
}

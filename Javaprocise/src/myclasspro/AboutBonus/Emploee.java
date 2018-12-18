package myclasspro.AboutBonus;
/**
 * 员工类员工包含3个属性：姓名、工号以及工资。
 * @version 1.0
 * @author 小新新
 * @2018年10月31日 上午11:54:02
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
		sb.append("我是职工"+getName()+"\t");
		sb.append("我的工号是"+getId()+"\t");
		sb.append("我月薪为 "+getSalary()+"￥"+"\t");
		return sb.toString();
	}
	
}

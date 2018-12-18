package myclasspro.AboutBonus;
/**
 * 经理类--经理有姓名、工号、工资，还有奖金属性
 * @version 1.0
 * @author 小新新
 * @2018年10月31日 上午11:56:18
 */
public class Manager extends Emploee{

	double bonus;
	
	public Manager(String name, String id, double salary, double bonus) {
		super(name, id, salary);
		this.bonus=bonus;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("我是经理"+getName()+"\t");
		sb.append("我的工号是"+getId()+"\t");
		sb.append("我月薪为 "+getSalary()+"￥"+"\t");
		sb.append("我还有奖金"+getBonus()+"￥"+"\t");
		return sb.toString();
	}
	
}

package myclasspro.interfaceDemo;
/**
 * 普通用户类，没有优惠
 * @version 1.0
 * @author 小新新
 * @2018年11月14日 上午11:22:48
 */
public class User implements ISave{
	private String name;
	private double saveMoney;
	
	public User(String name, double saveMoney) {
		this.name = name;
		this.saveMoney = saveMoney;
	}
	
	@Override
	public double save() {
		return saveMoney;
	}
	
	@Override
	public String toString() {
		StringBuilder sBuilder = new StringBuilder();
		sBuilder.append("您是普通用户，没有优惠，共计消费" + save() + "￥");
		return sBuilder.toString();
	}
	
	
	
	
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSaveMoney() {
		return saveMoney;
	}
	public void setSaveMoney(double saveMoney) {
		this.saveMoney = saveMoney;
	}


	
}

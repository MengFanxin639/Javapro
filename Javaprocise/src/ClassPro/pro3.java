package ClassPro;



/**
 * 
 * @version 1.0
 * @author 小新新
 * @param <bank>
 * @param <bank>
 * @2018年8月25日 下午6:37:03
 * 
 * ******定义一个类实现银行帐户的概念，包括的变量有"帐号"和"存款余额"，包括的方法有"存款"、"取款"、
 * 		"查询余额"和”显示帐号”，。定义主类，
 *		创建帐户类的对象，并完成相应操作。
 */
class Bankcard{
	private int id;					//账号
	private double extramoney;		//存款余额
	
	public Bankcard() {
	}
	public Bankcard(int id) {
		this.id = id;
	}
	public Bankcard(double extramoney) {
		this.extramoney = extramoney;
	}
	public Bankcard(int id,double extramoney) {
		this(id);
		this.extramoney = extramoney;
	}
	public Bankcard(int id,int extramoney) {
		this(id);
		this.extramoney = extramoney;
	}
	public Bankcard infomoney(int id, double extramoney) {		//初始化
		this.id = id;
		this.extramoney = extramoney;
		return this;
	}
	public double setmoney(double a) {						//存款
		extramoney += a;
		return extramoney;
	}
	public double savamoney(double a) {						//取款
		extramoney -= a;
		return extramoney;
	}
	public double getExtramoney() {
		return extramoney;
	}
	public double getId() {
		return id;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("账号："+id+",");
		sb.append("存款余额:"+extramoney+".");
		return sb.toString();
	}
}
public class pro3{
	public static void main(String[] args) {
		Bankcard customer1 = new Bankcard(123456,1000);
		System.out.println(customer1);
	}
}
package myclasspro.interfaceDemo;
/**
 * VIP-可以打折
 * @version 1.0
 * @author 小新新
 * @2018年11月14日 上午11:27:08
 */
public class Vip extends User{
	
	
	public Vip(String name, double saveMoney) {
		super(name, saveMoney);
	}
	
	@Override
	public double save() {
		return getSaveMoney() * discount;
	}

	@Override
	public String toString() {
		StringBuilder sBuilder = new StringBuilder();
		sBuilder.append("您是VIP用户，可享受九折优惠！共计消费" + save() + "￥");
		return sBuilder.toString();
	}
}

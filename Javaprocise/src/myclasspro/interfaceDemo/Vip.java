package myclasspro.interfaceDemo;
/**
 * VIP-���Դ���
 * @version 1.0
 * @author С����
 * @2018��11��14�� ����11:27:08
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
		sBuilder.append("����VIP�û��������ܾ����Żݣ���������" + save() + "��");
		return sBuilder.toString();
	}
}

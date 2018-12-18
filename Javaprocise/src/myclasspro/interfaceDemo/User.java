package myclasspro.interfaceDemo;
/**
 * ��ͨ�û��࣬û���Ż�
 * @version 1.0
 * @author С����
 * @2018��11��14�� ����11:22:48
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
		sBuilder.append("������ͨ�û���û���Żݣ���������" + save() + "��");
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

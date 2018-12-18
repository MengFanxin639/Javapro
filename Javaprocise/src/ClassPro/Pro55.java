package ClassPro;

/* 2.有一银行系统内，存在有客户类，客户类保存客户基本信息，由客户类派生出普通账户了，
普通账户可以实现存取款。再由普通账户类派生出信用卡类（注意：普通账户类和信用卡类的区别是
取款时信用卡可以透支，但普通账户不可以），要求在继承中要使用方法的覆盖。 */
/**
 * 
 * @version 1.0
 * @author 小新新
 * @2018年9月2日 下午9:44:29
 */
class customer{		//客户类	 基本信息-客户名
	private int cardId;
	private String userName;
	public int getCardId() {
		return cardId;
	}
	public void setCardId(int cardId) {
		this.cardId = cardId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
}
class user extends customer{			//普通账户-存取款
	private double moneyOfCard;

	public double getMoneyOfCard() {
		return moneyOfCard;
	}

	public void setMoneyOfCard(double moneyOfCard) {
		if (moneyOfCard < 0) {
			moneyOfCard = 0;
		}
		this.moneyOfCard = moneyOfCard;
	}
}
class strUser extends user{				//信用卡类-可以透支
	private double moneyOfCard;

	public void setMoneyOfCard(double moneyOfCard) {
		this.moneyOfCard = moneyOfCard;
	}
	public double getMoneyOfCard() {
		return moneyOfCard;
	}
}

public class Pro55 {
	public static void main(String[] args) {
		strUser 信用卡 = new strUser();
		信用卡.setCardId(123456);
		信用卡.setUserName("凡心");
		信用卡.setMoneyOfCard(100000);
		System.out.println(信用卡.getCardId());
		System.out.println(信用卡.getUserName());
		System.out.println(信用卡.getMoneyOfCard());
	}
}

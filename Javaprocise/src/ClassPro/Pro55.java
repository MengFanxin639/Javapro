package ClassPro;

/* 2.��һ����ϵͳ�ڣ������пͻ��࣬�ͻ��ౣ��ͻ�������Ϣ���ɿͻ�����������ͨ�˻��ˣ�
��ͨ�˻�����ʵ�ִ�ȡ�������ͨ�˻������������ÿ��ࣨע�⣺��ͨ�˻�������ÿ����������
ȡ��ʱ���ÿ�����͸֧������ͨ�˻������ԣ���Ҫ���ڼ̳���Ҫʹ�÷����ĸ��ǡ� */
/**
 * 
 * @version 1.0
 * @author С����
 * @2018��9��2�� ����9:44:29
 */
class customer{		//�ͻ���	 ������Ϣ-�ͻ���
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
class user extends customer{			//��ͨ�˻�-��ȡ��
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
class strUser extends user{				//���ÿ���-����͸֧
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
		strUser ���ÿ� = new strUser();
		���ÿ�.setCardId(123456);
		���ÿ�.setUserName("����");
		���ÿ�.setMoneyOfCard(100000);
		System.out.println(���ÿ�.getCardId());
		System.out.println(���ÿ�.getUserName());
		System.out.println(���ÿ�.getMoneyOfCard());
	}
}

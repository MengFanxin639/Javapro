package myclasspro;


/**
 * ҵ����Ļ�������
 * @version 1.0
 * @author С����
 * @2018��10��7�� ����5:32:54
 */
public class BankBiz {
	private BankCard bankCard = new BankCard();
	
	
		/**
		 * ����
		 * @param account ��������
		 */
		public void saveAccount(double account) {
			bankCard.setAccount(account + bankCard.getAccount());
		}
		
		/**
		 * ȡ���
		 * @param account
		 * @return ���㷵��false
		 */
		public boolean outAccount(double account) {
			if (bankCard.getAccount()-account < 0) {
				return false;
			}else
				bankCard.setAccount(bankCard.getAccount()-account);
			return true;
		}
		
		/**
		 * ��ǰ���
		 * @return 
		 */
		public double showAccount() {
			return bankCard.getAccount();
		}
		
		/**
		 * ��ʾ�˺�
		 * @return 
		 */
		public String showId() {
			return bankCard.getId();
		}
		
		/**
		 * ��bankCard�������
		 * @param bCard
		 * @return 
		 * @return �ɹ���ӷ���true
		 */
		public boolean add (String id,String password,double account){
			if (id == null || password == null) {
				return false;
			}
			bankCard.setId(id);
			bankCard.setPassword(password);
			bankCard.setAccount(account);
			return true;
		}
		 
		
		
}

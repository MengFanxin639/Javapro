package myclasspro;


/**
 * 业务类的基本操作
 * @version 1.0
 * @author 小新新
 * @2018年10月7日 下午5:32:54
 */
public class BankBiz {
	private BankCard bankCard = new BankCard();
	
	
		/**
		 * 存款方法
		 * @param account 传入存款金额
		 */
		public void saveAccount(double account) {
			bankCard.setAccount(account + bankCard.getAccount());
		}
		
		/**
		 * 取款方法
		 * @param account
		 * @return 余额不足返回false
		 */
		public boolean outAccount(double account) {
			if (bankCard.getAccount()-account < 0) {
				return false;
			}else
				bankCard.setAccount(bankCard.getAccount()-account);
			return true;
		}
		
		/**
		 * 当前余额
		 * @return 
		 */
		public double showAccount() {
			return bankCard.getAccount();
		}
		
		/**
		 * 显示账号
		 * @return 
		 */
		public String showId() {
			return bankCard.getId();
		}
		
		/**
		 * 把bankCard对象加入
		 * @param bCard
		 * @return 
		 * @return 成功添加返回true
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

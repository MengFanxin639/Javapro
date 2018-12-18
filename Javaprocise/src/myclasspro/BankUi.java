package myclasspro;

import java.util.Scanner;
/**
 * 图形界面类-包含功能选择界面、主界面
 * @version 1.0
 * @author 小新新
 * @2018年10月7日 下午7:39:24
 */
public class BankUi {
	private Scanner reader = new Scanner(System.in);
	private BankBiz bankBiz = new BankBiz();
	
	/**
	 * 功能选择界面
	 */
	public BankUi() {
		 
			System.out.print("请输入账号:");
			String id = reader.next();
			System.out.print("请输入密码:");
			String password = reader.next();
			bankBiz.add(id, password, 0);
		System.out.println("1.存款"+ "\t"+"2.取款"+ "\t"+
		"3.查询余额"+ "\t"+"4.显示帐号");
	}
	
	
	/**
	 * 主界面
	 */
	public void showMainUi(){
		while(true){
			System.out.print("请选择:");
			int choose=reader.nextInt();
			switch (choose) {
			case 1:
				saveAccountView();
				break;
			case 2:
				outAccountView();
				break;
			case 3:
				showAccountView();
				break;
			case 4:
				showIdView();
				break;
			default:
				System.out.println("输入有误！");
				continue;
			}
		}
	}
	
	/**
	 * 存款界面
	 */
	public void saveAccountView(){
		System.out.println("请输入存款金额:");
		double inAccount=reader.nextDouble();
		bankBiz.saveAccount(inAccount);
	}
	
	/**
	 * 取款界面
	 */
	public void outAccountView(){
		System.out.println("请输入取款金额:");
		double outAccount=reader.nextDouble();
		if(bankBiz.outAccount(outAccount)){
			System.out.println("你已成功取出"+outAccount+"￥");
		}else {
			System.out.println("余额不足~取款失败！");
		}
	}
	
	/**
	 * 显示余额界面
	 */
	public void showAccountView(){
		System.out.println("当前余额:"+bankBiz.showAccount()+"￥" );
	}
	
	/**
	 * 显示账号界面
	 */
	public void showIdView(){
		System.out.println("当前账号:"+bankBiz.showId());
	}
	
	 
	
	
}
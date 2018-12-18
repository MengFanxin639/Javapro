package myclasspro;

import java.util.Scanner;
/**
 * ͼ�ν�����-��������ѡ����桢������
 * @version 1.0
 * @author С����
 * @2018��10��7�� ����7:39:24
 */
public class BankUi {
	private Scanner reader = new Scanner(System.in);
	private BankBiz bankBiz = new BankBiz();
	
	/**
	 * ����ѡ�����
	 */
	public BankUi() {
		 
			System.out.print("�������˺�:");
			String id = reader.next();
			System.out.print("����������:");
			String password = reader.next();
			bankBiz.add(id, password, 0);
		System.out.println("1.���"+ "\t"+"2.ȡ��"+ "\t"+
		"3.��ѯ���"+ "\t"+"4.��ʾ�ʺ�");
	}
	
	
	/**
	 * ������
	 */
	public void showMainUi(){
		while(true){
			System.out.print("��ѡ��:");
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
				System.out.println("��������");
				continue;
			}
		}
	}
	
	/**
	 * ������
	 */
	public void saveAccountView(){
		System.out.println("����������:");
		double inAccount=reader.nextDouble();
		bankBiz.saveAccount(inAccount);
	}
	
	/**
	 * ȡ�����
	 */
	public void outAccountView(){
		System.out.println("������ȡ����:");
		double outAccount=reader.nextDouble();
		if(bankBiz.outAccount(outAccount)){
			System.out.println("���ѳɹ�ȡ��"+outAccount+"��");
		}else {
			System.out.println("����~ȡ��ʧ�ܣ�");
		}
	}
	
	/**
	 * ��ʾ������
	 */
	public void showAccountView(){
		System.out.println("��ǰ���:"+bankBiz.showAccount()+"��" );
	}
	
	/**
	 * ��ʾ�˺Ž���
	 */
	public void showIdView(){
		System.out.println("��ǰ�˺�:"+bankBiz.showId());
	}
	
	 
	
	
}
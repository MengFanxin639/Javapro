import java.util.Scanner;

import javax.swing.text.StyledEditorKit.ForegroundAction;

/**
 * ��������Ϸ
 * @version 1.0
 * @author С����
 * @2018��7��9�� ����9:30:15
 */
public class wanjiaDemo {
	public static void main(String[] args) {
        //�û�Ҫ�µ�����
		//�û��µĴ���
		int guessprice = -1;
		final int price = 5000; //����
		int count = 5;          //����
		System.out.println("***********��Ϸ����*************");
		System.out.println("��������Ϸ������һ��������Ϸ��ֻ�ܲ�5��Ŷ~~");
		System.out.println("*******************************\n\n");
		for (int i = 0; i < 5; i++) {
			System.out.println("������������Ʒ�ĵ��ۣ���"+  count-- +"�Σ�");
			guessprice = new Scanner(System.in).nextInt();
			if (guessprice == price) {    //�ڲ¶Ե�����£��������
				if (count == 1) {
					System.out.println("�����ˣ��ҵĸ磡һ�ξ͹�");
					System.out.println("��Ʒ:����һ��mua");
				}else if (count >=2&& count<=3) {
					System.out.println("��ϲ�㣬�¶��ˣ�");
					System.out.println("��Ʒ����Ϊ7x");
					
				}else{
					System.out.println("��Ʒ��С�׶�����");
				}break;
				
			}else {
				if (guessprice<5000) {
					System.out.println("С��");
				}else{
					System.out.println("����");
					 
				}
				if (count == 0) {
					System.out.println("���ź�����û�л����ˣ�");
				}else
				System.out.println("�²�����������");
			}
			
		
		
		
		
		
	}	
		
}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
//		Scanner input = new Scanner(System.in);
//	
//	int exp = 0;
//	int sum = 0;
//	 
//		for(;;){
//		System.out.print("�����뱾�εĹ��׶ȣ�");
//		exp = new Scanner(System.in).nextInt();
//		if(exp < 0){
//			System.out.println("���˹��׶Ȳ���Ϊ�������˳���");
//			break;
//		}                                                           //if
//			sum +=exp; 
//			                                                        
//	}                                                               //for
//    
//
//	}        System.out.println("������Ĺ��׶�����Ϊ��" + sum);                                                       //main
//}                                                                   //class

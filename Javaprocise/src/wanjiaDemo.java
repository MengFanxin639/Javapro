import java.util.Scanner;

import javax.swing.text.StyledEditorKit.ForegroundAction;

/**
 * 猜数字游戏
 * @version 1.0
 * @author 小新新
 * @2018年7月9日 下午9:30:15
 */
public class wanjiaDemo {
	public static void main(String[] args) {
        //用户要猜的数字
		//用户猜的次数
		int guessprice = -1;
		final int price = 5000; //常量
		int count = 5;          //次数
		System.out.println("***********游戏介绍*************");
		System.out.println("猜数字游戏：我有一个数字游戏你只能猜5次哦~~");
		System.out.println("*******************************\n\n");
		for (int i = 0; i < 5; i++) {
			System.out.println("请输入神秘商品的单价：（"+  count-- +"次）");
			guessprice = new Scanner(System.in).nextInt();
			if (guessprice == price) {    //在猜对的情况下，计算次数
				if (count == 1) {
					System.out.println("厉害了，我的哥！一次就过");
					System.out.println("奖品:给你一个mua");
				}else if (count >=2&& count<=3) {
					System.out.println("恭喜你，猜对了！");
					System.out.println("奖品，华为7x");
					
				}else{
					System.out.println("奖品，小米耳机！");
				}break;
				
			}else {
				if (guessprice<5000) {
					System.out.println("小了");
				}else{
					System.out.println("大了");
					 
				}
				if (count == 0) {
					System.out.println("很遗憾，你没有机会了！");
				}else
				System.out.println("猜测错误，请继续！");
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
//		System.out.print("请输入本次的贡献度：");
//		exp = new Scanner(System.in).nextInt();
//		if(exp < 0){
//			System.out.println("个人贡献度不能为负数，退出！");
//			break;
//		}                                                           //if
//			sum +=exp; 
//			                                                        
//	}                                                               //for
//    
//
//	}        System.out.println("你输入的贡献度总数为：" + sum);                                                       //main
//}                                                                   //class

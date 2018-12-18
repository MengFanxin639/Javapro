package ClassPro;

import java.util.Scanner;

/**
 * 
 * @version 1.0
 * @author 小新新
 * @2018年8月25日 下午1:34:51
 * 
 * 2． 循环语句练习 
	  程序功能：运行程序后从键盘输入数字 1/2/3 后，可显示抽奖得到的奖品；如果输入其它数字或	**字符**显示
		“没有奖品给你!”。 此抽奖过程可以反复执行。
 */

public class pro22 {
	public static void main(String[] args) {
		while(true){
			System.out.print("请输入：");
			char num = new Scanner(System.in).nextLine().charAt(0);
			int number=num;
			switch (num) {
			case '1':
				System.out.println("给你荣耀7x你要不要?");
				break;
			case '2':
				System.out.println("给你荣耀7x你要不要?");
				break;
			case '3':
				System.out.println("给你荣耀7x你要不要?");
				break;
			default: System.out.println("没有奖品给你~");
				break;
			}
			}
		}}
		
	
	
	
		
	



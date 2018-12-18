import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

/**
 * 使用方法打印日历
 * @version 1.0
 * @author 小新新
 * @2018年7月18日 下午12:46:46
 */

public class PrintCalendar {
	public static int year = Integer.MIN_VALUE;
	public static int month = Integer.MIN_VALUE;
	public static void main(String[] args) {
		 
		PrintCalendar();
	}
	


s	private static void PrintCalendar(){
//		/**
//		 * 输入年份，约分
		input                                                                                                                                                                                                                                                                                                                                  Dg  hyyaw4
//		 * 计算1900-1-1
//		 * 打印年份，约分
//		 * 打印月份标题
//		 * 内容
//		 * */
	
	}
	
	private static void InterYear() {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入年份：");
		 year = input.nextInt();
		 System.out.print("请输入月份：");
		 month = input.nextInt();
		 //  节省资源
		 input.close();
		 input = null;
		 
	}
	
	
	
	
	
	
	
	
	
}
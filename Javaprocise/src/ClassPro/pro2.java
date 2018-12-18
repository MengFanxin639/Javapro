package ClassPro;
/**
 * 
 * @version 1.0
 * @version 2.0
 * @author 小新新
 * @2018年8月25日 下午1:11:25
 *
 *1．选择语句练习
程序功能：判断某一年是否为闰年。闰年的条件是符合下面二者之一：能被 4 整除，但不能被 100 整除；
能被 4 整除，又能被 100 整除。 
 */
import java.util.Scanner;

class Year{
	private int year;
	public Year() {
	}
	public Year(int year) {
		this.year = year;
	}
	public void isyear(int year){
		if (year % 4 == 0 && year % 100 != 0 || year % 400 ==0) {
			System.out.println(year + "是闰年！");
		}else{System.out.println(year + "不是闰年！");}
	}
}

public class pro2 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("请输入年份：");
		int year = reader.nextInt();
		Year oneYear = new Year(year);
		oneYear.isyear(year);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Scanner reader = new Scanner(System.in);
//		System.out.print("请输入年份：");
//		int year = reader.nextInt();
//		if (year % 4 == 0 && year % 100 != 0 || year % 400 ==0) {
//			System.out.println(year + "是闰年！");
//		}else{System.out.println(year + "不是闰年！");}
		 
	}

}

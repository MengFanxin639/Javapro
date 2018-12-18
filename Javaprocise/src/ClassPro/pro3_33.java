package ClassPro;

import java.util.Scanner;

/**
 * 
 * @version 1.0
 * @author 小新新
 * @2018年8月26日 下午9:30:06
 * 
 * *********2、编写程序，定义一个日期类，再定义一个类，用以判断日期类对象是否是闰年。
 */
class date{
	private int year;		//年
	private int month;		//月
	private int day;		//日
	
	public date(int year){
		this.year=year;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		if (year % 4 == 0 && year % 100 != 0 || year % 400 ==0) {
			 sb.append("闰年");
//			System.out.println("闰年");
		}else {
			sb.append("不是闰年");
//			System.out.println("不是闰年");
		}
	
		return sb.toString();
	}
	
}







public class pro3_33 {
public static void main(String[] args) {
	Scanner reader=new Scanner(System.in);
	while(true){
	System.out.print("输入：");
	int year =reader.nextInt();
	date someday = new date(year);
//	someday.isyear(2008);
	System.out.println(someday);
}
}

}

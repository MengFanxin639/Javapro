package ClassPro;

import java.util.Scanner;

/**
 * 
 * @version 1.0
 * @author С����
 * @2018��8��26�� ����9:30:06
 * 
 * *********2����д���򣬶���һ�������࣬�ٶ���һ���࣬�����ж�����������Ƿ������ꡣ
 */
class date{
	private int year;		//��
	private int month;		//��
	private int day;		//��
	
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
			 sb.append("����");
//			System.out.println("����");
		}else {
			sb.append("��������");
//			System.out.println("��������");
		}
	
		return sb.toString();
	}
	
}







public class pro3_33 {
public static void main(String[] args) {
	Scanner reader=new Scanner(System.in);
	while(true){
	System.out.print("���룺");
	int year =reader.nextInt();
	date someday = new date(year);
//	someday.isyear(2008);
	System.out.println(someday);
}
}

}

package ClassPro;

import java.util.Scanner;

/**
 * 
 * @version 1.0
 * @author 小新新
 * @2018年8月28日 下午12:35:01
 */
/*  MathDemo类，类的内部重载round（）方法，实现对单精度、双精度类型数据进行四舍五入的功能，
 * 要处理的实型数据作为参数，方法体最后将得到的结果返回  */
class MathDemo{
	int round(float a) {
		int b = (int)a;
		if (a - b >= 0.5) {
			return b + 1;
		}else {
			return b;
		}
	}
	long round(double a){
		long b = (long)a;
		if (a - b >= 0.5) {
			return b+1;
		}else {
			return b;
		}
	}
}
public class pro4_4 {
public static void main(String[] args) {
	Scanner reader = new Scanner(System.in);
	MathDemo text = new MathDemo();
	System.out.println(text.round(6.6));
}
}

package ClassPro;

import java.util.Scanner;

/**
 * 
 * @version 1.0
 * @author С����
 * @2018��8��28�� ����12:35:01
 */
/*  MathDemo�࣬����ڲ�����round����������ʵ�ֶԵ����ȡ�˫�����������ݽ�����������Ĺ��ܣ�
 * Ҫ�����ʵ��������Ϊ��������������󽫵õ��Ľ������  */
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

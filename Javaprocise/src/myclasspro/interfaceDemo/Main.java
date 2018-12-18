package myclasspro.interfaceDemo;

import java.util.Scanner;
/**
 * 测试类
 * @version 1.0
 * @author 小新新
 * @2018年11月14日 下午6:58:22
 */
public class Main {

	public static void main(String[] args) {

		User unKnowUser = null;
		Scanner reader = new Scanner(System.in);
		System.out.print("请输入消费金额:");
		double saveMoney = reader.nextDouble();
		System.out.println("普通用户1\tVIP2");
		int check = reader.nextInt();
		
		System.out.println("********欢迎光临********");
		if (1 == check ) {
			unKnowUser = new User("VIP了不起啊", saveMoney);
		}else if (2 == check) {
			unKnowUser = new Vip("就是了不起", saveMoney);
		}else {
			System.out.println();
		}
		System.out.println(unKnowUser);
		System.out.println("********谢谢惠顾********");
	}

}

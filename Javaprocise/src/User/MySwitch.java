package User;

import java.util.Scanner;

public class MySwitch {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入成绩：");
		int score = input.nextInt();
		while(true){
			if (score>100) {
				System.out.println("你怕是神仙！");
				break;}
		if (score>=90) {
			System.out.println("该学生成绩为优！");
			break;
		}if (score>=80) {
			System.out.println("该学生成绩为良！");
			break;
		}if (score>=70) {
			System.out.println("该学生成绩为中！");
			break;
		}if (score>=60) {
			System.out.println("该学生成绩合格！");
			break;
		}if (score<60) {
			System.out.println("该学生成绩不及格！");
			break;
		}if (score<0) {
			System.out.println("输入不合法，请重新输入！");
			continue;
		}
		}
	}}


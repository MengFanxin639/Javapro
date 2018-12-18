package myclasspro;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 实现循环输入判断
 * @version 1.0->2.0 ****Bug修复：当输入负数的时候也显示不及格  、死循环....
 * @author
 * @2018年8月24日 下午12:39:34
 */

//************有待优化，有隐形bug*************
public class MyScore {

	public static void main(String[] args) {

		float x = 0;   //建议变量名设置成比较好记的，score
		//x = Integer.parseInt(args[0]); 换成键盘输入比较好控制
		Scanner reader = new Scanner(System.in);
		while(true){
			System.out.print("请输入学生成绩（-1退出）：");
			try {
				x = reader.nextFloat();
			} catch (InputMismatchException e) {
				System.out.println(e.toString());
				System.out.println("看看是不是输错了~");
				break;
			}
			if (x == -1)break;
			if (x >100) {
				System.out.println("只能输入100以内的成绩哦~");
				continue;
			}
			if (x >= 90) {
				System.out.println("优秀");
			}else if (x >= 80) {		//执行了第一条语句不是90以上，就是90以下了，所以下面这个判断的是80-90之间
				System.out.println("良好");
			}else if (x >= 70) {
				System.out.println("中等");
			}else if (x >= 60) {
				System.out.println("及格");
			}else if (x >= 0) {					//及格的都算完了，其他的就是不及格！
				System.out.println("不及格");
			}else{
				System.out.println("输入不合法！请重新输入");
				continue;
			}

		}
		
	}

}

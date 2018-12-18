package ClassPro;

import javax.swing.JOptionPane;

public class Str_pro2 {
public static void main(String[] args) {
	while(true){
	String str = JOptionPane.showInputDialog("请输入年份：");
	int year = Integer.parseInt(str);
	if (year % 4 == 0 && year % 100 != 0 || year % 400 ==0) {
		JOptionPane.showMessageDialog(null,"闰年", "判断闰年",JOptionPane.PLAIN_MESSAGE);
	}else {
		JOptionPane.showMessageDialog(null,"不是闰年", "判断闰年",JOptionPane.PLAIN_MESSAGE);
	}
	}
}
}
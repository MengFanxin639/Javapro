package ClassPro;

import javax.swing.JOptionPane;

public class Str_pro2 {
public static void main(String[] args) {
	while(true){
	String str = JOptionPane.showInputDialog("��������ݣ�");
	int year = Integer.parseInt(str);
	if (year % 4 == 0 && year % 100 != 0 || year % 400 ==0) {
		JOptionPane.showMessageDialog(null,"����", "�ж�����",JOptionPane.PLAIN_MESSAGE);
	}else {
		JOptionPane.showMessageDialog(null,"��������", "�ж�����",JOptionPane.PLAIN_MESSAGE);
	}
	}
}
}
package User;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
/**
 * 框架升级
 * @version 3.0
 * @author 小新新
 * @2018年9月18日 下午5:47:38
 */
public class checkuserV3 {
	public static void main(String[] args) {
		JFrame frm = new JFrame("用户登录");
		frm.setSize(700, 700);
		frm.setLocationRelativeTo(null);//居中
		JPanel myPane = new JPanel();
		frm.setContentPane(myPane);
		myPane.add(new JButton("确定") );
		JLabel l1,l2,l3;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
//		l1 = new JLabel("账号：");
//		JTextField tf = new JTextField(15);
//		myPane.add(l1);
//		myPane.add(tf);
//		l2 = new JLabel("密码：");
//		JPasswordField tff=new JPasswordField(15);
//		tff.setEchoChar('*');//回显
//		myPane.add(l2);
//		myPane.add(tff);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setVisible(true);
	}
}

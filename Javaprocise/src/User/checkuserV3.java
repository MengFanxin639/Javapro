package User;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
/**
 * �������
 * @version 3.0
 * @author С����
 * @2018��9��18�� ����5:47:38
 */
public class checkuserV3 {
	public static void main(String[] args) {
		JFrame frm = new JFrame("�û���¼");
		frm.setSize(700, 700);
		frm.setLocationRelativeTo(null);//����
		JPanel myPane = new JPanel();
		frm.setContentPane(myPane);
		myPane.add(new JButton("ȷ��") );
		JLabel l1,l2,l3;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
//		l1 = new JLabel("�˺ţ�");
//		JTextField tf = new JTextField(15);
//		myPane.add(l1);
//		myPane.add(tf);
//		l2 = new JLabel("���룺");
//		JPasswordField tff=new JPasswordField(15);
//		tff.setEchoChar('*');//����
//		myPane.add(l2);
//		myPane.add(tff);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setVisible(true);
	}
}

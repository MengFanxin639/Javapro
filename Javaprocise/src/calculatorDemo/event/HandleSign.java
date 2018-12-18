package calculatorDemo.event;

import java.awt.event.*;

import javax.swing.JTextField;

import calculatorDemo.MainFrame;
/**
 * ���������ŵ����¼�
 * @version 1.0
 * @author С����
 * @2018��12��3�� ����3:48:04
 */
public class HandleSign implements ActionListener {
	JTextField txtShow;
	public HandleSign(JTextField txtShow) {
		 this.txtShow=txtShow;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		 	String string=MainFrame.txtShow.getText();
		 	if (string.charAt(0) == '-') {
				string=string.substring(1, string.length());
			}else string="-"+string;
		 	MainFrame.txtShow.setText(string);
		 	MainFrame.lastClick=e.getActionCommand();
	}

}

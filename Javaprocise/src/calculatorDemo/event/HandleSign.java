package calculatorDemo.event;

import java.awt.event.*;

import javax.swing.JTextField;

import calculatorDemo.MainFrame;
/**
 * 处理正负号单击事件
 * @version 1.0
 * @author 小新新
 * @2018年12月3日 下午3:48:04
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

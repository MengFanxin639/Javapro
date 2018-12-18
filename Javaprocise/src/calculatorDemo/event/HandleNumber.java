package calculatorDemo.event;

import java.awt.event.*;

import javax.swing.JTextField;

import calculatorDemo.MainFrame;

/**
 * 处理0-9数字单击事件
 * @version 1.0
 * @author 小新新
 * @2018年12月3日 下午3:41:10
 */
public class HandleNumber implements ActionListener{
	JTextField txtShow;
	
	public HandleNumber(JTextField txt) {
		this.txtShow=txt;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String num = e.getActionCommand();
		String str = txtShow.getText();
		if (MainFrame.lastIsOperator()) {
			txtShow.setText(num);
		}else {
			if (str.equals("0")) {
				txtShow.setText(num);
			}else {
				txtShow.setText(str + num);
			}
		}
		MainFrame.lastClick = e.getActionCommand();
	}

}

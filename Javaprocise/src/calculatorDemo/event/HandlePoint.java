package calculatorDemo.event;

import java.awt.event.*;

import javax.swing.JTextField;

import calculatorDemo.MainFrame;

/**
 * 处理小数点单击事件
 * @version 1.0
 * @author 小新新
 * @2018年12月3日 下午3:46:39
 */
public class HandlePoint implements ActionListener {

	JTextField txtShow;
	String[] operator;
	public HandlePoint(JTextField txtShow, String[] operator) {
		this.txtShow = txtShow;
		this.operator = operator;
	}


	
	@Override
	public void actionPerformed(ActionEvent e) {
		String string = MainFrame.txtShow.getText();
		if (MainFrame.lastIsOperator()) {
			operator[0] = MainFrame.txtShow.getText();
			MainFrame.txtShow.setText("0");
		}else {
			if (string.indexOf(".") == -1) {
				string=string+".";
				MainFrame.txtShow.setText(string);
			}
			MainFrame.lastClick = e.getActionCommand();
		}
		
	}

	
}

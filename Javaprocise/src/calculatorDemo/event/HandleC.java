package calculatorDemo.event;

import java.awt.event.*;

import javax.swing.JTextField;

import calculatorDemo.MainFrame;
/**
 * 处理清空C单击事件
 * @version 1.0
 * @author 小新新
 * @2018年12月3日 下午3:53:05
 */
public class HandleC implements ActionListener {

	JTextField txtShow;
	String[] operator;
	
	
	
	public HandleC(JTextField txtShow, String[] operator) {
		this.txtShow = txtShow;
		this.operator = operator;
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		MainFrame.txtShow.setText("0");
		 operator[0] = "0";
		 operator[1] = "";
		 operator[2] = "";
		 MainFrame.lastClick = e.getActionCommand();
		 
		 
		 
		 
	}

}

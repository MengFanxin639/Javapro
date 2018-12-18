package calculatorDemo.event;

import java.awt.event.*;

import javax.swing.JTextField;

import calculatorDemo.MainFrame;
/**
 * 处理退格单击事件
 * @version 1.0
 * @author 小新新
 * @2018年12月3日 下午3:43:48
 */
public class HandleBack implements ActionListener{

	JTextField txtShow;
	public HandleBack(JTextField txtShow) {
		 this.txtShow=txtShow;
		 
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		 String s = MainFrame.txtShow.getText();
		 if ((s.length() == 2 && s.charAt(0) == '-') ||s.length() == 1) {
			s = "0";
			MainFrame.txtShow.setText(s);
		}else if (s.length() > 1) {
			s=s.substring(0, s.length() - 1);
			MainFrame.txtShow.setText(s);
		}
		 MainFrame.lastClick = e.getActionCommand();
		
	}

}

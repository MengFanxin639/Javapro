package calculatorDemo.event;

import java.awt.event.*;

import calculatorDemo.MainFrame;
/**
 * 处理关闭按钮单击事件
 * @version 1.0
 * @author 小新新
 * @2018年12月3日 下午3:53:59
 */
public class HandleExit implements ActionListener {

	public HandleExit() {
		 
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		 System.exit(0);
		 MainFrame.lastClick = e.getActionCommand();

	}

}

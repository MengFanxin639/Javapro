package calculatorDemo.event;

import java.awt.event.*;

import calculatorDemo.MainFrame;
/**
 * ����رհ�ť�����¼�
 * @version 1.0
 * @author С����
 * @2018��12��3�� ����3:53:59
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

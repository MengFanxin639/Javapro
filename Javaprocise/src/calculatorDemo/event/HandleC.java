package calculatorDemo.event;

import java.awt.event.*;

import javax.swing.JTextField;

import calculatorDemo.MainFrame;
/**
 * �������C�����¼�
 * @version 1.0
 * @author С����
 * @2018��12��3�� ����3:53:05
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

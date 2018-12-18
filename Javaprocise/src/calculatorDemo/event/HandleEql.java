package calculatorDemo.event;

import java.awt.event.*;

import javax.swing.JTextField;

import calculatorDemo.MainFrame;
/**
 * ����Ⱥ�=�����¼�
 * @version 1.0
 * @author С����
 * @2018��12��3�� ����3:48:56
 */
public class HandleEql implements ActionListener {

	JTextField txtShow;
	String[] operator;
	public HandleEql(JTextField txtShow, String[] operator) {
		this.txtShow = txtShow;
		this.operator = operator;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		 String string=MainFrame.txtShow.getText();
		 if (!operator[1].equals("")) {
			if (MainFrame.lastIsOperator() && !MainFrame.lastClick.equals("=")) {
				operator[0]=operator[2]=string;
			}else operator[2]=string;
			String res = calculate();
			MainFrame.txtShow.setText(res);
			operator[1]="";
		}
		 MainFrame.lastClick=e.getActionCommand();

	}

	String calculate(){
		double x1, x2;
		String result =null;
		char op=operator[1].charAt(0);
		x1=Double.parseDouble(operator[0]);
		x2=Double.parseDouble(operator[2]);
		switch (op) {
		case '+':
			result=x1+x2+"";	
			break;
		case '-':
			result=x1-x2+"";	
			break;
		case '*':
			result=x1*x2+"";	
			break;
		case '/':
			if (x2!=0) {
				result=x1/x2+"";
			}else {
				result="��������Ϊ0";
			}
			break;
	}
		return result;
		}
	}

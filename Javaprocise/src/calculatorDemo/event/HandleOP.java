package calculatorDemo.event;

import java.awt.event.*;

import javax.swing.JTextField;

import calculatorDemo.MainFrame;
/**
 * 处理运算符+ - * /单击事件
 * @version 1.0
 * @author 小新新
 * @2018年12月3日 下午3:49:57
 */
public class HandleOP implements ActionListener {
	JTextField txtShow;
	String[] operator;
	
	public HandleOP(JTextField txtShow, String[] operator) {
		this.txtShow = txtShow;
		this.operator = operator;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		 if (operator[1].equals("") || MainFrame.lastIsOperator()) {
			operator[0]=MainFrame.txtShow.getText();
			operator[1]=e.getActionCommand();
		}else {
			operator[2]=MainFrame.txtShow.getText();
			String res =calculate();
			MainFrame.txtShow.setText(res);
			operator[0]=res;
			operator[1]=e.getActionCommand();
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
				result="除数不能为0";
			}
			break;
	}
		return result;
		}

}

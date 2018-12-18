package myclasspro;

import java.awt.Cursor;
import java.awt.Window;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;
/**
 * 登录界面监听-鼠标监听处理
 * @version 1.0
 * @author 小新新
 * @2018年12月12日 下午7:26:50
 */
public class LoginHomeWorks extends JFrame{

	public static void main(String[] args) {
		new LoginHomeWorks("登录界面监听-鼠标监听处理演示");
	}

	private JPanel panel;
	private JLabel labelID;
	private JLabel labelPassword;
	private JTextField textFieldID;
	private JTextField textFieldPassword;
	private JButton buttonOK;
	private JButton buttonCon;

	LoginHomeWorks(){}
	LoginHomeWorks(String title){
		super(title);
		init();
		this.setContentPane(panel);
		this.setSize(280, 250);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private void init() {
		 panel = new JPanel();
		 labelID = new JLabel("用 户 名");
		 labelPassword = new JLabel("密      码");
		 textFieldID = new JTextField(15);
		 textFieldPassword = new JTextField(15);
		 buttonOK = new JButton("确 定");
		 buttonCon = new JButton("取 消");
		 panel.add(labelID);
		 panel.add(textFieldID);
		 panel.add(labelPassword);
		 panel.add(textFieldPassword);
		 panel.add(buttonOK);
		 panel.add(buttonCon);
		 
		 buttonOK.addMouseListener(new MouseListener() {
			@Override
			public void mouseReleased(MouseEvent arg0) {}
			@Override
			public void mousePressed(MouseEvent arg0) {}
			@Override
			public void mouseExited(MouseEvent arg0) {}
			@Override
			public void mouseEntered(MouseEvent arg0) {}
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if (!(textFieldID.getText().equals("mfx") && textFieldPassword.getText().equals("000000"))) {
					JOptionPane.showMessageDialog(null, "用户名或密码错误", "提示信息", JOptionPane.ERROR_MESSAGE);
				}else{
					JOptionPane.showMessageDialog(null, "登录成功", "提示信息", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		 buttonCon.addMouseListener(new MouseListener() {
			 	@Override
				public void mouseReleased(MouseEvent arg0) {}
				@Override
				public void mousePressed(MouseEvent arg0) {}
				@Override
				public void mouseExited(MouseEvent arg0) {}
				@Override
				public void mouseEntered(MouseEvent arg0) {
					setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				@Override
				public void mouseClicked(MouseEvent arg0) {
					textFieldID.setText("");
					textFieldPassword.setText("");
			}
		});
		 
	}
	
}

package User;

import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * ���񲼾���ʾ
 * @version 1.0
 * @author С����
 * @2018��9��22�� ����7:35:11
 */
public class gridLayout extends JFrame {
	//�������
	int size=9;
	JButton jbs[]=new JButton[size];
	
	
	public static void main(String[] args) {
		gridLayout gg=new gridLayout();
	}
	
	public gridLayout() {
		
		//�������
		for (int i = 0; i < 9; i++) {
			jbs[i]=new JButton(String.valueOf(i));
			
		}
		
		//�������񲼾� Ĭ�ϰ�����
		this.setLayout(new GridLayout(3, 3,10,10));
		
		//������
		for (int j = 0; j < 9; j++) {
			this.add(jbs[j]);
		}
		
		//���ô���
		this.setTitle("���񲼾���ʾ");
		this.setSize(400,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocation(500, 400);
		
		//��ʾ
		this.setVisible(true);
		
	}
	
	
	
	
	
	
	
}

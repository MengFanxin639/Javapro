import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
/**
 * BorderLayout�߽粼�� jframe jdialog Ĭ�ϲ��ֹ�����
 * @version 1.0
 * @author С����
 * @2018��9��22�� ����5:16:04
 */
public class BorderLayoutDemo extends JFrame{
	JButton jb1,jb2,jb3,jb4,jb5;
	
	
	public static void main(String[] args) {
		BorderLayoutDemo jf=new BorderLayoutDemo();
		
		
		
	}
	public BorderLayoutDemo() {
		//�������
		jb1=new JButton("�в�");
		jb2=new JButton("����");
		jb3=new JButton("����");
		jb4=new JButton("�ϲ�");
		jb5=new JButton("����");
		
		//��Ӹ������
		this.add(jb1,BorderLayout.CENTER);
		this.add(jb2, BorderLayout.NORTH);
		this.add(jb3, BorderLayout.EAST);
		this.add(jb4, BorderLayout.SOUTH);
		this.add(jb5, BorderLayout.WEST);
		
		//���ô�������
		this.setTitle("�߽粼�ֵ���ʾ");
		this.setSize(500,300);
		this.setLocation(400,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//��ʾ
		this.setVisible(true);
		
		
		
		
		
		
		
		
		
	}
	
	
	
}

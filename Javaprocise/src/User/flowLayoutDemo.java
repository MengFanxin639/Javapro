package User;
/**
 * ��ʽ���ֵ���ʾ
 */
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class flowLayoutDemo extends JFrame{
	JButton jb1,jb2,jb3,jb4,jb5,jb6;
	
	public static void main(String[] args) {
		flowLayoutDemo dFlowLayoutDemo=new flowLayoutDemo();
	}

	public flowLayoutDemo() {
		//�������
		jb1=new JButton("����");
		jb2=new JButton("�ŷ�");
		jb3=new JButton("����");
		jb4=new JButton("��");
		jb5=new JButton("����");
		jb6=new JButton("κ��");
		
		//������
		this.add(jb1);
		this.add(jb2);	
		this.add(jb3);	
		this.add(jb4);	
		this.add(jb5);	
		this.add(jb6);	
		
		//���ò��ֹ�����
		this.setLayout(new FlowLayout());
		
		//���ô�������
		this.setTitle("��ʽ���ֵ���ʾ");
		this.setSize(500,300);
		this.setLocation(400,300);
		//���ܸı䴰�ڴ�С
		this.setResizable(false);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//��ʾ
		this.setVisible(true); 
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}

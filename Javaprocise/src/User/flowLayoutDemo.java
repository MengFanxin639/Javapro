package User;
/**
 * 流式布局的演示
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
		//创建组件
		jb1=new JButton("关羽");
		jb2=new JButton("张飞");
		jb3=new JButton("赵云");
		jb4=new JButton("马超");
		jb5=new JButton("黄忠");
		jb6=new JButton("魏延");
		
		//添加组件
		this.add(jb1);
		this.add(jb2);	
		this.add(jb3);	
		this.add(jb4);	
		this.add(jb5);	
		this.add(jb6);	
		
		//设置布局管理器
		this.setLayout(new FlowLayout());
		
		//设置窗体属性
		this.setTitle("流式布局的演示");
		this.setSize(500,300);
		this.setLocation(400,300);
		//不能改变窗口大小
		this.setResizable(false);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//显示
		this.setVisible(true); 
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}

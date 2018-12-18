import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
/**
 * BorderLayout边界布局 jframe jdialog 默认布局管理器
 * @version 1.0
 * @author 小新新
 * @2018年9月22日 下午5:16:04
 */
public class BorderLayoutDemo extends JFrame{
	JButton jb1,jb2,jb3,jb4,jb5;
	
	
	public static void main(String[] args) {
		BorderLayoutDemo jf=new BorderLayoutDemo();
		
		
		
	}
	public BorderLayoutDemo() {
		//创建组件
		jb1=new JButton("中部");
		jb2=new JButton("北部");
		jb3=new JButton("东部");
		jb4=new JButton("南部");
		jb5=new JButton("西部");
		
		//添加各个组件
		this.add(jb1,BorderLayout.CENTER);
		this.add(jb2, BorderLayout.NORTH);
		this.add(jb3, BorderLayout.EAST);
		this.add(jb4, BorderLayout.SOUTH);
		this.add(jb5, BorderLayout.WEST);
		
		//设置窗体属性
		this.setTitle("边界布局的演示");
		this.setSize(500,300);
		this.setLocation(400,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//显示
		this.setVisible(true);
		
		
		
		
		
		
		
		
		
	}
	
	
	
}

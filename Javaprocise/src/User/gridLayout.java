package User;

import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * 网格布局演示
 * @version 1.0
 * @author 小新新
 * @2018年9月22日 下午7:35:11
 */
public class gridLayout extends JFrame {
	//定义组件
	int size=9;
	JButton jbs[]=new JButton[size];
	
	
	public static void main(String[] args) {
		gridLayout gg=new gridLayout();
	}
	
	public gridLayout() {
		
		//创建组件
		for (int i = 0; i < 9; i++) {
			jbs[i]=new JButton(String.valueOf(i));
			
		}
		
		//设置网格布局 默认包布局
		this.setLayout(new GridLayout(3, 3,10,10));
		
		//添加组件
		for (int j = 0; j < 9; j++) {
			this.add(jbs[j]);
		}
		
		//设置窗体
		this.setTitle("网格布局演示");
		this.setSize(400,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocation(500, 400);
		
		//显示
		this.setVisible(true);
		
	}
	
	
	
	
	
	
	
}

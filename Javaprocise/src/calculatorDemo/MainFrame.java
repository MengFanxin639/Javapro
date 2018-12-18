package calculatorDemo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.*;

import calculatorDemo.event.*;
/**
 * 主框架界面类-界面实现，事件监听结构搭建
 * @version 1.0
 * @author 小新新
 * @2018年12月3日 下午3:09:13
 */
public class MainFrame extends JFrame {

	
	
	private JPanel contentPane,	//框架面板
		keyPane = new JPanel(); //局部面板
	public static JTextField txtShow = new JTextField();	//北部展示区
	private JButton[] btnNumber = new JButton[10];//0-9按钮
	private JButton btnAdd;		//按钮+
	private JButton btnSub;		//-
	private JButton btnMul;		//*
	private JButton btnDiv;		///
	private JButton btnEql;		//=
	private JButton btnPoint;	//.
	private JButton btnClear;	//C清除
	private JButton btnSign;	//+/-正负号
	private JButton btnExit;	//关闭
	private JButton btnBS;		//退格
	private String[] operator = {"0","",""};	//0-9
	
	HandleNumber handleNum;
	HandleBack handleBack;
	HandlePoint handlePoint;
	HandleExit handleExit;
	HandleC handleC;
	HandleSign handleSign;
	HandleEql handleEql;
	HandleOP handleOP;
	public static String lastClick="";
	
	public MainFrame(String title) {
		super(title);
		init();
		eventAction();
		this.setVisible(true);
		this.setSize(350, 250);
		this.setLocationRelativeTo(null);
		contentPane.add(txtShow, BorderLayout.NORTH);
		contentPane.add(keyPane, BorderLayout.CENTER);
		this.setContentPane(contentPane);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	
	}

	

	private void init() {
		//创建组件
		contentPane = new JPanel(new BorderLayout());
		keyPane = new JPanel(new GridLayout(4, 5, 5, 5));
		handleNum = new HandleNumber(txtShow);
		for(int i=0;i <= 9;i++) {
			btnNumber[i] = new JButton(Integer.toString(i));
			btnNumber[i].addActionListener(handleNum);
		}
		btnAdd = new JButton("+");
		btnSub = new JButton("-");
		btnMul = new JButton("*");
		btnDiv = new JButton("/");
		btnEql = new JButton("=");
		btnPoint = new JButton(".");
		btnClear = new JButton("C");
		btnSign = new JButton("+/-");
		btnExit = new JButton("关闭");
		btnBS = new JButton("退格");
		
		//txtShow文本框的相关设置
		txtShow.setFont(new Font("宋体", Font.PLAIN, 28));
		txtShow.setBackground(Color.WHITE);
		txtShow.setForeground(Color.BLUE);
		txtShow.setHorizontalAlignment(JTextField.RIGHT);//右对齐
		txtShow.setEnabled(false);
		txtShow.setText("0");
		
		//添加组件
		keyPane.add(btnNumber[7]);
		keyPane.add(btnNumber[8]);
		keyPane.add(btnNumber[9]);
		keyPane.add(btnDiv);
		keyPane.add(btnExit);
		keyPane.add(btnNumber[4]);
		keyPane.add(btnNumber[5]);
		keyPane.add(btnNumber[6]);
		keyPane.add(btnMul);
		keyPane.add(btnBS);
		keyPane.add(btnNumber[1]);
		keyPane.add(btnNumber[2]);
		keyPane.add(btnNumber[3]);
		keyPane.add(btnSub);
		keyPane.add(btnClear);
		keyPane.add(btnNumber[0]);
		keyPane.add(btnSign);
		keyPane.add(btnPoint);
		keyPane.add(btnAdd);
		keyPane.add(btnEql);
		
		
	}
	
	public static boolean lastIsOperator(){
		String string=lastClick;
		if (string.equals("+")  || string.equals("-") || string.equals("*") || string.equals("/") || string.equals("=")) 
			return true;
			else 
				return false;
		}
		
	

	/**
	 * 事件处理-添加监听
	 */
	private void eventAction() {
		btnBS.addActionListener(new HandleBack(txtShow));
		btnEql.addActionListener(new HandleEql(txtShow, operator));
		btnClear.addActionListener(new HandleC(txtShow, operator));
		btnExit.addActionListener(new HandleExit());
		btnPoint.addActionListener(new HandlePoint(txtShow, operator));
		btnSign.addActionListener(new HandleSign(txtShow));
		handleOP = new HandleOP(txtShow, operator);
		btnAdd.addActionListener(handleOP);
		btnSub.addActionListener(handleOP);
		btnMul.addActionListener(handleOP);
		btnDiv.addActionListener(handleOP);
		
	}
	
	public static void main(String[] args) {
		new MainFrame("新新版计算器");
	}
	
	
	
	
	
	
	


}

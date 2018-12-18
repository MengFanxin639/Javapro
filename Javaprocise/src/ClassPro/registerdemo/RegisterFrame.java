package ClassPro.registerdemo;

import java.awt.Image;

import javax.swing.*;
/**
 * 注册界面的演示
 * @version 1.0
 * @author 小新新
 * @2018年12月3日 下午12:19:13
 */
public class RegisterFrame extends JFrame {

	public static void main(String[] args) {
		RegisterFrame frame = new RegisterFrame("注册界面");
	}
	
	final Image jpg_ma = new ImageIcon("D:/javatext/Javaprocise/src/ClassPro/registerdemo/images/ma.jpg").getImage();
	
	//定义组件
	private JPanel jPanel;		//内容面板
	private JLabel label_user,	//用户名
		label_password,			//密码
		label_confirmPassword,	//确认密码
		label_desc,				//个人简介
		label_sex,				//性别
		label_cardType,			//证件类型
		label_cardId,			//证件号码
		label_agreeItem;		//同意服务条款
	private JTextField jField_user;	//用户名框
	private JPasswordField jField_password;	//密码框
	private JPasswordField jField_confirmPassword;	//确认密码框
	private JTextArea jArea_desc;	//个人简介展示区
	private ButtonGroup group_sex;	//性别单选组
	private JRadioButton jRadioButton_man;	//单选框男
	private JRadioButton jRadioButton_woman;	//单选框女
	private JComboBox jComboBox_cardType;	//证件类型	框	
	private JTextField jField_cardId;	//证件号码输入框
	private JCheckBox jCheckBox_agreeItem;	//同意服务条款勾选框	
	
	String[] cardName = {"身份证","护照","学生证","驾驶证","军官证","其他"};
	
	public RegisterFrame(String title) {
		super(title);
		init();
		this.setIconImage(new ImageIcon(jpg_ma).getImage());
		//挂载面板
		this.setVisible(true);
		this.setSize(320, 400);
		this.setLocationRelativeTo(null);
		this.setContentPane(jPanel);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	/**
	 * 初始化组件
	 */
	private void init() {
		jPanel = new JPanel();
		//上部分创建组件
		label_user = new JLabel("用  户  名:");
		label_password = new JLabel("密          码:");
		label_confirmPassword = new JLabel("确认密码:");
		jField_user = new JTextField(20);
		jField_password = new JPasswordField(20);
		jField_confirmPassword = new JPasswordField(20);
	
		//上部分添加组件
		jPanel.add(label_user);
		jPanel.add(jField_user);
		jPanel.add(label_password);
		jPanel.add(jField_password);
		jPanel.add(label_confirmPassword);
		jPanel.add(jField_confirmPassword);
		
		
		//下部分创建组件
		label_desc = new JLabel("个人简介:");
		jArea_desc = new JTextArea(10,20);
		label_sex = new JLabel("性       别:");
		group_sex = new ButtonGroup();
		jRadioButton_man = new JRadioButton("男");
		jRadioButton_woman = new JRadioButton("女");
		label_cardType = new JLabel("证件类型:");
		jComboBox_cardType = new JComboBox(cardName);
		label_cardId = new JLabel("证件号码:");
		jField_cardId = new JTextField(20);
		label_agreeItem = new JLabel("同意服务条款:");
		jCheckBox_agreeItem = new JCheckBox("我已经看过并同意使用协议");
		
		//下部分添加组件
		jPanel.add(label_desc);
		jPanel.add(jArea_desc);
		jPanel.add(label_sex);
		group_sex.add(jRadioButton_man);
		group_sex.add(jRadioButton_woman);
		jPanel.add(jRadioButton_man);
		jPanel.add(jRadioButton_woman);
		jPanel.add(label_cardType);
		jPanel.add(jComboBox_cardType);
		jPanel.add(label_cardId);
		jPanel.add(jField_cardId);
		jPanel.add(label_agreeItem);
		jPanel.add(jCheckBox_agreeItem);
		
		
		
	}
	

}
